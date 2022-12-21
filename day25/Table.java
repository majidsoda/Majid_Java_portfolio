package day25;

public class Table {
	public String type;
	public String color;
	public boolean isReserved;
	public int numSeats;
	
	public Table() {
		System.out.println("Inside empty constructor");
	}
	// this refers to this current object that is getting created by this constructor
	public Table (String type, String color, boolean isReserved, int numSeats) {
		System.out.println("inside 4 arguments construcor");
		
		this.type=type;
		this.color=color;
		this.isReserved=isReserved;
		this.numSeats= numSeats; 
	}

}
