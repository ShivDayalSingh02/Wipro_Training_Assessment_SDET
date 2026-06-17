package arrayclasses;
import java.io.*;
 
public class ReplaceWords {
 
	public static void main(String[] args) throws IOException {
		// create file
		File f1=new File("Text.txt");
		f1.createNewFile();
		// write file
		BufferedWriter bw=new BufferedWriter(new FileWriter("Sample.txt"));
		bw.write("Hello Welcome to Java Learning ");
		bw.close();
		//read file
		BufferedReader br=new BufferedReader(new FileReader("Sample.txt"));
        String l1;
        while((l1=br.readLine())!=null)
        {
        	System.out.println(l1);
        	System.out.println(l1.replace("Java","Python"));
        }
        br.close();
	}
 
}
// Write a program to replace words(Python==>JAva)

