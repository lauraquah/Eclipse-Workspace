package com.cg.beans;

abstract public class Canine extends Animal{
	public Canine(){
		System.out.println("instantiating canine type...");
	
	}
	
	public void roam(){
	System.out.println("test");
	}
	
	abstract public void eat();
	
}
