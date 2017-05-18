package com.event.door;

public class DoorListener2 implements IDoorListener {
	public void doorEvent(DoorEvent doorEvent){
		if(doorEvent.getDoorStatus().equals("open")){
			System.out.println("listener2...open.");
		}else if(doorEvent.getDoorStatus().equals("close")){
			System.out.println("listener2...close.");
		}
	}
}
