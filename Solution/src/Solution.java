import java.util.Scanner;
class Solution {
    public static void twoSum(int[] nums, int target) {
        int sum = 0;
        int[] ret = new int[2];
        for(int i = 0;i<nums.length;i++)
        {
            for (int j = i+1 ;j<nums.length;j++)
            {
                sum = nums[i] + nums[j];
                if (target == sum)
                {
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        System.out.println(ret[0] + " " + ret[1]);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Numbers");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Values");
        for(int i = 0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter Target");
        int target = sc.nextInt();
        twoSum(nums,target);

    }
}
