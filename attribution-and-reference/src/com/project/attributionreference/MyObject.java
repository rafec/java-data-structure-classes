package com.project.attributionreference;

public class MyObject {
	Integer num;
	
	
	
	public MyObject(Integer num) {
		this.num = num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return this.num.toString();
	}
	
	
}
