package example;
public class Passenger {

	int slno;
	String name;
	String gender;
	int age;
	String berth;


	public Passenger(int slno,String name, String gender, int age,String berth) {
		this.slno=slno;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.berth=berth;
	}
	
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public String getBerth() {
		
		return berth;
	}
	public int getSlno() {
		return slno;
	}


	public void setSlno(int slno) {
		this.slno = slno;
	}


	public void setBerth(String berth) {
		this.berth = berth;
	}
	
	public String toString() {
		return slno+""+name;
	}

}