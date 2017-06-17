package TestAndTry;

import java.text.DecimalFormat;

public class NumberToWordConversion {
	
	public static String[] tensNames={"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	public static String[] numNames={"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten", "eleven", "twelve"
			,"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	
	public static void main(String[] args){
		System.out.println("*** "+NumberToWordConversion.convert(9999999999L));
	}
	
	public static String convert(long l){
		System.out.println(l);
		if(l==0)	
			return "zero";
		String sNumber=Long.toString(l);
		System.out.println(sNumber);
		String mask="0000000000";
		
		DecimalFormat df= new DecimalFormat(mask);
		sNumber=df.format(l);
		System.out.println(sNumber);
		String result;
		int crores=Integer.parseInt(sNumber.substring(0,3));
		int lacs=Integer.parseInt(sNumber.substring(3,5));
		int thousands=Integer.parseInt(sNumber.substring(5,7));
		int hundreds=Integer.parseInt(sNumber.substring(7,10));
		
		String tradCrores;
		switch (crores) {
		case 0:
			tradCrores="";
			break;
		case 1:
			tradCrores=placeValue(crores)+" crore ";
			break;
		default:
			tradCrores=placeValue(crores)+" crore ";
			break;
		}
		result=tradCrores;
		
		String tradLacs;
		switch(lacs){
		case 0:
			tradLacs="";
			break;
		case 1:
			tradLacs=placeValue(lacs)+" lakh ";
			break;
		default:
			tradLacs=placeValue(lacs)+" lakh ";
			break;
		}
		result=result+tradLacs;
		
		String tradThousands;
		switch(thousands){
		case 0:
			tradThousands="";
			break;
		case 1:
			tradThousands=placeValue(thousands)+" thousand ";
			break;
		default:
			tradThousands=placeValue(thousands)+" thousand ";
			break;
		}
		result=result+tradThousands;
		
		 String tradHundreds;
		 tradHundreds = placeValue(hundreds);
		 result =  result + tradHundreds;
		
		 return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	private static String placeValue(int number) {
		String soFar;
	    if (number % 100 < 20){
	    	
	      soFar = numNames[number % 100];
	      number /= 100;
	      }
	    else {
	      soFar = numNames[number % 10];
	      number /= 10;
	     
	      soFar = tensNames[number % 10] + soFar;
	      number /= 10;
	    }
	    if (number == 0) 
	    	return soFar;
	    
	    return numNames[number] + " hundred " + soFar;
	}

}
