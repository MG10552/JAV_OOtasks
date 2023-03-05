
public static void Znaki {
	
	
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
	 
	public void Odczyt {
	  public static void main(String[] args) throws FileNotFoundException{
	      File file = new File("TEST01.txt");
	      Scanner in = new Scanner(file);
	 
	      String zdanie = in.nextLine();
	      System.out.println(zdanie);
	  }
	
	public void readFile(String filePath) throws IOException {
		  FileReader fileReader = new FileReader(filePath);
		  BufferedReader bufferedReader = new BufferedReader(fileReader);
		  
		  try {
		    String textLine = bufferedReader.readLine();
		    do {
		      System.out.println(textLine);
		  
		      textLine = bufferedReader.readLine();
		    } while (textLine != null);
		  } finally {
		    bufferedReader.close();
		  }
	}
}
