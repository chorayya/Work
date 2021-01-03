package µÚÊ®¶þÕÂ;
import java.util.Scanner;
public class NumberFormatExceprion1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {
		System.out.print("Enter a bin2 number:");
		String bin2 = input.next();
		System.out.println("The decimal value for bin2 number "
				+ bin2 + " is " + bin2ToDecimal(bin2));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.toString() + " not a bin2 string.");
		}

	}
	public static int bin2ToDecimal (String bin2) throws NumberFormatException {
		int bin2imalValue=0;
		for (int i = 0; i < bin2.length(); i++) {
			char hexChar = bin2.charAt(i);
			int judge=bin2CharToDecimal(hexChar);
			if(judge==-1) {
				throw new NumberFormatException(bin2);
			}
			else
				bin2imalValue += judge*Math.pow(2, (bin2.length()-i-1));
			
		}
		return bin2imalValue;
	}
	
	public static int bin2CharToDecimal (char ch) {
		if (ch =='0' ||ch=='1')
			return (ch-'0');
		else
			return -1;
	}

	}


