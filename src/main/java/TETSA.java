import java.util.HashSet;

public class TETSA {
	public static void main()
	{
		int[] nums = {2,2,3,1};
		HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        System.out.println(set);
	}
}
