import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class P28 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入一個整數");
		
		BufferedReader br1=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br1.readLine();
		
		int num = Integer.parseInt(str1);
	
		System.out.println("您輸入的字串是:"+num);
		
		System.out.println("清輸入字串");
		
		BufferedReader br2=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str2=br2.readLine();
		
		System.out.println("剛剛輸入的字串是:"+ str2);
	}
}
