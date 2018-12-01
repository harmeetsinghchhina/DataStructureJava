import java.io.*;
public class FileReaderClass {
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("FileText.txt");
		int temp;
		while((temp = fr.read()) != -1)
		{
			System.out.print((char)temp);
		}
		fr.close();
	}
}