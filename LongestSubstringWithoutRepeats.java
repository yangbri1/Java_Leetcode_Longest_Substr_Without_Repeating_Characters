class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstrCount = 0;
        int temp = 0;
        // create an empty 'LinkedHashSet' to append unique 'Character'
        Set<Character> substringSet = new LinkedHashSet<Character>();
        // iterate via given 'String' s s.t. ...
        for(int i = 0; i < s.length(); ++i){
            char currentChar = s.charAt(i);
            // if the selected 'char' is NOT within 'Set' ... append 'char' to the 'Set' & ..
            if(substringSet.add(currentChar) == true){
                // increment 'temp' counter by 1
                temp += 1;
            }
            // otw if selected 'char' EXISTS within 'Set' ...
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
                // loop thru remainder substring of the given 'String' s ...
                int j = 0;
                while(substrLength < s.length() && j < substrLength){
                    /* wait ... the thinking here seems a bit cyclical --- ... recursion? or use an utility fn? */
                    // if 'substringSet' DN currently have this 'char' ...
                    if(substringSet.contains(substr.charAt(j)) == false){
                        // include it ...
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