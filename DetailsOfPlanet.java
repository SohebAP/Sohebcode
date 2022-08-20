package soheb;

public class DetailsOfPlanet {  //class name
	    private String name;     //String type private data field to hold name of the planet
	    private String gases;   //String type private data field to hold name of the gases
	    private int moons;  //boolean private data member to hold the number of moons 
	    private boolean rings;  //boolean private data member to hold data about having rings
	    
	    public DetailsOfPlanet(String name, String gass, int mn, boolean rgs) {  //parameterized constructor that accepts values 
	    	                                                                         //for each of the fields
	    	this.name=name;
	    	this.gases=gass;
	    	this.moons=mn;
	    	this.rings=rgs;
	    }
	    public String getName() {    //accessor get method for name field
	    	return name;
	    }
	    public String getGas() {     //accessor get method for gases field
	    	return gases;
	    }
	    public int getMoon() {    //accessor get method for moons field
	    	return moons;
	    }
	    public boolean getRings() {    //accessor get method for rings field
	    	return rings;
	    }
	    
	}



