package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class DbClass {
	
	
	
	public HashMap<String,ArrayList<String>> loadData() {
		HashMap<String,ArrayList<String>> list=new HashMap<>();
		ArrayList<String> places = new ArrayList<>();
		ArrayList<String> trains = new ArrayList<>();
		try {

			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?user=postgres&password=Bhara@1234");
			Statement st1 = con.createStatement();
			Statement st2 = con.createStatement();

			ResultSet rs1 = st1.executeQuery("select * from places");
			ResultSet rs2 = st2.executeQuery("select * from trains");

			while (rs1.next()) {
				places.add(rs1.getString(1));
			}
			
			while (rs2.next()) {
				trains.add(rs2.getString(1));
			}

			con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

		list.put("train", trains);
		list.put("place", places);
		
     
		return list;
	}
 
}
