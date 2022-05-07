package designPatterns2;

public class DecoratorPattern {

	public static void main(String[] args) {
		new AttackHigh().attack();
	}

}

//객체에 "추가 요소" 동적으로 더하고, 기능 확장
interface Attack {
	public void attack();
}

class Act {
	public String action() {
		return "";
	}
}

abstract class Action extends Act {
	public Act act;

	public abstract String action();
}

class Fly extends Action {
	public Fly(Act act) {
		this.act = act;
	}

	@Override
	public String action() {
		return act.action() + " Fly High";
	}
}

class TakeSword extends Action {
	public TakeSword(Act act) {
		this.act = act;
	}

	@Override
	public String action() {
		return act.action() + " TakeSword";
	}
}

class SwordAttackHigh extends Action {
	
	public SwordAttackHigh(Act act) {
		this.act = act;
	}

	@Override
	public String action() {
		return act.action() + " SwordAttackHigh";
	}
}

class BonusAttack extends Action{

	public BonusAttack(Act act) {
		this.act = act;
	}
	
	@Override
	public String action() {
		return act.action() + " bonus attack!!!";
	}
	
}

class AttackHigh extends Act implements Attack {

	@Override
	public void attack() {
//		System.out.println("logic 1: 날아가기");
//		System.out.println("logic 2: 칼을 들어서");
//		System.out.println("logic 3: 어깨 찌르기");
		Act acttackHigh = new AttackHigh();
		Act fly = new Fly(acttackHigh);
		Act takeSword = new TakeSword(fly);
		Act swordAttackHigh = new SwordAttackHigh(takeSword);
		Act bonusAttack = new BonusAttack(swordAttackHigh);
		System.out.print(bonusAttack.action());
	}
}

