package com.putOnTheLight;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl sControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lOnCommand = new LightOnCommand(light);
		
		sControl.setCommand(lOnCommand);
		sControl.buttonWasPressed();
	}
}
