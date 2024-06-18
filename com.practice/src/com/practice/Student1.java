package com.practice;

public class Student1 
{
	private int rollNo;
	private String name;
	private boolean isAttended;
	
	public Student1(int rollNo)
	{
		this.rollNo=rollNo;
		
	}

	public boolean getisAttended() {
		return isAttended;
	}

	public void setAttended(boolean isAttended) {
		this.isAttended = isAttended;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
