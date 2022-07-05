var http = require("http");
var url = require("url");
//var fs = require("fs");
var gr=require("./greetQ14.js")
var str=gr.greet();

function process_Req(req, res) {
            res.writeHead(200, { 'Content-type': 'text/plain' });
            res.write(str);
            res.end();
        }

var server = http.createServer(process_Req);
server.listen(3000, "localhost");
console.log("Server is listening on localhost :3000");