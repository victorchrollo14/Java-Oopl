package program5;


class Box{
	// method when parameters are passed
	double length, width, height;
	Box(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	
	// no parameter is passed
	Box(){
		length = width = height = 0;
	}
	
	// only one parameter is passed
	Box(double len){
		length = width = height = len;
	}
	
	double volume() {
		return length*width*height;
	}
	
}


public class Test {
	public static void main(String[] args) {
		System.out.println("program to show constructor overloading");
		// creating an object of Box class
		Box b1 = new Box(10, 11, 15);
		Box b2 = new Box();
		Box b3 = new Box(5);
		
		System.out.println("the volume of b1: " + b1.volume());
		System.out.println("The Volume of b2: " + b2.volume());
		System.out.println("The Volume of b3: " + b3.volume());
		
	}
}
