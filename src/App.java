import java.nio.file.Path;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.Date;

public class App {

	public static void main(String[] args) throws URISyntaxException, IOException  {
		
		System.out.println("Please select the path you would like to build in =>");
		Scanner scan = new Scanner(System.in);
		String pathConcat = scan.nextLine();
        Date now = new Date();
	    SimpleDateFormat simpleDate = new SimpleDateFormat ("yyyy.MM.dd'_'hh.mm.ss");
	    String dateString = ("Notes_" + simpleDate.format(now));
	    System.out.println(dateString);

	    Path path = Path.of("C:/Users/Kevin" + pathConcat);
		scan.close();
	    System.out.println(path);
	    
	    boolean pathExists = Files.exists(path);
	    System.out.println("exists => " + pathExists);
	    
	    if (pathExists == true) {
	    	
			System.out.println("Constructing a Word document here...");
		    Path newFile = Files.createFile(path.resolve(dateString + ".docx"));
		    System.out.println("newFile = " + newFile);
	    	
	    }
	    
	    
//	    .resolve is just giving us the reference here, for use in the logs
//	    Path newDirectory = Files.createDirectories(path.resolve("Test_Directory"));
//	    System.out.println("newDirectory = " + newDirectory);
//
		
	}

}
