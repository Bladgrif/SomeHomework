package SomeHomework;


import java.util.stream.Stream;

class Solution {
    public static String copy(String s) {
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString();
    }
}
//{0,1,2,2,3,0,4,2};


