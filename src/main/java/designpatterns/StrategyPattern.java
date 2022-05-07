package designpatterns;

import java.util.ArrayList;
import java.util.Random;

public class StrategyPattern {
	public static void main(String[] args) {

		System.out.println("Character ����");
		Character userA = new Elf("�濰��");
		Character userB = new Dewarf("������ ������ ����� ����");

		ArrayList<Attack> attackList = new ArrayList<>();
		attackList.add(AttackFactory.getAttack("attackHigh"));
		attackList.add(AttackFactory.getAttack("attackLow"));

		ArrayList<Defend> defendList = new ArrayList<>();
		defendList.add(new GuardHigh());
		defendList.add(new GuardLow());

		Random rn = new Random();

		for (int i = 0; i < 10; i++) {

			Character attacker = i % 2 == 0 ? userA : userB;
			Character defender = attacker.equals(userA) ? userB : userA;
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

class AttackFactory {

	private final static AttackHigh ATTACK_HIGH =  new AttackHigh(); //service - rule - tax - 13 % etc... policy 1
	private final static AttackLow ATTACK_LOW =  new AttackLow(); //service - rule - tax - 10 % etc ... policy 2
	
	public static Attack getAttack(String attackType) {
		switch (attackType) {
		case "attackHigh":
			return ATTACK_HIGH;
		case "attackLow":
			return ATTACK_LOW;
		default:
			return ATTACK_HIGH; // this is a default attack if user does not define any attack type in runtime
										// (timelimit: 30seconds)
		}
	}

}

interface Attack {
	public void attack();
}

class AttackHigh implements Attack {
	@Override
	public void attack() {
		System.out.println("logic 1: ���ư���");
		System.out.println("logic 2: Į�� ��");
		System.out.println("logic 3: ��� ���");
	}
}

class AttackLow implements Attack {
	@Override
	public void attack() {
		System.out.println("logic 1: �޷�����");
		System.out.println("logic 2: ���� ������");
		System.out.println("logic 3: �ٸ� ����");
	}
}

interface Defend {
	public void defend();
}

class GuardHigh implements Defend {
	@Override
	public void defend() {
		System.out.println("logic 1: �޹��� �ڷ� ����");
		System.out.println("logic 2: ���и� ���ε�");
		System.out.println("logic 3: ��ü ��ȣ�ϱ�");
	}
}

class GuardLow implements Defend {
	@Override
	public void defend() {
		System.out.println("logic 1: ���� ���̰�");
		System.out.println("logic 2: ���и� ������");
		System.out.println("logic 3: ��ü�� ��ȣ�ϱ�");
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
		this.race = "������ ������";
	}
}

class Knight extends Character {
	public Knight(String id) {
		this.id = id;
		this.race = "����ζ� ���� ���";
	}
}

class Elf extends Character {

	public Elf(String id) {
		this.id = id;
		this.race = "������ �̳�";
	}

}