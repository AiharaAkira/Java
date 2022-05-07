
public class Cal {
	
	public static void add_free(int... a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("รัวี: " + sum);
		
	}
	
	public static void multiplies_free(int... a) {
		int sum = 1;
		for(int i = 0; i < a.length; i++) {
			sum *= a[i];
		}
		System.out.println("รัวี: " + sum);
		
	}
	
	
	public static void add(int a, int b) {
		System.out.println(a + b);
		
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
		
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
		
	}
	
	public void add(double a, double b) {
		System.out.println(a + b);
		
	}
	
	public void add(double a, double b, double c) {
		System.out.println(a + b + c);
		
	}
}
