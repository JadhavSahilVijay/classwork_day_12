package classwork_day_12;
class Country{
	String country_name = "India";
	public void country() {
		System.out.println("Your country is : "+country_name);
	}
}
class State extends Country{
	String state_name = "Maharashtra";
	public void state() {
		System.out.println("State is : "+state_name);
	}
}
class Dist extends State{
	String dist = "Pune";
	public void dist() {
		System.out.println("your dist is : "+dist);
	}
}
public class q1 extends Dist{

	public static void main(String[] args) {
		q1 place = new q1();
		place.country();
		place.state();
		place.dist();
	}

}
