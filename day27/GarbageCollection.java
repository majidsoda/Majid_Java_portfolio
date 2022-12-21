package day27;

public class GarbageCollection {
	/*
	 * There are 3 ways to make an object eligible for GC When object doesn't have
	 * references, it is eligible for GC 1. Nullifying the reference(s) to the
	 * object. 2. Re-assigning the reference to point to the different object. 3. An
	 * object that was created inside the method.
	 */
	public static void main(String[] args) {
		// GC cleans up unused objects from the memory

		// 1. Nullifying the reference(s) to the object.
		Book b = new Book("A", "John", 30);

		// in java, null can be assigned to any references (non-primitive type)
		// to indicate that the reference doesn't point to any object.
		b = null;

		// 2. Re-assigning the reference to point to the different object.
		Book b2 = new Book("B", "Alex", 20);
		Book b3 = new Book("C", "Kuba", 25);

		b2 = b3;

		// 3. An object that was created inside the method.
		testMethod();

		// GC is 100% automatic process
		// We can only suggest do the clean up
		// there is no guarantee that request will run GC

		// #1. Using System class and gc() method
		System.gc();

		// #2. Using Runtime class and gc() method
		Runtime.getRuntime().gc();

		// What's finalize() method?
		// Just before destroying the object, GC call finalize() method
		// You can override this method for your object and put your custom clean up
	}

	public static void testMethod() {
		Book obj = new Book("C", "Bek", 20);
	}
}

//- Access modifiers control visibility of class level variables(intstance variables, static variables) and methods.
//public     -> accessible from everywhere
//protected  -> accessible within the same package and subclass
//default(no access modifier) -> accessible within the same package 
//private    -> accessible within the same class
//
//- static keyword. The static variables and method belong to the class and not to specific object. They are global variables and methods. In order to use them we don't have to create an object, the correct way of using it is by class name.
//
//- Garbage collection in Java. GC process cleans up unused obejcts in the heap memory. The object that doesn't have any references will be eligible for GC.  
//
//- stack and heap memory.
//  - each method call creates method frame in the stack memory. The local variables for iniside that method are stored in this method frame. After method is done, the method frame gets destroyed.
//  - The object references are stored in the stack memory but actual objects are in the heap memory.



