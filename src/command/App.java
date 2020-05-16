package command;

public class App {

	public static void main(String[] args) {
		Switcher switcher=new Switcher();
		Light light=new Light();
		LightOnCommand onCommand=new LightOnCommand(light);
		LightOffCommand offCommand=new LightOffCommand(light);
		switcher.addCommand(onCommand);
		switcher.addCommand(offCommand);
		switcher.executeCommand();
	}

}
