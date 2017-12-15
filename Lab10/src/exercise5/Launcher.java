package exercise5;

import com.google.gson.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.net.*;
import java.io.*;


public class Launcher {

	public static void main(String[] args) throws IOException{

		URL url = new URL("https://coast.uni.lu/teaching/programming1/team.xml");
		
		InputStream in_stream = url.openStream();
		
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("team", TeachingTeam.class) ;
		xstream.alias("teacher", Teacher.class); 
		xstream.alias("phone", PhoneNumber.class);
		
		TeachingTeam team = (TeachingTeam) xstream.fromXML(in_stream);
		System.out.println("This is the teaching team object:"+team);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonRepresentation = gson.toJson(team);
	}
}
