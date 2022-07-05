
var fs=require("fs");
var arr=["akshay","akash","rahul","sujit","vijay"];
for(var i=0;i<arr.length;i++){
fs.appendFile("name.txt",arr[i] +"\n",function(err){
    if(err){
           console.log(err); 
    }
   
});
}
fs.readFile("name.txt",function(err,data){
    if(err){
        console.log(err); 
    }
    else{
        console.log("Asynchronous Read \n"+data.toString());
    }
})