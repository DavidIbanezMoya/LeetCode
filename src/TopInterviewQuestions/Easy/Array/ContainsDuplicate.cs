using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Array
{
    /*Given an integer array nums, return true if any value appears at least twice in the nums, and return false if every element is distinct.
*/
    class ContainsDuplicate
    {
        internal Boolean checkDuplicate(int[]nums)
        {
            for (int i = 0; i < nums.Length; i++)
            {
                for (int j = i+1; j < nums.Length; j++)
                {
                    if (nums[i] == nums [j])
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
