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
		//실제 live streaming
		pastor.setScript("hello everyone");
		pastor.setScript("nice to meet you");
		System.out.println("중국인이 흥미 없어서 퇴장 하였습니다.");
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
		System.out.println(scripts + " 한국어 번안 로직 실행");
	}	
}

class JapaneseUser implements Observer{
	@Override
	public void translateLiveComment(String scripts) {
		System.out.println(scripts + " 일본어 번안 로직 실행");
	}	
}

class ChineseUser implements Observer{

	@Override
	public void translateLiveComment(String scripts) {
		System.out.println(scripts + " 중국어 번안 로직 실행");
	}
	
}

class GermanUser implements Observer{

	@Override
	public void translateLiveComment(String scripts) {
		// TODO Auto-generated method stub
		
	}
	
}

