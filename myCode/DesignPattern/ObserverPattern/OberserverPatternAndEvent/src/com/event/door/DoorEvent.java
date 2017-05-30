package com.event.door;

public class DoorEvent {
	
	private String doorStatus = "";

	public DoorEvent(Object source,String doorStatus) {
		this.doorStatus = doorStatus;
	}

	public String getDoorStatus() {
		return doorStatus;
	}

	public void setDoorStatus(String doorStatus) {
		this.doorStatus = doorStatus;
	}

}
