import java.io.*;
public class BufferedWriterDemo{
	public static void main(String[] args) throws IOException{
		File file = new File("file.txt");
		file.createNewFile();
		FileWriter fw= new FileWriter(file);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(100);// d
		bw.newLine(); // avoiding \n in FW
		char [] charArray={'A','B','C'};//ABC
		bw.write(charArray);
		bw.flush();
		bw.close();

	}
}