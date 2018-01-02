package interfacepkg;

public interface Interface {
	
	int a = 0;
	
	static int b = 0;

	int foo();

	default int foo2() {
		return 0;
	}
}
