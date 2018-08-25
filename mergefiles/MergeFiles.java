
import java.io.*;
public class MergeFiles{
	public static void main(String[] args) throws IOException {


		/**
		File 1 must have
		=================
		AAA
		BBB
		CCC
		**/

		File file1 =new File("file1.txt");
		file1.createNewFile();
		PrintWriter pw1=new PrintWriter(file1);
		pw1.println("AAA");
		pw1.println("BBB");
		pw1.println("CCC");
		pw1.flush();
		pw1.close();

		/**
		File 2 must have
		=================
		222
		333
		444
		555
		666
		**/
		File file2= new File("file2.txt");
		PrintWriter pw2= new PrintWriter(file2);
		pw2.println("222");
		pw2.println("333");
		pw2.println("444");
		pw2.println("555");
		pw2.println("666");
		pw2.flush();
		pw2.close();

		//File 3, the one to write to
		File file3= new File("file3.txt");
		file3.createNewFile();


		// begin the merging
		FileReader fr1= new FileReader(file1);
		BufferedReader br= new BufferedReader(fr1);
		PrintWriter pw3= new PrintWriter(file3);
		String line=br.readLine();
		while(line!=null){
			pw3.println(line);
			line=br.readLine();
		}


		br= new BufferedReader(new FileReader(file2));
		String line2= br.readLine();
		while(line2!=null){
			pw3.println(line2);
			line2=br.readLine();

		}

		pw3.flush();
		pw3.close();
		br.close();


		
	}
}