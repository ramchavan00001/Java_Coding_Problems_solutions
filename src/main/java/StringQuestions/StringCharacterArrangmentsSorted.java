package StringQuestions;

import java.util.*;
public class StringCharacterArrangmentsSorted {
	
	public static void main(String [] args)
	{
		String str ="C3A1B2";
		
		List<Character> letters=new ArrayList<>();
		List<Character> digits=new ArrayList<>();
		StringBuilder sortedString=new StringBuilder();
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				letters.add(ch);
	
			}
			else
			{
				digits.add(ch);
			}
		}
		
		Collections.sort(letters);
		Collections.sort(digits);
		
		//sortedString.append(letters).append(digits);
		for(char ch:letters)
		{
			sortedString.append(ch);
		}
		for(char ch:digits)
		{
			sortedString.append(ch);
		}
		
		System.out.print(sortedString);
		
		
	}

}
