package classwork_day_12;
import java.util.*;
class Rectangle{
	float length = 20.5f;
}
public class Q4 extends Rectangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q4 circle = new Q4();
		System.out.println("enter the width of rectangle : ");
		float width = sc.nextFloat();
		float area = circle.length + width;
		System.out.println("area of rectangle with fixed length that is : "+circle.length+" is "+area);
	}

}