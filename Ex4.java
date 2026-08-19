import java.util.Scanner;
abstract class Shape
{
int d1,d2;
Shape(int d1,int d2)
{
this.d1=d1;
this.d2=d2;
}
abstract void printArea();
}
class Rectangle extends Shape{
Rectangle(int l,int b){
super(l,b);
}
void printArea(){
System.out.println("Area:"+(d1*d2));
}
}
class Triangle extends Shape{
Triangle(int base,int h){
super(base,h);
}
void printArea(){
System.out.println("Area:"+(0.5*d1*d2));
}
}
class Circle extends Shape{
Circle(int radius){
super(radius,0);
}
void printArea(){
System.out.println("Area:"+(3.14*d1*d1));
}
}
class Ex4{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length and breadth of a rectangle:");
int l = sc.nextInt();
int b = sc.nextInt();
System.out.println("Enter base and height of a triangle:");
int base = sc.nextInt();
int h = sc.nextInt();
System.out.println("Enter radius of a circle:");
int r = sc.nextInt();
Shape s1= new Rectangle(l,b);
s1.printArea();
Shape s2= new Triangle(base,h);
s2.printArea();
Shape s3 = new Circle(r);
s3.printArea();
}
}
