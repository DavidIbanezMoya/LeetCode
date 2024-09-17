using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Array
{
    class MainArray
    {
        public static void Main(string[] args)
        {
            //Remove Duplicates
            RemoveDuplicates removeDuplicates = new RemoveDuplicates();
            removeDuplicates.RemoveDuplicatesSolution(new int[] { 1,1,2});

            //Contains Duplicates
            ContainsDuplicate containsDuplicate = new ContainsDuplicate();
            //containsDuplicate.checkDuplicate(new int[] { 1, 2, 3 });
        }
    }
}
