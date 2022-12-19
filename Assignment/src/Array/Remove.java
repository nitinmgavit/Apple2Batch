package Array;
// 4.Remove all the occurrences of the word in the given string (without using replace function)
public class Remove {
	
	public static String removechar(String word, char ch)
    {
        StringBuilder s = new StringBuilder(word);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                s.deleteCharAt(i);
                i--;
            }
        }
 
        return s.toString();
    }
 
    // driver's code
    public static void main(String args[])
    {
        String word = "Good Morning Golu";
        char ch = 'o';
        System.out.println(removechar(word, ch));
    }

}
