package Top100.Hashing;

public class Main {
    public static void main(String[] args) {
        /*TwoSum sum = new TwoSum();
        int[] nums = {0,4,3,0};
        System.out.println(sum.twoSum(nums,0));*/

        GroupAnagrams anagrams = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        anagrams.groupAnagrams(strs);

    }
}
