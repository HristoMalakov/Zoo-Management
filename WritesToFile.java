package Try;

import java.io.*;
import java.lang.*;
import java.util.*;


public class WritesToFile {

	public WritesToFile(){
		File zooFile = new File("Zoo.txt");
		String strA="Animal";
		String strN="ID";
		String strC="Imported from";

		try{
			PrintWriter output = new PrintWriter(new FileWriter(zooFile, true));
			output.printf("%-20s|%-6s|%-20s\n",strA,strN,strC);
		}
		catch(Exception e){
			System.out.printf("ERROR: %s", e);
		}
	}

}
