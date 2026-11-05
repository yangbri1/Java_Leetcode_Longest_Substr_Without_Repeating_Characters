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
                // utilize String's '.indexOf()' to find the index for first appearance of where the duplicate 'char' showed up 
                int newIndexStart = s.indexOf(currentChar);
                // iniitalize 'substr' to be the rest of the given String 's' excluding the 'char' leading up to the duplicate 'char' inclusively
                String substr = s.substring(newIndexStart + 1);
                // Note: 'Math.min()' prevents 'NoSuchElementException()' for if 'Set' has less than 'newIndexStart' elems ...
                int count = Math.min(newIndexStart, substringSet.size());

                Iterator<Character> itr = substringSet.iterator();
                // iterate thru 'substringSet' ...
                for(int j = 0; j < count; ++j){
                    // checks if there is a next elem '.next(0)'
                    String removed = itr.next();
                    // call '.remove()' to dispel the particular 'char' up to 'newIndexStart' index
                    itr.remove();
                }

                // if(!substringSet.isEmpty()){
                //     Iterator<Character> itr = substringSet.iterator();
                //     String removed = itr.next();
                //     itr.remove();
                // }
                
                int substrLength = substr.length();
                int j = 0;
                while(substrLength < s.length() && j < substrLength){
                    if(substringSet.contains(substr.charAt(j)) == false){

                    }
                    else{
                        
                    }
                    ++j;
                }
                if(temp > longestSubstrCount){
                    longestSubstrCount = temp;
                    temp = 0;
                }
            }
            // longesetSubStrCount
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