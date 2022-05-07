package designPatterns2;

import java.util.ArrayList;
import java.util.List;

public class DecoratorPattern {

	public static void main(String[] args) {
		new AttackHigh().attack();
	}
	
}
//��ü�� "�߰� ���" �������� ���ϰ�, ��� Ȯ��
interface Attack {
	public void attack();
}

class Act{
	public String action() {
		return "";
	}
}

abstract class Action extends Act{
	String description;
	
	public String action() {
		return super.action() + description;
	}
}

class Fly extends Action{
	public Fly() {
		this.description = "���ƿ�����.";
		action();
	}
}

class TakeSword extends Action{
	public TakeSword() {
		this.description = "Į�� ���ø���.";
		action();
	}
}

class SwordAttackHigh extends Action{
	public SwordAttackHigh() {
		this.description = "��� ���";
		action();
	}
}

class AttackHigh implements Attack {
	List<Action> actionList = new ArrayList<Action>();
	
	@Override
	public void attack() {
//		System.out.println("logic 1: ���ư���");
//		System.out.println("logic 2: Į�� ��");
//		System.out.println("logic 3: ��� ���");
		actionList.add(new Fly());
		actionList.add(new TakeSword());
		actionList.add(new SwordAttackHigh());
		actionList.forEach(e->System.out.print(e.action()));
	}
}