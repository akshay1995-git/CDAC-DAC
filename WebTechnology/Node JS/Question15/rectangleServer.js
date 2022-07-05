var http = require("http");
var url = require("url");
var rec = require("./rectangle.js")

function process_Req(req, res) {
 if (req.method == 'GET') {
        var a = url.parse(req.url, true);
       var q = a.query;
        console.log(q);
        var l = parseInt(q.len);
       
        var b = parseInt(q.breadth);
        console.log(q);
        res.writeHead(200, { 'Content-type': 'text/html' });
        res.write("Area of Rectangle : " + rec.area(l, b)+"<br>");
        res.write("Perimeter of Rectangle : " + rec.perimeter(l, b));
        res.end();
    }
    else {
        res.end("not found");
    }
}
var server = http.createServer(process_Req);
server.listen(3000, "localhost");
console.log("Server is listening on localhost :3000");