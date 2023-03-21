package org.sample;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Participant {
	@JsonProperty("Name")
	private String name;
    
	@JsonProperty("Age")
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
