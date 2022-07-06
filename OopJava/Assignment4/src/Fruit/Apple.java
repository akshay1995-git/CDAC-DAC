package Fruit;

public class Apple extends FruitList {
	public Apple(String name, String taste) {
		super(name, taste);
	}
public String getDetail() {
	return (super.getDetail());
}
}
