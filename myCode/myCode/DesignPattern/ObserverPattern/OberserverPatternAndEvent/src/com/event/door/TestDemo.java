package com.event.door;

public class TestDemo {
	public static void main(String[] args) {
		DoorEventSource dES = new DoorEventSource();
		DoorListener1 l1 = new DoorListener1();
		DoorListener2 l2 = new DoorListener2();
		dES.addEventListener(l1);
		dES.addEventListener(l2);
		dES.addEventListener(new IDoorListener(){
			public void doorEvent(DoorEvent doorEvent) {
				if(doorEvent.getDoorStatus().equals("open")){
					System.out.println("anonymous...open.");
				}else if(doorEvent.getDoorStatus().equals("close")){
					System.out.println("anonymous...close.");
				}
			}
		});
		dES.notifyEvent("open");
		dES.notifyEvent("close");
	}
}
