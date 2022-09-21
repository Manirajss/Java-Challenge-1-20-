package whatsappassign;

public class HelloWorld {
	public int LastWord(final String a) {
		int count=0;
		String s1=a.trim();
		
for (int i = 0; i <s1.length(); i++) {
			if(s1.charAt(i)==' ') 
				count=0;
				else 
					count++;
				}
return count;
}

	public static void main(String[] args) {
		String s = "Hello World";
		//char[] charArray = s.toCharArray();
		//System.out.print("The last word is");
		//for (int i = charArray.length-1; i >=0 ; i--) {
			//if(charArray[i]==' ') {
				//break;
			//}
			//System.out.print(charArray[i]);
		//}
		//Input: s = "Hello World";
			//	Output: 5
				//Explanation: The last word is "World" with length 5.
		HelloWorld len=new HelloWorld();
		//System.out.println("The last word is: "+len.LastWord());
		System.out.println("The length of the last word is: "+len.LastWord(s));
		
}

	
}
