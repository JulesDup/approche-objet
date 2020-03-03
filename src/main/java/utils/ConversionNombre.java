package utils;

public class ConversionNombre {

	public static void main(String[] args) {
		String numString = "123456789";
		int numInt;
		numInt = Integer.parseInt(numString);
		System.out.println(numInt);

		int a=42;
		int b=69;
		
		int rslt = Integer.max(a, b); 
		System.out.println(rslt);
	}

}
