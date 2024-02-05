package TotalJava.String;

public class MockQuestion {
    public static void main(String[] args ){
        String str = "Hello World , I am Ashutosh";
        str = str.replaceAll("\\s","") ;
        System.out.println(str);
        str = str.replaceAll(",","") ;
        System.out.println(str);

//        for(int i = 0;i<str.length();i++){
//            int start = i ;
//            for(int j = 1;j<str.length();j++){
//                int end = j;
//                for(int k=start;k<=end;k++){
//                    System.out.print(str.charAt(k));
//                }
//                System.out.println();
//            }
//        }

        String longestSubstring = findLongestSubstring(str);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
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
                System.out.print(str.charAt(start));
                System.out.print(str.charAt(end));
            }
            System.out.println();
        }
        // Extract the longest substring
        return str.substring(longestStart, longestStart + maxLength);
    }
}
