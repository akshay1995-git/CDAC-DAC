
class Box {
    // state : non static data members : instance vars : mem allocated on heap
    private double width, depth, height;

    // add a paramterized constr to init complete state of a box
    Box(double w, double d, double height) {
        width = w;
        depth = d;
        this.height = height;
    }

   
    double getBoxVolume() {
        return width * depth * height;
    }


	public double getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

   }