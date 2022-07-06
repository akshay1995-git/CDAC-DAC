
public class Point2D {
	    //3.0 declaring x & y
	    double x;
	    double y;
	 //  int index;
	    //3.1 Creating Parameterized Constructor
	    public Point2D(double x,double y){
	        this.x=x;
	        this.y=y;
	       //this.index=index;
	    }
	    public String getDetail(){
	        return "X : "+this.x+" Y : "+this.y;
	    }
	    public boolean checkEqual(Point2D obj) {
	    	return (this.x==obj.x && this.y==obj.y);
	    }
		public boolean isEqual(Point2D obj) {
			// TODO Auto-generated method stub
			return false;
		}
		 public double calculateDist(Point2D next){
		        return Math.sqrt((x-next.x)*(x-next.x)+(y-next.y)*(y-next.y));
		      
		    }
}
