package main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XPGMCH_12 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException 
	{	
		List<String> list = new ArrayList<String>();
		String line;
		while (true)
		{
			line = sc.next();
			if (line.contains("#")) 
			{
				line.replace('#', ' ');
				list.add(line);
				break;
			}
			else list.add(line);
		}
		
		String name = list.get(0);
		list.remove(0);
		FileWriter fw = new FileWriter(name+".txt");
		list.stream().forEach(k -> 
		{try 
			{
				fw.write(k+'\n');
			}
				catch (IOException e) 
			{	
					e.printStackTrace();
			}});
		fw.close();
		
		File file = new File(name+".txt");
		Scanner reader = new Scanner(file);
		 while (reader.hasNextLine()) 
		 {
		        String data = reader.nextLine();
		        System.out.println(data.toUpperCase());
		 }
	}
}
