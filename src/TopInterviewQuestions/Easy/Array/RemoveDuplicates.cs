using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Array
{
    /*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
     * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
    The remaining elements of nums are not important as well as the size of nums.
Return k.*/
    class RemoveDuplicates
    {
        public int RemoveDuplicatesSolution(int[] nums)
        {
            List<int> numsList = new List<int>(nums);
            
            for (int i = 0; i < numsList.Count; i++)
            {
                //Iterates over every number and checks if there is a duplicate in the next one
                if (i+1 < numsList.Count) {
                    if (numsList[i] == numsList[i+1])
                    {
                        numsList.RemoveAt(i);
                    }
            }
            }
            int[] array = numsList.ToArray();
            
            return array.Length;
        }
   

    }
}
