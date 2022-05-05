package designpatterns.strategy;

public class MiniStarbucksSimulator {
	public static void main(String[] args) {
		System.out.println("Hello Welcome to visit Starbucks");
		SeoulStarbucks seoul_starbucks = new SeoulStarbucks();

		seoul_starbucks.display();
	}
}


