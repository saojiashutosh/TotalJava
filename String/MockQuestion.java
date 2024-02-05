package TotalJava.String;
/// Longest Substring of String
public class MockQuestion {
    public static void main(String[] args ){
        String str = "Hello World , I am Ashutosh";

        str = str.replaceAll("\\s","") ;
        str = str.replaceAll(",","") ;

        String longestSubstring = findLongestSubstring(str);
        System.out.println("Longest substring of a String : " + longestSubstring);

    }

    private static String findLongestSubstring(String str) {
        int n = str.length();
        int start = 0, end;
        int maxLength = 0;
        int longestStart = 0;

        for (end = 0; end < n; end++) {

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestStart = start;
            }
        }
        // Extract the longest substring
        return str.substring(longestStart, longestStart + maxLength);
    }
}
