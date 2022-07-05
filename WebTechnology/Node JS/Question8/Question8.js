emp1={eid:'101',ename:'Harry',esal:'23000'}
emp2={eid:'102',ename:'Sarita',esal:'20000'}
emp3={eid:'103',ename:'Monika',esal:'27000'}
emp4={eid:'104',ename:'John',esal:'33000'}
var arr=[emp1,emp2,emp3,emp4];
var fs=require("fs");
for(let i=0;i<arr.length;i++){
     fs.appendFile("Empobj.txt",arr[i].eid+" "+arr[i].ename+" "+arr[i].esal +"\n",function(err){
         if(err){
             console.log(err);
         }
         else{
             console.log("Data is succesfully write...")
         }
         
     })
}