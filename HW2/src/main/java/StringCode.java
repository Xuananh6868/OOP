import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
        if (str.length() == 0) return 0;
        int n = str.length();
        int count = 1;
        int max = 1;
        for(int i=1; i < n; i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
                max= Math.max(max,count);
            } else {
                count = 1;
            }
        }
        return max;
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isDigit(c) && i + 1 < str.length()){
                int m = Character.getNumericValue(c);
                char next = str.charAt(i+1);
                for(int j = 0; j < m ; j++){
                    result.append(next);
                }
            } else if (!Character.isDigit(c)) {
                result.append(c);
                }
            }

        return result.toString();

	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
        HashSet <String> set = new HashSet<>();
        for(int i = 0; i < a.length() - len; i++) {
            set.add(a.substring(i,i+len));
        }
        for(int i = 0; i < b.length() - len; i++) {
            for(String str : set){
                String s = b.substring(i,i+len);
                if(str.equals(s)) return true;
            }
        }
		return false; // YOUR CODE HERE
	}
}
