/*exports.greet=function(){
    var g = new Date();
    var hour=g.getHours();
    if(hour>=6 && hour<=12){
        console.log("Good Morning");
    }
    else if(hour>12 && hour<=16){
        console.log("Good Afternoon");
    }
    else{
        console.log("Good Evening");
    }
}*/
exports.greet=()=>{
    var g = new Date();
    var hour=g.getHours();
    if(hour>=6 && hour<=12){
        console.log("Good Morning");
    }
    else if(hour>12 && hour<=16){
        console.log("Good Afternoon");
    }
    else{
        console.log("Good Evening");
    }
}