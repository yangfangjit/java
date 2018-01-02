package template;

public class Template {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Test template");
		System.out.println(foo(sb).toString());
		System.out.println(foo2(sb).toString());
		int a = 1;
		int b = 2;
		System.out.println(add(a, b));
		
		double x = 1.1;
		double y = 1.2;
		System.out.println(add(x, y));
	}

	public static <T> T foo(T t) {
		// bla bla bla
		return t;
	}
	
	public static Object foo2(Object o) {
		// bla bla bla
		return o;
	}

	public static int add(int a, int b) {
		return a + b; 
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
}
