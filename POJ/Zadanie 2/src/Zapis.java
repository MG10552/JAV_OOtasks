import java.io.FileNotFoundException;
import java.io.PrintWriter;
 
public class Zapis{
  public static void main(String[] args) throws FileNotFoundException{
      PrintWriter zapis = new PrintWriter("TEST01.txt");
      zapis.println("A teraz jest tutaj text po zmianie");
      zapis.close();
  }
}


