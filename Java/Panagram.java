import java.util.Scanner;
class Panagram 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=scn.next();
		s=s.toLowerCase();
		boolean flag=true;
		int[] newArr=new int[26];
		char[] charArr=s.toCharArray();

		for(int i=0;i<charArr.length;i++)
		{
			char ch=charArr[i];
			int index=ch-'a';
			newArr[index]=1;
		}

		for(int i=0;i<newArr.length;i++)
		{
			if(newArr[i]!=1)
			{
				flag=false;
				System.out.println("Not An Anagram");
				break;
			}
		}

		if(flag)
			System.out.println("Anagram");
	}
}