package com.example;
// Though making a class here. We can implement an Interface for this. 
// The implementing class will take parameters for trucncating string so we can truncate the string with 
// any string the class want to truncate with and not just by =>" ... (truncated) ... "
public class Truncate {
	public String truncate(String longString, int lenFinal){
		//calculate indexes. 
		int length = longString.length() ;
		String replacingString = " ... (truncated) ... ";
		int lenReplacingString = replacingString.length();
		int diff = lenFinal -lenReplacingString ;
		if (length <= lenFinal || diff<0){
			return longString;
		}
		else{
			//Calculate where to start and end string replacement 
			//find a mid, use indexes to replace. 
			
			diff = (length-lenFinal+lenReplacingString)/2;
			int mid = length/2;
			String replacedString = longString.substring(0,mid-diff)+replacingString+longString.substring(mid+diff,length);
			System.out.println(replacedString);
			System.out.println(replacedString.length());
			if (replacedString.length()>lenFinal)
				return longString;
			
			else
				return replacedString;
		}	
	}
}
