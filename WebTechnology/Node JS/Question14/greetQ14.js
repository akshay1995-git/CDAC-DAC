exports.greet=function(){
    var g = new Date();
    var hour=g.getHours();
    if(hour>=6 && hour<=12){
       return "Good Morning !!";
    }
    else if(hour>12 && hour<=16){
        return "Good Afternoon !!";
    }
    else{
        return "Good Evening !!";
    }
}     
