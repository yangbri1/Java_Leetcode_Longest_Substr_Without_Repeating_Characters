class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstrCount = 0;
        int temp = 0;
        Set<Character> substringSet = new LinkedHashSet<Character>();
        for(int i = 0; i < s.length(); ++i){
            char currentChar = s.charAt(i);
            if(substringSet.add(currentChar) == true){
                temp += 1;
            }
            else if(substringSet.add(currentChar) == false){
                int newIndexStart = s.indexOf(currentChar);
                String substr = s.substring(newIndexStart);
                int substrLength = substr.length();
                int j = 0;
                while(substrLength < s.length()){
                    if(substr)
                }
                if(temp > longestSubstrCount){
                    longestSubstrCount = temp;
                    temp = 0;
                }
            }
            longesetSubStrCount
        }
        // for(char ch : s.toCharArray()){
        //     if(substringSet.add(ch) == true){
        //         longestSubstrCount += 1;
        //     }
        //     else if(substringSet.add(ch) == false){

        //     }
        // }
    }
}