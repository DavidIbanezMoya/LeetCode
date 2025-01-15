using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetCode.src.TopInterviewQuestions.Easy.Array
{
    /*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows
     * in both arrays and you may return the result in any order.*/
    internal class IntersectionOfTwoArraysII
    {
        public int[] Intersect(int[] nums1, int[] nums2)
        {
            List<int> intersectedList = new List<int>();
            Dictionary<int, int> dictionary = new Dictionary<int, int>();

            if (nums1.Length == 0 || nums2.Length == 0 || nums1.Length >= 1000 || nums2.Length >= 1000) { return new int[0]; }

            //Need to keep track of those who may have the same number more than once
            for (int i = 0; i < nums1.Length; i++)
            {
                dictionary.Add(i, nums1[i]);
            }
            for (int i = 0; i < nums2.Length; i++)
            {
                if (dictionary.ContainsValue(nums2[i]))
                {
                    intersectedList.Add(nums2[i]);
                    var num = dictionary.First(n => n.Value == nums2[i]);
                    dictionary.Remove(num.Key);
                }
            }
            int[] intersectedArray = intersectedList.ToArray();
            return intersectedArray;
        }
    }
}
