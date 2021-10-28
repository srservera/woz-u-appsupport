package com.sierra.handson8;

public class HandsOn {

	public static void main(String[] args) {
		// 
	
	Dog d = new Dog(); //creating the object dog 
	d.speak(); //calling the speak and run methods on objects dog, cow, cat 
	d.run();
	d.eat();
	 System.out.println(" ");
	
    Cat c = new Cat();
    c.speak();
    c.run();
    c.eat();
    System.out.println(" ");
    
	Cow cw = new Cow();
	cw.speak();
	cw.run();
	cw.eat();
    System.out.println(" ");

	
	Lizard l = new Lizard();
	l.eat();
	l.crawl();
    System.out.println(" ");

	
	Turtle t = new Turtle();
	t.eat();
	t.crawl();
	}
		
}
