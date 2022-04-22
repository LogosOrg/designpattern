package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		Preacher pastor = new Preacher();
		Observer korean = new KoreanUser();
		Observer japanese = new JapaneseUser();
		Observer chineses = new ChineseUser();
		pastor.registerUser(korean);
		pastor.registerUser(japanese);
		pastor.registerUser(chineses);
		pastor.setScript("hello everyone");
		pastor.setScript("nice to meet you");
		System.out.println("�߱����� ��� ��� ���� �Ͽ����ϴ�.");
		pastor.removeUser(chineses);
		pastor.setScript("How dare to leave");
	}

}


interface Subject{
	void registerUser(Observer observer);
	void removeUser(Observer observer);
	void sendScripts();
}

class Preacher implements Subject{

	List<Observer> listeners = new ArrayList<>();
	String script = "";
	@Override
	public void registerUser(Observer observer) {
		listeners.add(observer);
	}

	@Override
	public void removeUser(Observer observer) {
		listeners.remove(observer);
	}

	@Override
	public void sendScripts() {
		listeners.forEach(e -> e.translateScripts(script));
	}
	
	public void setScript(String newComments) {
		this.script = newComments;
		sendScripts();
	}
}

interface Observer{
	void translateScripts(String scripts);
}

class KoreanUser implements Observer{
	@Override
	public void translateScripts(String scripts) {
		System.out.println(scripts + " �ѱ��� ���� ���� ����");
	}	
}

class JapaneseUser implements Observer{
	@Override
	public void translateScripts(String scripts) {
		System.out.println(scripts + " �Ϻ��� ���� ���� ����");
	}	
}

class ChineseUser implements Observer{

	@Override
	public void translateScripts(String scripts) {
		System.out.println(scripts + " �߱��� ���� ���� ����");
	}
	
}