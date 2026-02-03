package Prep;

import java.util.Arrays;

public class ReverseAWordinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Without Lib Class
		String sentence = "I am Abhishek";
		char[] chars = sentence.toCharArray();
		String word = "";
		String result = "";
		for (int i = chars.length - 1; i >= 0; i--) {
		    if (chars[i] == ' ') {
		        result += word + " ";
		        word = "";
		    } else {
		        word = chars[i] + word;
		    }
		}
		result += word;

		System.out.println(result);
		

		
//		By Split() method
		String[] sen = sentence.split(" ");
		String revWord ="";
		for(int i = sen.length - 1; i >=0; i--  )
		{
			revWord += sen[i] + " ";
		}
		System.out.println(revWord);
		

//		By String Builder
		StringBuilder build = new StringBuilder();
		for(int i = sen.length - 1; i >=0; i--  )
		build.append(sen[i]).append(" ");
		
		System.out.println(build.toString().trim());
		
		
//		By Streams
		String Rev = Arrays.stream(sentence.split(" ")).reduce((w1,w2) -> w2 + " " + w1).orElse("");
		System.out.println(Rev);
		
		
		

	}

}
