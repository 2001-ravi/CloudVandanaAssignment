import java.util.Scanner;
public class RomanToInteger {
    public static int romanToInt(String s)
	{
        int result = 0;
        int prevValue = 0;

        for (int i = s.length()-1; i >= 0; i--)
		{
            char c = s.charAt(i);
            int currValue = 0;

            switch (c) 
			{
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
            }

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a RomanNumber:");
        String roman =scn.next();
        int intValue = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is " + intValue);
    }
}
