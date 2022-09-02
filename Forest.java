// Polymorphism: one object have many forms.
// there are two types
//  1) Runtime polymorphism.
//  2) Compiletime polymorphism
class Animal{
	public void eat() {
		System.out.println("Iam Eating");
		
	}
	//Here sleep()  is inherited to all child classes of parent class (Animal).
	public void sleep() {
		System.out.println("Iam sleeping");
	}
}
class Tiger extends Animal{
	// Here  eat() is overridden method based on its own implementation.we can call this method by using 
	//child reference or parent reference (Downcasting).
	public void eat() {
		System.out.println("I eat through hunting the animals");
		
	}
	//Here color() is a specialized method of child class. we can call this method by child reference or 
	// parent reference (Downcasting).
	public void color() {
		System.out.println("orange color with blackstripes");
	}
	
}
class Monkey extends Animal{
	// Here  eat() is overridden method based on its own implementation.we can call this method by using 
   //child reference or parent reference (Downcasting).
	public void eat() {
		System.out.println("I eat through stealing the food");
	}
	//Here limbs() is a specialized method of child class. we can call this method by child reference or 
   // parent reference (Downcasting).
	public void limbs() {
		System.out.println("I have four Limbs");
	}
}
class Deer extends Animal {
	// Here  eat() is overridden method based on its own implementation.we can call this method by using 
   //child reference or parent reference (Downcasting)
	public void eat() {
		System.out.println("I eat through grazing the grass ");
	}
	//Here fastestRunning() is a specialized method of child class. we can call this method by child reference or 
    // parent reference (Downcasting)
	public void fastestRunning() {
		System.out.println("Iam one of the fastest running animals in the world");
	}
	
}
public class Forest {
public static void main (String[] args) {
	  Animal a = new Animal();
	  Tiger t= new Tiger();
	  Monkey m= new Monkey();
	  Deer d= new Deer();
	     a.eat();
	    a=t;
	    a.eat();// one object have multiple behavior
	    ((Tiger)  a).color();//Downcasting : changing the behavior parent class to child class to access
	                         // child class specialized methods.
	    a=m;
	    a.eat();// one object have multiple behavior
	    ((Monkey)  a).limbs(); 
	    a=d;
	    a.eat();// one object have multiple behavior
	    ((Deer)  a).fastestRunning();
//         ((Tiger)  a).color();
//         ((Monkey)  a).limbs(); 
//         ((Deer)  a).fastestRunning();
}
}
