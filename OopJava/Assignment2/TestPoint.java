

public class TestPoint {
    double a;
    double b;
    double c;
    TestPoint(double a,double b,double c){
      this.a=a;
      this.b=b;
      this.c=c;
    }
    
    //3.7  getDetails method to display point details
    public void getDetail(){
        System.out.println("Co-Ordinate are : "+a+" & "+b);
    }
    //3.8 isEqual & display if points are same or different
    boolean isEqual(){
        return (this.a==this.b);

    }
    public double offset(){
        return (this.a-this.c);
     
    }

    
}
