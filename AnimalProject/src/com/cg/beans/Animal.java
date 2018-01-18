package com.cg.beans;

abstract public class Animal extends Object{
	private String type;
	
	public Animal(){
		System.out.println("instantiating animal type...");
	}
	
	abstract public void eat();
	abstract public void sleep();
	abstract public void roam();
	
	
}
