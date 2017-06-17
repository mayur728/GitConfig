package String.Operations;

public class StringReverse {
	
	public static String getReverStringByRecursion(String str){
		if(str.length() <= 1){

		      return str;

		   }
		   System.out.println("str.substring(1): "+str.substring(1)+" str.charAt(0): "+str.charAt(0));
		   return (getReverStringByRecursion(str.substring(1)) + str.charAt(0));
	}
	public static String getReverStringByIterator(String str){
		StringBuffer strBuffer = new StringBuffer(str.length());

		   for(int counter=str.length()-1 ; counter>=0;counter--){

		      strBuffer.append(str.charAt(counter));

		   } 

		   return strBuffer.toString();
		
		
	}
	
	public static void main(String args[]){
		System.out.println(getReverStringByIterator("Mayur"));
		System.out.println(getReverStringByRecursion("Agrawal"));
		System.out.println(new StringBuffer("DON").reverse().toString());
	}
	
	public boolean equals(){
		return false;
		
	}
}
