package abc;

public class MethodExample {
	//no passing parameter as well as no return type.
	static void display() {
		System.out.println("This is a display method");
	}
	//passing parameter and no return value.
	static void add(int x, int y) {
		int sum = x + y;
		System.out.println("Sum of two number is " +sum);
	}
	//passing parameter and return value
	static int findLargest(int x, int y) { 
		if (x>y) {
			return x;
		}else {return y;
				}
	}
	public static void main(String[] args) {
		display();
		add(100,200);
		add(1,2);
		int result = findLargest(10,20);
		System.out.println("the largest number is " +result);

	}

}
