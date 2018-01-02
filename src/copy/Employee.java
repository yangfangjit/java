package copy;

public class Employee implements Cloneable{
	
	private String name = "";
	private int age = 0;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee copy = (Employee) super.clone();
		/*String name = new String(this.name);
		copy.setName(name);*/
		return copy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Original employee", 10);
		
		Employee copy = null;
		try {
			copy = employee.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("employee equals to copy? " + (employee == copy));
		System.out.println("employee'name  equals to copy'name? " + (employee.getName() == copy.getName()));
	}

}
