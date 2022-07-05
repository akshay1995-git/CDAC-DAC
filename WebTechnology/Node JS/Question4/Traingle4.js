module.exports = {
    equi: function (a, b, c) {
        if (a == b && b == c && c == a) {
            console.log("Traingle is Equilateral ");
        }
        else {
            console.log("Traingle is not Equilateral ")
        }
    },
    perimeter:function(a,b,c){
       return a+b+c;
    }

}