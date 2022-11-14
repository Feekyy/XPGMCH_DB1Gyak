package asda;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class XPGMCH_13 {

	public static void main(String[] args) 
	{
		Path path1 = Paths.get("input.txt");
		Path path2 = Paths.get("output.txt");
		
		List<String> text;

			try 
			{
				text = Files.readAllLines(path1, StandardCharsets.UTF_8);
				Files.write(path2, text);
			} catch (IOException e) 
			{
				System.out.println("NINCS FÁJL!!!!!!!!!!");
			}

		
		
	}

}
