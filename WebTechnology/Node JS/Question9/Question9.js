var fs=require("fs");
fs.readFile("Que9.json",function(err,data){
    if(err){
        console.log(err);
    }
    else{
        let student=JSON.parse(data);
       // console.log(student);
        for(var i=0;i<student.length;i++){
            console.log("Name :"+student[i].name+"  Phno :"+student[i].phno);
        }
    }
})