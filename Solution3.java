import java.io.*;

public class Solution3
{


	public String repeatSeparator(String word, String sep, int count) 
	{
	  String newWord = "";
		for (int i = 0; i < count; i++)
		{
			if (i < count-1)
				newWord += word + sep;
			else
				newWord += word;
		}
	  return newWord;

	}
	public static void main(String[] args)
	{
		Solution3 s3=new Solution3();
		System.out.println(s3.repeatSeparator("word","x",2));
	}
}
