


import java.io.*;

public class FileClassMethods{
	public static void main(String[] args) throws IOException{
		File file= new File("file.txt");
		File directory= new File("c:\\"); // for method list()
		File delete= new File("delete.txt");

		/**
		executing file.exists() - will return False because the file 
		deos not physically exists.
		**/

		 file.createNewFile();
		 delete.createNewFile();

		 System.out.println("====================");
		 System.out.println("File exist: "+file.exists());//true
		 System.out.println("Is it a file: "+file.isFile());//true if it not a directory
		 System.out.println("Is it a directory: "+file.isDirectory());//true if it not a file
		 System.out.println("=========files and directories on C ===========");
		 String [] fileNames= directory.list();
		 for(String s1:fileNames){
		 	System.out.println(s1);
		 }

		 if(delete.exists()){
		 	System.out.println("Deleted file :"+delete.delete());
		 }

		
	}
}