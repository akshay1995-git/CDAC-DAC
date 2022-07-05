var http=require("http");

function processRequest(req,res){
    res.writeHead(200,{'Content-type':'text/html'});
    //console.log("hello");
    res.write("<h1>Hello World</h1>");
    res.end();
}
var server=http.createServer(processRequest);
server.listen(3000,"localhost");
console.log("Server is listining on port 3000");