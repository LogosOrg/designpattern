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
		System.out.println("중국인이 흥미 없어서 퇴장 하였습니다.");
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
		System.out.println(scripts + " 한국어 번안 로직 실행");
	}	
}

class JapaneseUser implements Observer{
	@Override
	public void translateScripts(String scripts) {
		System.out.println(scripts + " 일본어 번안 로직 실행");
	}	
}

class ChineseUser implements Observer{

	@Override
	public void translateScripts(String scripts) {
		System.out.println(scripts + " 중국어 번안 로직 실행");
	}
	
}