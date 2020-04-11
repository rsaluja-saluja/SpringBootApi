package com.springboot.topic;

public class Topic {

	private String id;
	private String name;
	private String Description;
	
	public Topic() {}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", Description=" + Description + "]";
	}
	
	
}
