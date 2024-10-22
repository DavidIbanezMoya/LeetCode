using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Strings
{
    class FirstUniqueChar
    {
        public int FirstUniqChar(string s)
        {
            //We have to find which is the first character that does not repeat
            foreach (char character in s)
            {
                Console.WriteLine(character);
            }

            return 0;
        }
    }
}
