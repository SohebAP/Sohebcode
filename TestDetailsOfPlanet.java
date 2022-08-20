package soheb;

public class TestDetailsOfPlanet {  //class name
	public static void main(String[] args) { //start of main function
		
		DetailsOfPlanet planet1= new DetailsOfPlanet("Mercury"," ",0,false); //create object of DetailsOfPlanet class names planet1 and instatiate it by
		                                                                     //using constructor of DetailsOfPlanet
		DetailsOfPlanet planet2= new DetailsOfPlanet("Venus","Carbon Dioxide, Nitrogen",0,false);  //create another object that is planet 2
		DetailsOfPlanet planet3= new DetailsOfPlanet("Earth","Nitrogen, Oxygen",1,false);          //create another object that is planet 3
		DetailsOfPlanet planet4= new DetailsOfPlanet("Jupiter","Hydrogen,Helium",79,true);         //create another object that is planet 4
		DetailsOfPlanet planet5= new DetailsOfPlanet("Satum","Hydrogen,Helium",83,true);           //create another object that is planet 5
		DetailsOfPlanet planet6= new DetailsOfPlanet("Uranus","Hydrogen,Helium,Methane",27,true);  //create another object that is planet 6
		
		
			System.out.println(planet1);
			System.out.println(planet2);
			System.out.println(planet3);
			System.out.println(planet4);
			System.out.println(planet5);
			System.out.println(planet6);
		}
		
	}


