package assignment5.problem1;

public class MainTest {

	public static void main(String[] args) {
		Duck[] ducks = {new MallardDuck(),new DecoyDuck(), new RedheadDuck(),new RubberDuck()};
		
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName()+ " : ");
			d.display();
			d.fly();
			d.quack();
			d.swim();
			System.out.println("\n");
		}

	}

}
