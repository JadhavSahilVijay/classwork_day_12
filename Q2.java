package classwork_day_12;
import java.util.*;
class Bank{
	int balance = 0;
	Scanner sc = new Scanner(System.in); 
	public void credit() {
		System.out.println("enter the amount to credit in your Account : ");
		this.balance += this.sc.nextInt();
		dispaly();
	}
	public void debit() {
		System.out.println("enter the amount to debit from your Account : ");
		this.balance -= this.sc.nextInt();
		dispaly();
	}
	public void dispaly() {
		System.out.println("your current balance is : "+this.balance);
	}
	
}
public class Q2 extends Bank{

	public static void main(String[] args) {
		Q2 bank = new Q2();
		bank.credit();
		bank.debit();

	}

}
