
public class ReverseString {
	public static void main(String[] args) {
		String r = reverse("dog");
		
		System.out.println(r);

	}

	public static String reverse(String s) {
		char[] letters = new char[s.length()];

		int letterindex = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			letters[letterindex] = s.charAt(i);
			letterindex++;
		}
		String reverse="";
		for(int i=0;i<s.length();i++) {
			reverse+=letters[i];
			
		}
		return reverse;
	}

}
