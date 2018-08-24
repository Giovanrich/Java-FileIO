
import java.io.*;
public class BufferedReaderDemo{
	public static void main(String[] args) throws IOException {
		File file= new File("file.txt");
		file.createNewFile();
		//Write to the file first before demonstrating read
		FileWriter fw= new FileWriter(file);
		fw.write(100);
		fw.write("\n");
		fw.write("JWizard");
		fw.flush();
		fw.close();
		//Done writing, read now
		FileReader fr= new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();//moving the pointer
		}

		fw.close();


	}
}