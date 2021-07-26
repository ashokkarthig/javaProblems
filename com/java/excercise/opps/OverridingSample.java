
package com.java.excercise.oops;

/**
 * <h1>LivingThings</h1>
 * <p>
 * This interface has three requirement of Living Things
 * </p>
 * 
 * @author ASHOK G
 *
 */
interface LivingThings {
	void eat();

	void travel();

	void sounds();
}

/**
 * <h1>Animal</h1>
 * <p>
 * Animal class implements LivingThings Interface and provide implementation to
 * method of LivingThings
 * </p>
 * 
 * @author ASHOK G
 *
 */
class Animal implements LivingThings {
	public void eat() {
		System.out.println("Animal is Eating...");
	}

	public void travel() {
		System.out.println("Animal is Walking...");
	}

	public void sounds() {
		System.out.println("Animal is Sounding...");
	}
}

/**
 * <h1>Bird</h1>
 * <p>
 * Bird class implements LivingThings Interface and provide implementation to
 * method of LivingThings
 * </p>
 * 
 * @author ASHOK G
 *
 */
class Birds implements LivingThings {
	public void eat() {
		System.out.println("Bird is Eating...");
	}

	public void travel() {
		System.out.println("Bird is Flying...");
	}

	public void sounds() {
		System.out.println("Bird is Singing...");
	}
}

/**
 * <h1>Lion</h1>
 * <p>
 * Lion class extends Animal Class and provide overrides the method of Animal
 * </p>
 * 
 * @author ASHOK G
 *
 */
class Lion extends Animal {
	public void eat() {
		System.out.println("Lion Eating Deer");
	}

	public void travel() {
		System.out.println("Lion went for hunting...");
	}

	public void sounds() {
		System.out.println("Lion in roaring...");
	}
}

/**
 * <h1>Parrot</h1>
 * <p>
 * Parrot class extends Bird Class and provide overrides the method of Bird
 * </p>
 * 
 * @author ASHOK G
 *
 */
class Parrot extends Animal {
	public void eat() {
		System.out.println("pattor Eating Insects");
	}

	public void travel() {
		System.out.println("parrot is flying");
	}

	public void sounds() {
		System.out.println("parrot can sounds like human");
	}
}

public class OverridingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In overriding method will be called based on object\nOverriding Samples:");

		System.out.println("\nAnimal Methods");
		LivingThings livingObj = new Animal();
		livingObj.eat();
		livingObj.travel();
		livingObj.sounds();

		System.out.println("\nLion Methods");
		livingObj = new Lion();
		livingObj.eat();
		livingObj.travel();
		livingObj.sounds();

		System.out.println("\nBirds Methods");
		livingObj = new Birds();
		livingObj.eat();
		livingObj.travel();
		livingObj.sounds();

		System.out.println("\nParrot Methods");
		livingObj = new Parrot();
		livingObj.eat();
		livingObj.travel();
		livingObj.sounds();

	}

}
