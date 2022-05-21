package designPatterns2;

public class CommanDesignPattern {

	public static void main(String[] args) {
		UserRemoteControl urc = new UserRemoteControl();
		Light livingRoomLight = new Light("livingRoom");
		urc.setCommand(new LightCommand(livingRoomLight)).buttonPressed();
		;

		Light DinnigLight = new Light("Dinnig");
		urc.setCommand(new LightCommand(DinnigLight)).buttonPressed();
		;
//		
//		Door firstDoor = new Door();
//		urc.setCommand(new GarageDoorCommand(firstDoor));
//		urc.setCommand(new GarageDoorCommand(firstDoor));
	}

}

class UserRemoteControl {

	Command command;

	public UserRemoteControl setCommand(Command command) {
		this.command = command;
		return this;
	}

	public void buttonPressed() {
		command.execute();
	}
}

interface Command {
	public void execute();
}

class Light {

	public boolean turnedOn;
	private String name;

	public Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " light on");
		turnedOn = !turnedOn;
	}

	public void off() {
		System.out.println(name + " light off");
		turnedOn = !turnedOn;
	}

}

class LightCommand implements Command {

	private Light light;

	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// light on should be executed.
		if (light.turnedOn) {
			light.off();
		} else {
			light.on();
		}
	}
}

class Door {
	public boolean opened;

	public void open() {
		System.out.println("door opened");
		opened = !opened;
	}

	public void closed() {
		System.out.println("door closed");
		opened = !opened;
	}
}

class GarageDoorCommand implements Command {
	private Door door;

	public GarageDoorCommand(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		// light on should be executed.
		if (door.opened) {
			door.closed();
		} else {
			door.open();
		}
	}
}
