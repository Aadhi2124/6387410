package design_principles.command_pattern_example;

public class RemoteControl {
	
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		if(command != null) {
			command.execute();
		}
		else {
			System.out.println("No Command Assign to the Remote");
		}
	}

}
