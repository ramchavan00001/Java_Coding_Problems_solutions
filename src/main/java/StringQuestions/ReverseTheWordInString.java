package StringQuestions;

public class ReverseTheWordInString {

		    public static void main(String[] args) {
		        String str= "Today Interview Done";
		        StringBuilder reversedWord=new StringBuilder();
		        
		        String strrev="";
		        String [] words=str.split(" ");
		        
		        for(int i=words.length-1;i>=0;i--)
		        {
		        	strrev+=words[i] +" ";
		        }
		       
		        System.out.println(strrev.trim());
		    }
		
	
}
