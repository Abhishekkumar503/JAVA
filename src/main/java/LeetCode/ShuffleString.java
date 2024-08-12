package LeetCode;

public class ShuffleString {
    public static void main(String[] args) {
    // 1528. Shuffle String
        int[] i ={4,5,6,7,0,2,1,3};
        String str="codeleet";
        System.out.println(restoreString(str,i));
    }
    public static String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] ch=new char[n];
        for (int i = 0; i < n; i++) {
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
}

/*
OUTPUT
leetcode

 */