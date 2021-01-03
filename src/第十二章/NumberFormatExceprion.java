package µÚÊ®¶þÕÂ;
import java.util.Scanner;
public class NumberFormatExceprion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {
		System.out.print("Enter a hex number:");
		String hex = input.next();
		System.out.println("The decimal value for hex number "
				+ hex + " is " + hexToDecimal(hex));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.toString() + " not a hex string.");
		}

	}
	public static int hexToDecimal (String hex) throws NumberFormatException {
		int decimalValue=0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			int judge=hexCharToDecimal(hexChar);
			if(judge==-1) {
				throw new NumberFormatException(hex);
			}
			else
				decimalValue += judge*Math.pow(16, (hex.length()-i-1));
			
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal (char ch) {
		if (ch >='A' && ch <= 'F')
			return 10+ch-'A';
		else if(ch >='0' && ch <='9')
			return ch-'0';
		else
			return -1;
	}
	
}



