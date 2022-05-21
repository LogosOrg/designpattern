package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		Preacher pastor = new Preacher();
		Observer korean = new KoreanUser("Soobin");
		Observer korean2 = new KoreanUser("Choongil");
		Observer japanese = new JapaneseUser();
		Observer chineses = new ChineseUser();
		
		pastor.registerUser(korean);
		pastor.registerUser(japanese);
		pastor.registerUser(chineses);
		pastor.registerUser(korean2);
		//���� live streaming
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
	void sendLiveComment();
}

interface Observer{
	void translateLiveComment(String scripts);
}

class Preacher implements Subject{

	List<Observer> listeners = new ArrayList<>();
	String comment = "";
	@Override
	public void registerUser(Observer observer) {
		listeners.add(observer);
	}

	@Override
	public void removeUser(Observer observer) {
		listeners.remove(observer);
	}

	@Override
	public void sendLiveComment() {
		listeners.forEach(e -> e.translateLiveComment(comment));
	}
	
	public void setScript(String newComments) {
		this.comment = newComments;
		sendLiveComment();
	}
}


abstract class UserInfo{
	String name;
	
	public void displayUserInfo() {
		System.out.println("name:" + name);
	}
}

class KoreanUser extends UserInfo implements Observer{
		
	public KoreanUser(String name) {
		this.name = name;
		displayUserInfo();
	}
	
	@Override
	public void translateLiveComment(String scripts) {
		System.out.println(scripts + " �ѱ��� ���� ���� ����");
	}	
}

class JapaneseUser implements Observer{
	@Override
	public void translateLiveComment(String scripts) {
		System.out.println(scripts + " �Ϻ��� ���� ���� ����");
	}	
}

class ChineseUser implements Observer{

	@Override
	public void translateLiveComment(String scripts) {
		System.out.println(scripts + " �߱��� ���� ���� ����");
	}
	
}

class GermanUser implements Observer{

	@Override
	public void translateLiveComment(String scripts) {
		// TODO Auto-generated method stub
		
	}
	
}

