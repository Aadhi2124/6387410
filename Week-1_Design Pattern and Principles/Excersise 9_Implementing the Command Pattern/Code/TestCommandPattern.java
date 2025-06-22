package design_principles.command_pattern_example;

public class TestCommandPattern {

	public static void main(String[] args) {
		
		Light bedRoomLight = new Light();
		
		Command lighton = new LightOnCommand(bedRoomLight);
		
		Command lightoff = new LightOffCommand(bedRoomLight);
		
		RemoteControl rc = new RemoteControl();
		
		//Turn ON light
		rc.setCommand(lighton);
		rc.pressButton();
		
		//Turn OFF light
		rc.setCommand(lightoff);
		rc.pressButton();
		
	}

}
