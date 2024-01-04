import java.util.Arrays;

class Main {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();//make array of char
        char[] charArray2 = t.toCharArray();


        Arrays.sort(charArray);//sort the arrays
        Arrays.sort(charArray2);

        String newS = new String(charArray);//sort the arrays back to string
        String newT = new String(charArray2);

        boolean flag = newS.equals(newT);//compare

        return flag;
    }
}