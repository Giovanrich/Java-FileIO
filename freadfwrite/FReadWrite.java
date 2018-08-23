
import java.io.*;
public class FReadWrite{
	public static void main(String[] args) throws IOException {
		/**
	    1. Create file
	    2. Write to the file
	    3. Read to the file
	    **/


	    File file = new File("file.txt");
	    file.createNewFile();
		FileWriter fw= new FileWriter(file,true); //true - to append
		fw.write(100);//will append b
		fw.write('\n');//
		fw.write("JWizard");
		fw.flush();
		fw.close();
		FileReader fr= new FileReader(file);

		// Reading using: int read()
		System.out.println("Reading using: int read()");
		//Reads one char at a time
		int ch=fr.read();
		while(ch!=-1){
			//Casting is necessary, to avoid printing ints
			System.out.println((char) ch);
			ch=fr.read();

		}

		fr.close();
		FileReader fr2= new FileReader(file);

		// Reading using: int read(char [] ch)
		System.out.println("Reading using: int read()");
		//Reads chars into an array
		char [] array=new char[(int)file.length()];
		fr2.read(array);
		for (char c : array) {
			System.out.print(c);
		}
		fr2.close();

	}
}