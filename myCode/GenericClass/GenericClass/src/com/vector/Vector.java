package com.vector;

public class Vector<T> {
	private int size = 0;
	private VectorElement<T> head = null;
	private VectorElement<T> tail = null;
	
	public Vector(){}
	
	public Vector(T data){
		this.head = new VectorElement<T>(data);
		this.tail = head;
		this.size +=1;
	}
	
	public void add(T data){
		if(size == 0){
			this.head = new VectorElement<T>(data);
			this.tail = head;
			this.size +=1;
		}else{
			VectorElement<T> t = new VectorElement<T>(data);
			this.tail.setNext(t);
			this.tail = t;
			this.size += 1;
		}
	}
	
	public void showAllElements(){
		VectorElement<T> point = new VectorElement<T>();
		point = head;
		while(point != null){
			System.out.println(point.getData());
			point = point.getNext();
		}
	}
}
