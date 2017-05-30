package com.springCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	@SuppressWarnings("rawtypes")
	List addressList;
	@SuppressWarnings("rawtypes")
	Set addressSet;
	@SuppressWarnings("rawtypes")
	Map addressMap;
	Properties addressProp;
	@SuppressWarnings("rawtypes")
	public List getAddressList() {
		System.out.println("List Elements :"  + addressList);
		return addressList;
	}
	@SuppressWarnings("rawtypes")
	public Set getAddressSet() {
		System.out.println("Set Elements :"  + addressSet);
		return addressSet;
	}
	@SuppressWarnings("rawtypes")
	public Map getAddressMap() {
		System.out.println("Map Elements :"  + addressMap);
		return addressMap;
	}
	public Properties getAddressProp() {
		System.out.println("Property Elements :"  + addressProp);
		return addressProp;
	}
	public void setAddressList(List<?> addressList) {
		this.addressList = addressList;
	}
	public void setAddressSet(Set<?> addressSet) {
		this.addressSet = addressSet;
	}
	public void setAddressMap(Map<?, ?> addressMap) {
		this.addressMap = addressMap;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
}
