package exercise3;

import java.io.*;
import java.util.*;

public class Multiple_Output{
	
	private List <OutputStream> all_outputs;
	private InputStream stream_to_read;
	
	public Multiple_Output(OutputStream[] args) {
		this.all_outputs = new ArrayList<OutputStream>();
		
		for(OutputStream so: args) {
			this.all_outputs.add(so);
		}
	}
	
	public void Give_input(InputStream stream_to_read) {
		this.stream_to_read = stream_to_read;
	}
	
	
	public void Output_AllStreams() throws IOException{
		BufferedOutputStream out_buffer=null; 
		
		for(OutputStream so : this.all_outputs) {
			
			try {
				
				out_buffer = new  BufferedOutputStream(so);
				int c;
				while((c = this.stream_to_read.read()) != -1 ) {
					out_buffer.write(c);
				}
			
			}catch(IOException e) {
				System.out.println("Something went wrong.");
				System.out.println("Exceptions details:");
				System.out.println(e);
			
			}finally {
				if(out_buffer != null) {
					out_buffer.close();
				}
			}
		}
	}
}
