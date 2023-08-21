package example;

import java.util.ArrayList;

public class Calculation {

	Ticket ticket;
	ArrayList<Passenger> passList;

	public Calculation(Ticket ticket,ArrayList<Passenger> passList) {
		
		this.ticket = ticket;
		this.passList=passList;
		
	}
	
	public double totalCalculation() {
		double totalCost=0;
		
		for(Passenger p:passList) {
			
			double temp=costCalculation(ticket.getCost(),p.getAge(),p.getGender());
			
			totalCost=totalCost+temp;
			
		}
		
		return totalCost;
		
	}
	
	public double costCalculation(double ticketCost,int age,String gender) {
		
		double finalCost=0;
		
		if("male".equals(gender)&&age>65||"female".equals(gender)&&age>58) {
			finalCost=ticketCost*0.75;	
		}
		else if(age<5) {
			finalCost=ticketCost*0.50;
		}
		else if(age<12) {
			finalCost=ticketCost*0.50;
		}
		else {
			finalCost=ticketCost;
		}
		
		return finalCost;
	}
}