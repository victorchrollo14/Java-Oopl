package program5;

public class Sum {
	 int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	int add(int x, int y, int z) {
		int sum = x + y + z;
		return sum;
	}
	
	double add(double x, double y) {
		double sum = (x + y);
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("program to show method overloading");
		Sum s = new Sum();
		int sum1 =  s.add(10, 15);
		int sum2 = s.add(13, 13, 34);
		double sum3 = s.add(34.232, 343.323);
		System.out.println(sum1 + "\n" + sum2 + "\n" + sum3);
	}
}
