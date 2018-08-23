
import java.io.*;
public class CreateFile{

	public static void main(String[] args) throws IOException {

		/**
	    The line below does not create a new file, rather it creates
	    a New Object File that is suposed to point to the file.
		**/

		File f= new File("file.txt");

		/**
	    This line, below, actually creates the physical file.
		**/	
		f.createNewFile();
	}
}