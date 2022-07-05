var http = require("http");
var url = require("url");
var fs = require("fs");

function process_Req(req, res) {
  //  var q = url.parse(req.url, true);
   // var file = "." + q.pathname;
    fs.readFile("welcome.html", function (err, data) {
        if (err) {
            res.writeHead(404, { 'Context_type': 'text/html' });
            res.write("404 Page Not Found");
        }
        else {
            res.writeHead(200, { 'Content-type': 'text/html' });
            res.write(data);
            res.end();
        }
    });
}

var server = http.createServer(process_Req);
server.listen(3000);
console.log("Server is listening on localhost :3000");