package whatsappassign;

public class Moon {
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
		String s = "   fly me   to   the moon  ";
		Moon len=new Moon();
		System.out.println("The length of the last word is: "+len.LastWord(s));
		// TODO Auto-generated method stub
	//	Input: s = "   fly me   to   the moon  "
		//		Output: 4
			//	Explanation: The last word is "moon" with length 4.
	}

}
