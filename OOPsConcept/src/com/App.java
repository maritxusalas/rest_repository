package com;

import xyz.StringDemo;

public class App {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if we want to call any method or variable part of another class
			//we need to ceate an object
		StringDemo prueba = new StringDemo();
		Car innova = new Car();
		innova.start();
		innova.stop();
		Car bmw =new Car();
		bmw.start();
		bmw.stop();
		innova.wheeel=4;
		innova.colour="Grey";
		innova.price=350000;
		System.out.println("Innova car details");
		System.out.println("Wheel "+innova.wheeel);
		System.out.println("Colour "+innova.colour);
		System.out.println("Price "+innova.price);
		System.out.println("prueba de string " +prueba.toString());
		
	}

}
