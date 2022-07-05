var fs=require("fs");
fs.readFile("emp.txt",function(err,data){
    if(err){
        console.log(err);
    }
    else{
        var sum=0
        var arr2=[];
        var arr1=data.toString().split("\n");
        for(let a of arr1){
             sum=sum+parseInt(a.split(":")[3]);
        }
        console.log("Sum of Salaries :" +sum);
        
        }
       
    
})