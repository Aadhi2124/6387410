package design_principles.command_pattern_example;

public class LightOffCommand implements Command{
	
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}

}
