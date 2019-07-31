import java.util.Arrays;

public class AnagramString
{
	public static void main(String args[])
	{
		if (args.length!=2){
			System.out.println("Invalid Parameters\nValid Format:\n java <filename> <Anagram String 1> <Anagram String 2>\n E.g: java AnagramString cat act");
		}
		if(args[0].length() != args[1].length())
		{
			System.out.println("Invalid String");
		}
		char[] anagramString1 = args[0].toCharArray();
		char[] anagramString2 = args[1].toCharArray();
		
		Arrays.sort(anagramString1);
		Arrays.sort(anagramString2);
		
		if(Arrays.equals(anagramString1,anagramString2))
		{
			System.out.println("Anagram String");
		}else{
			System.out.println("Not Anagram String");
		}
	}
}