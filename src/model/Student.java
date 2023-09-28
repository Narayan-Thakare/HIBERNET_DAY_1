package model;

public class Student {
	
	private int roll; 
	private String name, address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}


	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	
	
	

}