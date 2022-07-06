public class Point2D {
    //3.0 declaring x & y
    double x;
    double y;
    //3.1 Creating Parameterized Constructor
    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }
    //3.2 Get Detail of X and Y 
    public String getDetail(){
        return "X : "+this.x+" Y : "+this.y;
    }
    //3.3 Check
    boolean isEqual(Point2D obj){
        return (this.x==obj.x && this.y==obj.y);
    }
    //3.4 return new point having given x & y offset.
    public Point2D newMethod(Point2D ob){
       
        Point2D obj1 =new Point2D(this.x-ob.x,this.y-ob.y);
        return (obj1);
    }
    //3.5 calculateDistance method to calculate distance between current point
    public double calculateDist(Point2D next){
        return Math.sqrt((x-next.x)*(x-next.x)+(y-next.y)*(y-next.y));
       //return 5;
    }
    

}
