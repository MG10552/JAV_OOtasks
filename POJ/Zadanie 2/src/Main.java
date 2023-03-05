import java.io.File;
import java.util.Scanner;


public class Main {

	
	File file = new File("TEST01.txt");
	Scanner in = new Scanner(file);
	String text = "";
	while(in.hasNextLine(0))
	{
		text += in.nextLine();
	}
	System.out.println(text);
}
}
