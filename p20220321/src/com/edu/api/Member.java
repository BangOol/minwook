package com.edu.api;

public class Member {
	public String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	
	

	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;

			if (id.equals(member.id) && name.equals(name)) {
				return true;
			}
			
		}
		return false;
	}

}

