
import java.io.*;
public class PrintWriterDemo{
	public static void main(String[] args) throws IOException {
		/**
		* 1. File
		* 2. BufferedWriter 
		* 3. PrintWriter
		**/

		File file= new File("file.txt");
		file.createNewFile();
		FileWriter fw= new FileWriter(file);
		BufferedWriter bw= new BufferedWriter(fw);
		PrintWriter pw= new PrintWriter(bw);
		pw.println(100); //100
		pw.println("JWizard");
		pw.println("Java Developer");
		pw.flush();
		pw.close();

	}
}