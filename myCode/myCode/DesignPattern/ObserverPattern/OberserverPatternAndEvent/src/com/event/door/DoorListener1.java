package com.event.door;

public class DoorListener1 implements IDoorListener {
	public void doorEvent(DoorEvent doorEvent){
		if(doorEvent.getDoorStatus().equals("open")){
			System.out.println("listener1...open.");
		}else if(doorEvent.getDoorStatus().equals("close")){
			System.out.println("listener1...close.");
		}
	}
}
