package Top100.Misc;

public class Main {
    public static void main(String[] args) {
        //SingleNumber singleNumber = new SingleNumber();
        //int[] nums = {2, 4, 6, 2, 4};
        //singleNumber.singleNumber(nums);
        /*MajorityElement majorityElement = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        majorityElement.majorityElement(nums);*/
        SortColors colors = new SortColors();
        int[] colorsArray = {2,0,2,1,1,0};
        colors.sortColors(colorsArray);
    }
}
