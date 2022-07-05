var fs = require("fs");
var str = "";
fs.readFile("book.json",function(error,data)
{
    if(error)
    {
        console.log(error);    
    }
    else 
    {
       
        fs.writeFile("book.txt", data.toString() ,function(error)
        {
            if(error)
            {
                console.log(error);
            }
        });
    }
});