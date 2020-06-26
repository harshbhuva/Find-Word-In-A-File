import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FindWord
{
	public static void main(String[] args)
	{
		String fna,word,line="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter File: ");
		fna=sc.next();
		System.out.println("Enter word: ");
		word=sc.next();
		
		try
		{
			FileReader fr=new FileReader("src//"+fna);
			BufferedReader br=new BufferedReader(fr);
			
			while(line!=null)
			{
				line=br.readLine();
				if(line!=null)
				{
					if(line.indexOf(word)!=-1)
					{
						System.out.println(line);
					}
				}
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("Error Message: "+e.getMessage());
		}
	}
}
