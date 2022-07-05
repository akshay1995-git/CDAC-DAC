module.exports={
    factorial:function(a){
        var fact=1;
        if(a<=2){
           console.log("Factorial :"+a);
        }
        else{
            for(var i=a;i>=1;i--){
                fact=fact*a;
            }
            console.log("Factorial :"+fact);
        }
    },
    myprime:function(a){
        var check=1;
         for(var i=2;i<a;i++){
             if(a%i==0){
                 check=0;
                 break
             }
             else{
                continue;
             }
         }
         if(check==1){
             console.log("Given number is prime");
         }
         else{
            console.log("Given number is not prime");
         }
    },
    printable:function(c){
            for(var i=1;i<=10;i++){
                console.log(i*c);
            }
    }
}
