package annotations;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class UseCaseTracker {

	public static void trackUseCase(Class<?> cl) {
		for (Method m : cl.getMethods()) {
			UseCase useCase = m.getAnnotation(UseCase.class);
			if (useCase != null) {
				System.out.println("Found Use Case : " + useCase.id() + " " + useCase.description());
			}
		}
	}
	
	public static void main(String[] args) {
		List<Object> objects = null;
		operation(objects);
		System.out.println(objects == null ? "null" : objects.size());
		Class<?> clazz;
		try {
			clazz = Class.forName("annotations.UseCaseTracker");
			ClassLoader classLoader = clazz.getClassLoader();
			System.out.println("class loader is " + classLoader.getClass().getSimpleName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void operation(List<Object> objects) {
		objects = new ArrayList<>();
		objects.add(new Object());
		// Bla bla bla
	}
}
