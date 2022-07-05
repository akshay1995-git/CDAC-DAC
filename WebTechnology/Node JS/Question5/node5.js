module.exports={
    palindrome:function(str1){
         var str2=" ";
         for(var i=str1.length-1;i>=0;i--){
             str2+=str1[i];
         }
         if(str2==str1){
             console.log("String is palindrome")
         }
         else{
            console.log("String is not palindrome")
         }
    },
    upper:function(str1){
        var str2=str1.toUpperCase();
        console.log("uppercase of str :"+str2);
    },
    search:function(){
        var array=["www.google.com","www.msn.com","www.facebook.com","en.m.wikipedia.com",
                   "in.ans.yahoo.com","codeh.gitbook.com"];
        var count=0;
        for(var j=0;j<array.length;j++){
            if(array[j].startsWith("www")){
                count++
            }
        }
       console.log("Count of word start with www : "+count);

    }
}