

abstract class Shape {
	abstract void draw();
}
class Circle extends Shape{
	void draw(){
		System.out.println("Drawing Circle");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class AbstractionTest1 {
	public static void main(String args[]) {
		Shape S = new Rectangle();
		S.draw();
		}
}
