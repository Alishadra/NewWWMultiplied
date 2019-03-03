package org.multiplied;

public class Multiplied {

	public static void main(String[] args) {

		int factor = 1234;
		int multiplied = 123;
		
		String res = getRsult(factor, multiplied);
		
		System.out.println(res);
		
	}

	private static String getRsult(int factor, int multiplied) {

		String res = "";
		
		int finalLength = String.valueOf(factor*multiplied).length();
		res += getSpaces(finalLength - String.valueOf(factor).length()) + factor + "/n";
		res += getSpaces(finalLength - String.valueOf(multiplied).length() - 1) + "*" + multiplied + "/n";
		res += getSpaces(finalLength - String.valueOf(multiplied).length()) + getMinuses(String.valueOf(multiplied).length()) + "/n";
		res += getRows(finalLength, factor, multiplied);
		res += getMinuses(finalLength) + "/n" + (factor*multiplied);
		
		
		
		return res;
	}

	private static String getSpaces(int i) {
		String spaces = "";
		
		for (int j = 0; j < i; j++) {
			spaces += " ";
			
		}
		return spaces;
	}

	private static String getMinuses(int finalLength) {

		String minuses = "";
		
		for (int j = 0; j < i; j ++) {
			minuses += "-";
		}
		return minuses;
	}

	private static String getRows(int finalLength, int factor, int multiplied) {

		String result = "";
		char [] numb = String.valueOf(multiplied).toCharArray();
		
		int counter = 0;
		
		for(int i = (numb.length - 1); i >= 0; i --) {
			int num = Character.getNumericValue(numb[i]);
			int rowResult = factor*num;
			result += getSpaces(fLength - (String.valueOf(rowResult).length() + counter)) + rowResult + "\n";	
			counter++;
			
		}
		
		return result;
	}


}
