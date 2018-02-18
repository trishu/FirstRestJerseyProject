package sample.hello.models;

import org.codehaus.jackson.annotate.JsonProperty;

public class Person {
	
	@JsonProperty
	private int id;
	
	@JsonProperty
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
	

}
