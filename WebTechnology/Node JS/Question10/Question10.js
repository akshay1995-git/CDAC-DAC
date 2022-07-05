var fs=require("fs");
var str=" "
fs.readFile("empinfo10.txt",function(err,data){
    if(err){
        console.log(err);
    }
    else{
        str=data;
        str.toString();
    }
    fs.appendFile("resignemp10.txt",str+"\n",function(err){
        if(err){
            console.log(err);
        }
    });
    fs.appendFile("resignemp10.txt","Date of Resignation : "+Date(),function(err){
        if(err){
            console.log(err);
        }
    });
});