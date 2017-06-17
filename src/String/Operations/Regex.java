package String.Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String args[]){
		String email="mmayur728@gmail.com";
		String regex="^(.{3})(.*)(.{2})@";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(email);
		if(match.find()){
			String s=match.group(2);
			char[] chars=new char[s.length()];
			Arrays.fill(chars, '*');
			String replace=new String(chars);
			System.out.println(email.replaceFirst(s, replace));
			
		}
		
		HashMap m=new HashMap();
		m.put(901, "A");
		m.put(102, "A");
		m.put(103, "A");
		m.put(704, "A");
		m.put(105, "A");
		m.put(106, "A");
		m.put(707, "A");
		m.put(808, "A");
		m.put(109, "A");
		m.put(110, "A");
		m.put(111, "A");
		m.put(101, "A");
		m.put(104, "A");
		m.put(107, "A");
		m.put(108, "A");
		m.put(1, "A");
		System.out.println(m);
		System.out.println(m.size());
		int[] i=new int[5];
		i[1]=5;
		i[3]=9;
		System.out.println(i.length);
		ArrayList al=new ArrayList(5);
		System.out.println(al.size());
		Vector v=new Vector();
		System.out.println(v.size()+": "+v.capacity());
	}
}
	/*
	
	
//	public static void main(String args[]){
//		String email = "someone@gmail.com";
//        String hidden = "";
//        Matcher m = Pattern.compile("\\w{0}(.*)@").matcher(email);
//        if (m.find()) {
//            String s = m.group(1);
//             System.out.println(m.group(1)+" : "+m.group(2)+" : "+m.group(3)+" : "+m.group(4)+ " : ");
//           // String k = m.group(2);
//            System.out.println("s: "+s);
//            char[] c = new char[s.length()];
//            Arrays.fill(c, '*');
//            hidden = email.replace(s, String.valueOf(c));
//        }
//        System.out.println(hidden);
//	}
	
	public static String maskEmail(int leadingUnmasketChars, int trailingUnmasketChars, String input) {
	    String output = "";
	    String regex = "^(.{0})(.*)(.{0})@(.*)";
	    Matcher m = Pattern.compile(regex).matcher(input);

	    if (m.find()) {
	        String stringToReplace = m.group(2);

	        //System.out.println(m.group(1)+" : "+m.group(2)+" : "+m.group(3)+" : "+m.group(4)+ " : ");
	        char[] chars = new char[stringToReplace.length()];

	        Arrays.fill(chars, '*');

	        String replacement = new String(chars);
output = input.replaceAll(stringToReplace, replacement);

	    }

	    return output;
	}
	public static void main(String[] args) {
	    int leadingUnmasketChars = 4;
	    int trailingUnmasketChars = 5;
	    String email = "someo012231asASDFfd241A2ne@gmail.com";
	    Matcher match=Pattern.compile("^(.{4})(.*)(.{0}).com").matcher(email);
	    if(match.find()){
	    	char[] chars=new char[match.group(2).length()];
	    	Arrays.fill(chars, '*');
	    	System.out.println(email.replaceAll(match.group(2), new String(chars)));
	    	
	    }/
	    
	    String maskedEmail = maskEmail(leadingUnmasketChars, trailingUnmasketChars, email);
	    System.out.println(email);
	    System.out.println(maskedEmail);
	}
}
*/