package assignment5.problem1;

abstract public class Duck {
	
	public void quack() {
		System.out.println("Quack by squeaking.");
	}
	
	public void swim() {
		System.out.println("Swiming");
	}
	
	public void fly() {
		System.out.println("Flying with wings");
	}
	
	public abstract void display();
}
