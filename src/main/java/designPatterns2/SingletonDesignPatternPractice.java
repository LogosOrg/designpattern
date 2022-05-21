package designPatterns2;

public class SingletonDesignPatternPractice {

	public static void main(String[] args) {
		CoffeeMachine machine1 = CoffeeMachine.getInstance();
		machine1.displayCoffeeOptions();
		// thread...
		// multi thread..
	}

}

class CoffeeMachine {

	private String[] coffeeTypes = { "espresso", "latte", "AhAh" };

	private static final CoffeeMachine UNIQ_INSTANCE = new CoffeeMachine();

	private CoffeeMachine() {
	}

	public String[] getCoffeeTypes() {
		return coffeeTypes;
	}

	public static synchronized CoffeeMachine getInstance() {
		return UNIQ_INSTANCE;
	}

	public void displayCoffeeOptions() {
		for (String e : coffeeTypes) {
			System.out.println(e);
		}
	}

}
