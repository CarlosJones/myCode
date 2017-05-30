package com.map;

import java.util.ArrayList;
import java.util.List;

public class Map<Key, Value> {
	private List<MapElement<Key,Value>> list = new ArrayList<MapElement<Key,Value>>();
	
	public void add(Key k,Value v){
		MapElement<Key,Value> e = new MapElement<Key,Value>(k,v);
		list.add(e);
	}
	
	public Value get(Key key){
		Value result = null;
		for(MapElement<Key,Value> e:list){
			if(key == e.getKey()){
				result =  e.getValue();
				break;
			}
		}
		if(null == result){
			System.out.println("集合中没有该元素");
		}
		return result;
	}
}