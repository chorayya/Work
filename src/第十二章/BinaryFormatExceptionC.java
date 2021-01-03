package µÚÊ®¶þÕÂ;

import java.util.Scanner;

public class BinaryFormatExceptionC {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {
		System.out.print("Enter a bin2 number:");
		String bin2 = input.next();
		System.out.println("The decimal value for bin2 number "
				+ bin2 + " is " + bin2ToDecimal(bin2));
		}
		catch(BinaryFormatException ex) {
			System.out.println(ex.toString() + " not a bin2 string.");
		}

	}
	public static int bin2ToDecimal (String bin2) throws BinaryFormatException {
		int bin2imalValue=0;
		for (int i = 0; i < bin2.length(); i++) {
			char hexChar = bin2.charAt(i);
			int judge=bin2CharToDecimal(hexChar);
			if(judge==-1) {
				throw new BinaryFormatException(bin2);
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

class BinaryFormatException extends Exception {
	private String bin2;
	public BinaryFormatException(String bin2) {
		this.bin2 = bin2;
	}

	@Override
	public String getMessage() {
		return this.bin2;
	}

}
