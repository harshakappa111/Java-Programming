import java.util.*;
class Farmer{
	private float amount;
	private int  t;
	static private float annualInterestrate= 2.75f;
	private float si;
	
public void getLoanDetails() {
	Scanner sc =new Scanner(System.in);
	System.out.println("How much loan  amount do you want sir  ");
amount=sc.nextFloat();
	System.out.println(" How much years do you need to repay sir");
  t= sc.nextInt();
	System.out.println("The rate of interest on crop loans is   "+ annualInterestrate);
	
	
}
public void calculateInterest() {
	si=(amount*t*annualInterestrate)/100;

}


public void displaySimpleInterest() {
	System.out.println("The Simple Interest for your required amount is"+ si);
}
	
}
class Bank{
private	String name;
private	int farmerAge;
	static {
		System.out.println("Welcome to the xyz bank");
	}
	public  void  getPersonalDetails() {
		Scanner sa= new Scanner(System.in);
		
		System.out.println("Sir please enter your name");
		name =sa.nextLine();
		System.out.println(" Sir please Enter your age");
		farmerAge= sa.nextInt();
		if (farmerAge <18 ||farmerAge>60) {
		System.out.println(" Sir you are not eligible for applying the loan in our bank ");
		System.exit(0);
		}
		
		else {
			
		System.out.println(" Sir you are eligible for applying the loan in our bank");
		    System.out.println("Please follow the remaining steps ");
		}
	}  

}
public class Miniproject2 {
	public static void main (String[] args) {
		Bank b= new Bank();
	b.getPersonalDetails();

	Farmer f= new Farmer();
	f.getLoanDetails();
	f.calculateInterest();
	f.displaySimpleInterest();
System.out.println("*************************************");	
	Bank b1= new Bank();
	b1.getPersonalDetails();
	Farmer f1= new Farmer();
	f1.getLoanDetails();
	f1.calculateInterest();
	f1.displaySimpleInterest();
	}

}
