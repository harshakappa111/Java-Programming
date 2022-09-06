import java.util.*;
abstract class Shapes{
	 float area;	
	 public abstract void input();
	public abstract  void compute() ;
	public abstract  void display(); 
}
class Square extends Shapes{
 float length; 
public void input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length of the Square");
	length=sc.nextFloat();
}
public void compute() {	
	area =length*length;
}
public void display() {
  System.out.println(" Area of the Square   " + area+"ms");
}
}
class Rectangle extends Shapes{
	 float length;
	 float breadth;
	public void input() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the length of the Rectangle");
		 length= sc.nextFloat();
	     System.out.println("Enter the breadth of the Rectangle");
	     breadth= sc.nextFloat();
	}
	public void compute() {
		area=length*breadth;
	}
	public void display() {
		System.out.println(" Area of the Reactangle   " +area +"ms");
	}
}
class Circle extends Shapes{
	float radius;
	final float pie=3.14f;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of the Circle");
		radius=sc.nextFloat();
	}
	public void compute() {
		area= pie*radius*radius;
	}
	public void display() {
		System.out.println("Area of the Circle  "+area+"ms");
}
}
class Rhombus extends Shapes{
	float height;
	float base;
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the height of the Rhombus");
		height=sc.nextFloat();
		System.out.println("Enter the base of the Rhombus");
		base= sc.nextFloat();
	}
	public void compute() {
		area= height*base;
	}
	public void display() {
		System.out.println("Area of the Rhombus  "+area+"ms");
	}
}
class Area{
	public void displayInformation(Shapes s) {
		s.input();
		s.compute();
		s.display();
	}
}
public class MiniProject3 {

	public static void main(String[] args) {
		Square sr= new Square();
		Rectangle r= new Rectangle();
		Circle c= new Circle();
		Rhombus rh= new Rhombus();
		Area a= new Area();
		  a.displayInformation(sr);
		  a.displayInformation(r);
		  a.displayInformation(c);
		  a.displayInformation(rh);

		  
	}

}
