var fs = require("fs");
var str = "" ;
var res = "" ;
fs.readFile("info.txt",function(err,data)
{
    if(err)
    {
        console.log(err);
    }
    else
    {
        str = data.toString().split('.') ;
        for(var i=1 ; i<=str.length ; i++){
        res = i+" "+str.toString().split(',')
      
        }
    }
        console.log(res);
})