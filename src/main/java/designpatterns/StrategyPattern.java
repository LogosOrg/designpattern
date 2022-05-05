package designpatterns;

import java.util.ArrayList;
import java.util.Random;

public class StrategyPattern {
	public static void main(String[] args) {
		
		
		System.out.println("Elf and Dewarf");
		Character userA = new Elf("ElfId");
		Character userB = new Dewarf("DewarfId");
		
		ArrayList<Attack> attackList = new ArrayList<>();
		attackList.add(new AttackHigh());
		attackList.add(new AttackLow());
		
		ArrayList<Defend> defendList = new ArrayList<>();
		defendList.add(new GuardHigh());
		defendList.add(new GuardLow());
		
		Random rn = new Random();
		
		for(int i=0; i<10; i++){
			
			Character attacker = i%2==0? userA: userB;
			Character defender = attacker.equals(userA)? userB: userA;
			System.out.println("\n turn " + i);
			System.out.println("------------------");
			System.out.println("Attacker: " + attacker.id);
			System.out.println("Defender: " + defender.id);
			attacker.setSelectedAttack(attackList.get(rn.nextInt(2)));		
			defender.setSelectedDefend(defendList.get(rn.nextInt(2)));
			attacker.displayAttack();
			defender.displayDefend();
		}
	}

}

interface Attack {
	public void attack();
}

class AttackHigh implements Attack {
	@Override
	public void attack() {
		System.out.println("logic 1: AttackHigh");
		
	}
}

class AttackLow implements Attack {
	@Override
	public void attack() {
		System.out.println("logic 1: AttackLow");
		
	}
}

interface Defend {
	public void defend();
}

class GuardHigh implements Defend {
	@Override
	public void defend() {
		System.out.println("logic 1: GuardHigh");
		
	}
}

class GuardLow implements Defend {
	@Override
	public void defend() {
		System.out.println("logic 1: Defend logic 1");
		System.out.println("logic 2: Defend logic 2");
		System.out.println("logic 3: Defend logic 3");
	}
}

abstract class Character {
	String id;
	String race;

	Attack selectedAttack;
	Defend selectedDefend;

	private void performAttack() {
		selectedAttack.attack();
	}

	private void performDefend() {
		selectedDefend.defend();
	}

	public void displayAttack() {
		System.out.println(race);
		performAttack();
	}
	
	public void displayDefend() {
		System.out.println(race);
		performDefend();
	}
	
	public void setSelectedAttack(Attack selectedAttack) {
		this.selectedAttack = selectedAttack;
	}

	public void setSelectedDefend(Defend selectedDefend) {
		this.selectedDefend = selectedDefend;
	}
}


class Dewarf extends Character {
	public Dewarf(String id) {
		this.id = id;
		this.race = "Dewarf";
	}
}

class Knight extends Character {
	public Knight(String id) {
		this.id = id;
		this.race = "Knight";
	}
}

class Elf extends Character {

	public Elf(String id) {
		this.id = id;
		this.race = "Elf";
	}
	
}