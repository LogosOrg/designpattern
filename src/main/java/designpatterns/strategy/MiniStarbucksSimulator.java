package designpatterns.strategy;

import java.util.Scanner;

public class MiniStarbucksSimulator {
	public static void main(String[] args) {
		Starbucks selectedStarbucks;
		Starbucks seoul_starbucks = new SeoulStarbucks();
		Starbucks tokyo_starbucks = new TokyoStarbucks();
		Starbucks monterrey_starbucks = new MonterreyStarbucks();

		int n;
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Hello Welcome to Starbucks");

		System.out.println("Please select the city (1: Seoul, 2: Tokyo, 3: Monterrey)");

		n = input.nextInt();
		
		switch (n) {
			case 1:
				selectedStarbucks = seoul_starbucks;
				break;
			case 2:
				selectedStarbucks = tokyo_starbucks;
				break;
			case 3:
				selectedStarbucks = monterrey_starbucks;
				break;
			default:
				System.out.println("Out of range Error");
				selectedStarbucks = seoul_starbucks;
				break;
		}

		System.out.println("You've selected " + selectedStarbucks.city + " Starbucks");
		System.out.println("Please select your coffee. (1: Americano, 2: Capuchino)");
		n = input.nextInt();
		if (n == 1) {
			selectedStarbucks.setCoffee(new Americano());
		} else {
			selectedStarbucks.setCoffee(new Capuchino());
		}
		System.out.println("Please select your milk. (1: SeoulMilk, 2: TokyoMilk, 3: MonterreyMilk)");
		n = input.nextInt();
		if (n == 1) {
			selectedStarbucks.setMilk(new SeoulMilk());
		} else if (n == 2) {
			selectedStarbucks.setMilk(new TokyoMilk());
		} else {
			selectedStarbucks.setMilk(new MonterreyMilk());
		}
		System.out.println("Do you want to add more caffeine? (1: Yes I want more, 2: No thank you");
		n = input.nextInt();
		if (n == 1) {
			selectedStarbucks.moreCaffeine();
		}
		System.out.println("Do you want to add more protein? (1: Yes I want more, 2: No thank you");
		n = input.nextInt();
		if (n == 1) {
			selectedStarbucks.moreProtein();
		}
		selectedStarbucks.display();
		input.close();
	}
}
