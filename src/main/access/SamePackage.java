package main.access;

public class SamePackage extends BaseClass{

	public void foo() {
		protectedMethod();
		defaultMethod();
	}
	
	public static void main(String args[]) {
		BaseClass baseClass =  new BaseClass();
		baseClass.protectedMethod();
		baseClass.defaultMethod();
	}
}
