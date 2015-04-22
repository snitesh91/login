package com.login.enums;

public enum SocialMediaService {
	None(1,"Nome"),FACEBOOK(2,"Facebook"),TWITTER(3,"Twitter"),GOOGLE(4,"Google");
	
	private int id;
	private String name;
	
	SocialMediaService(int id,String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName(){
		return name;
	}

}
