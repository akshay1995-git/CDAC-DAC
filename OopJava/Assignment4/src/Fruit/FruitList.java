package Fruit;
public class FruitList {
    private String name;
    private String taste;
	public FruitList(String name,String taste) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.taste=taste;	
	}
	
	public String getDetail() {
		return (this.name+"  Taste : "+this.taste);
	}

}
