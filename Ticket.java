package example;
public class Ticket {

	String from;
	String to;
	String train;
	String date;
	String clas;
	double cost=100;

	public Ticket(String from, String to, String train, String date, String clas) {
		
		this.from = from;
		this.to = to;
		this.train = train;
		this.date = date;
		this.clas = clas;
	}
	
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public String getTrain() {
		return train;
	}
	public String getDate() {
		return date;
	}
	public String getClas() {
		return clas;
	}
	public double getCost() {
		return cost;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	
	
}

