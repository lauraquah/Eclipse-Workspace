package com.cg.beans;

public class Dog extends Canine{

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
		
	}
	
	public void roam(){
		roamInGroups();
	}

	public void roamInGroups(){
		System.out.print("Roam in groups");
	}

}
