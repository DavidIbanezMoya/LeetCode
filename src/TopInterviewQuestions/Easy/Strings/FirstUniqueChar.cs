using System;
using System.CodeDom;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Strings
{
    class FirstUniqueChar
    {
        public int FirstUniqChar(string s)
        {
            Dictionary<int,string> seen = new Dictionary<int, string>();
            //We have to find which is the first character that does not repeat
            int iteration = 0;
            foreach (char character in s)
            {
               string firstNonRepeated = s.Substring(iteration + 1);
               iteration ++;
               if (firstNonRepeated.Contains(character))
                {
                    return iteration;
                } 
            }

            return -1;
        }
    }
}
