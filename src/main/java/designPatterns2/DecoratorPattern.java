package designPatterns2;

import java.util.ArrayList;
import java.util.List;

public class DecoratorPattern {

	public static void main(String[] args) {
		new AttackHigh().attack();
	}
	
}
//객체에 "추가 요소" 동적으로 더하고, 기능 확장
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
		this.description = "날아오른다.";
		action();
	}
}

class TakeSword extends Action{
	public TakeSword() {
		this.description = "칼을 들어올린다.";
		action();
	}
}

class SwordAttackHigh extends Action{
	public SwordAttackHigh() {
		this.description = "어깨 찌르기";
		action();
	}
}

class AttackHigh implements Attack {
	List<Action> actionList = new ArrayList<Action>();
	
	@Override
	public void attack() {
//		System.out.println("logic 1: 날아가기");
//		System.out.println("logic 2: 칼을 들어서");
//		System.out.println("logic 3: 어깨 찌르기");
		actionList.add(new Fly());
		actionList.add(new TakeSword());
		actionList.add(new SwordAttackHigh());
		actionList.forEach(e->System.out.print(e.action()));
	}
}