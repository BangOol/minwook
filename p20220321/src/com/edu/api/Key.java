package com.edu.api;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comparekey = (Key) obj;
			if(this.number == comparekey.number) {
				return true;
			}
		}
		
		return false;
	}
	
}	
