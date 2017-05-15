package com.map;

public class MapElement<Key, Value> {
	private Key key = null;
	private Value value = null;
	public MapElement(Key k,Value v){
		this.key = k;
		this.value = v;
	}
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
}
