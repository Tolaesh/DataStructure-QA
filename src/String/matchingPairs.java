package String;

public class matchingPairs {
    //Input
    //s and t are strings of length, N is between 2 and 1,000,000
    //Output
    //Return an integer denoting the maximum number of matching pairs
    //Example 1
    //s = "abcd"
    //t = "adcb"
    //output = 4
    //Explanation:
    //Using 0-based indexing, and with i = 1 and j = 3, s[1] and s[3] can be swapped, making it  "adcb".
    //Therefore, the number of matching pairs of s and t will be 4.
    //Example 2
    //s = "mno"
    //t = "mno"
    //output = 1
    //Explanation:
    //Two indices have to be swapped, regardless of which two it is, only one letter will remain the same. If i = 0 and j=1, s[0] and s[1] are swapped, making s = "nmo", which shares only "o" with t.
    public static int checkMatch(String s, String t) {
        int count = 0;
        if (s.length() == t.length() && s.equals(t)) {
            count = 1;
        }

        return count;
    }
    public static void main(String[] args){
        String s ="Mno";
        String t ="Mno";
        System.out.println(checkMatch(s,t));
    }
}
