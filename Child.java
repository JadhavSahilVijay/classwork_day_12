package classwork_day_12;
class GrandParent{
	public void grandparent() {
		System.out.println("I am grand parent class");
	}
}
class Parent extends GrandParent{
	public void parent() {
		System.out.println("I Am Parent class");
	}
}
public class Child extends Parent{

	public void child() {
		System.out.println("I am Child class");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.grandparent();
		c.parent();
		c.child();
	}

}
