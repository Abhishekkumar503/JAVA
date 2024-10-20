package Binary_Search.InterviewPrep;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char  target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1,mid=(start+end)/2;
        while (start <= end) {
            mid = start + (end - start) / 2; // Prevents overflow
            if (target < letters[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
}
