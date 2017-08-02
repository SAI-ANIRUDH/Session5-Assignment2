package assignment5; // package is compulsory.
public class Assignment5_2
/*
 * This program is helpful for knowing the abstract class, method creation and object creation.
 */
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Figure f;
Circle c=new Circle(); // Instantiating the object for child class Circle and calling its methods. 
c.area();
c.perimeter();
c.axis();
Square s =new Square(); // Instantiating the object for child class Sqaure and calling its methods.
s.area();
s.perimeter();
s.nature();
Rectangle r = new Rectangle(); // Instantiating the object for child class Rectangle and calling its methods.
r.area();
r.perimeter();
r.nature();
f= new Circle(); // Calling the child method circle from parent abstract class Figure.
f  =new Square(); // Calling the child method Square from parent abstract class Figure
f = new Rectangle(); // Calling the child method Rectangle from parent abstract class Figure.

f.area();
f.perimeter(); // Calling the methods of the parent class Figure

	}

}
abstract class Figure{ // Creating the abstract class Figure.
	double dim1 =3.14; // Declaring and initializing the variable dim1.
	
	abstract void  area(); 
	abstract void perimeter(); // Creating abstract method area and perimeter.
	
	}
 class Circle extends Figure{ // Creating child class Circle
	
	 int a = 7; // Declaring and initializing the variable of radius of a circle.
void area() { // Calling the area method
	double res= dim1*a*a;  // calculating the area of circle.
	System.out.println("Circle area is " + res);  
}
void perimeter() { // Calling the perimeter method for circle
	double res = 2 * dim1 * a; // Calculating the perimeter of  a circle.
	System.out.println("Circle perimeter is  " + res);
}

void axis() { // Creating the method axis to show the user that Circle is a two dimension figure in X-Y axis.
	System.out.println("Two Dimension");
}

}
class Square extends Figure{ // Creating the child class Square.
	int a = 8; // Declaring and initializing the variable side of a square.
	void area() { // Calling the void area method from the parent abstract class Figure.
		double j = a * a; // Calculating the area of a square.
		System.out.println("Square area is " + j);
	}
	void perimeter() { // Calling the perimeter method from the parent abstract class Figure. 
		int k = 4 * a; // Calculating the perimeter for  a square.
		System.out.println("Square perimeter is  " + k);
	}
void nature() { // Creating the method nature to determine the nature of the Square to the user
	System.out.println("Sides of square are equal and diagonals bisects perpendicularly");
}
}
class Rectangle extends Figure{ // Creatinng the Child class Rectangle.
	int a =6;
	int b= 8;  // Declaring and initializing the sides of a rectangle.
	void area() { // Calling the method area from the parent abstract class Figure
		int g = a * b;  // CAlculating the area of a rectangle.
		System.out.println("Rectangle area is " + g);
	}
	void perimeter() { // Calling the method perimeter from the parent abstract class Figure
		int h = 2*(a+b); // calculating the perimeter of  a rectangle.
		System.out.println("Rectnagle perimeter is  " + h);
	}
	void nature() { // Creating the method nature to determine the nature of the Rectangle to the user
		System.out.println("Opposite Sides of Rectangle are equal and diagonals bisects perpendicularly");
	}
}