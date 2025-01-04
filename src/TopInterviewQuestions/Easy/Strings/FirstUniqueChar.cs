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
            if (s.Length > Math.Pow(10, 5)) return -1;
            //We have to find which is the first character that does not repeat, so we make a substring
            int iteration = 0;
            Dictionary<Char,int> charactersPosition = new Dictionary<Char,int>();
            foreach (char character in s)
            {
                if (!charactersPosition.ContainsKey(character))
                {
                    //Make a substring for the following and already readed numbers
                    string alreadyReaded = s.Substring(0, iteration);
                    string firstNonRepeated = s.Substring(iteration + 1);
                    if (!firstNonRepeated.Contains(character) && !alreadyReaded.Contains(character))
                    {
                        return iteration;
                    }
                    else
                    {
                        charactersPosition.Add(character, iteration);
                    }                    
                }
                iteration++;
            }
            return -1;
        }
    }
}
