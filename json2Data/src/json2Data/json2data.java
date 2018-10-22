package json2Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json2data {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		final Logger log = Logger.getGlobal();
		System.out.println("Please input your json file address");
		System.out.println("ex:)C:\\Users\\MyoungEun\\Documents\\xxx.json");
		Scanner s = new Scanner(System.in);
		String inputFilePath = s.nextLine();
		System.out.println(inputFilePath);
		String[] outputFilePathArray = inputFilePath.split("\\.",0);
		String outputFilePath = outputFilePathArray[0]+".csv";
		String outputFilePathDat = outputFilePathArray[0]+".dat";
		

		Object obj;
		String[] header = null;
		  BufferedReader readerB = null;
		try (FileInputStream reader = new FileInputStream(inputFilePath))
        {
			readerB = new BufferedReader(new InputStreamReader(reader, "UTF8"));
			JSONParser parser = new JSONParser();
			obj = parser.parse(readerB);
			JSONArray jsonArray = (JSONArray) obj;
			JSONObject jsonObjectFroHeader = (JSONObject)jsonArray.get(0);
			Object[] objectTemp = jsonObjectFroHeader.keySet().stream().map(i -> i.toString()).toArray();
			//header = (String[])jsonObjectFroHeader.keySet().toArray();            
			//header = (String[])objectTemp;
			
			//header print
			boolean startflag = false;
			String headerString = "";
			for (Object key : objectTemp) {
				
				if(startflag)headerString += ",";
				else startflag = true;
				
				headerString += key.toString();
			}
			
			List writeList = new LinkedList();
			
			for(Object lineObj : jsonArray)
			{
				String temp = "";
				startflag = false;
				for (Object key : objectTemp) {
					
					if(startflag)temp += ",";
					else startflag = true;
					JSONObject lineObjJSON = (JSONObject)lineObj;
					temp += lineObjJSON.get(key);
					
				}
				writeList.add(temp);
				
				
			}
			System.out.println("===============================================");
			System.out.println(headerString);
			writeList.parallelStream().forEach(System.out::println);
			System.out.println("===============================================");
			//fileout
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(outputFilePath), "UTF8"));
			out.write(headerString + "\n");
			writeList.stream().forEach(x -> {
				try {
					out.write(x + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			});   
			
			out.close();
			Writer outDat = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(outputFilePathDat), "UTF8"));
			outDat.write(headerString + "\n");
			writeList.stream().forEach(x -> {
				try {
					outDat.write(x + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			});  
			outDat.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("File Maked");
		System.out.println("Your File is here");
		System.out.println(outputFilePath);
		System.out.println(outputFilePathDat);
		
				
		
	}

}
