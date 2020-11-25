package com.xworkz.mountain.part;

public class Festival {

	
	private String name="Deepavali";//instance var
	
	public Festival() {
		System.out.println("Created Festival");
	}

	
	public Festival(String name)
	{
		this.name=name;
		System.out.println("arg 1 :"+name);
	}
	
	public void celebration(String celebratedBy) {
		System.out.println("invoked celebration");
		System.out.println("arg 1" + celebratedBy);  
		System.out.println(name);
		System.out.println("EXIT :: celebration");
	}

}
