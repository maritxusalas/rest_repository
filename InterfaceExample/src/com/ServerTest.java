package com;

public class ServerTest {
	
	public static void main(String[]args) {
	
	//cuando declaro as tengo acceso a los 2 metodos add y sub
	Serverr ss = new Serverr();
	System.out.println("add " +ss.add(100,200));
	System.out.println("add " +ss.sub(200,50));
	ss.ownMethod();
	
	//con esto solo accedo al mtodo de cada1
	Team1 team1 = new Serverr();//creating object and assigning in interface reference
	System.out.println("Team 1 "+team1.add(100, 200));
	Team2 team2 = new Serverr();
	System.out.println("Team 2 "+team2.sub(200, 50));
	
	}

}
