using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions
{

    class MainProgram
    {
        //We have a menu where we will select which exercise we want to try out


        //Flags
        static bool mainMenuFlag = true;
        static bool easyMenuFlag = false;

        //Easy Questions Menu
        static bool eMenuArrayFlag = false;
        static bool eMenuDesignFlag = false;
        static bool eMenuDynamicProgrammingFlag = false;
        static bool eMenuLinkedListsFlag = false;
        static bool eMenuMathFlag = false;
        static bool eMenuOthersFlag = false;
        static bool eMenuSortingAndSearchingFlag = false;
        static bool eMenuStringFlag = false;
        static bool eMenuTreesFlag = false;

        public static void Main (string[] args)
        {

            for (int i = 0; i < 50; i++)
            {
                Console.Write("-");
            }
            Console.WriteLine("\nWELCOME, SELECT YOUR INTERVIEW QUESTIONS LEVEL");
            for (int i = 0; i < 50; i++)
            {
                Console.Write("-");
            }

            while (mainMenuFlag)
            {
                string message = "\n\t1.Easy\n\t2.Exit program\n";
                Console.WriteLine(message);
                Console.Write("\nOption ->");
                string userOption = Console.ReadLine().ToString();
                int number = 0;
                if (checkOption(userOption,1,2,out number) != false)
                {
                    mainMenuFlag = false;
                    if (number == 1)
                    {
                        Console.WriteLine("Entering Easy Menu");
                        easyMenuFlag = true;
                    } else if (number == 2)
                    {
                        Console.WriteLine("See you soon!");
                        break;
                    }
                }
            }

            //Check the loop, and decide how to manage it, be it with a general while loop or with diferent methods
            while (easyMenuFlag)
            {
                string message = "\n\t1.Array\n\t2.Design\n\t3.Dynamic Programming\n\t4.Linked Lists\n\t5.Math\n\t6.Sorting and Searching\n\t7.Strings\n\t8.Trees\n\t9.Others\n\t10.Back to main menu";
                Console.WriteLine(message);
                Console.Write("\nOption ->");
                string userOption = Console.ReadLine().ToString();
                int number = 0;
                if (checkOption(userOption, 1, 10, out number) != false)
                {
                    easyMenuFlag = false;
                    if (number == 10)
                    {
                        Console.WriteLine("Entering main menu");
                        mainMenuFlag = true;
                    }
                }
            }



        }

        private static bool checkOption (string option,int minSelectable, int maxSelectable, out int number)
        {
            int optionAsInt = 0;
            if (int.TryParse(option,out optionAsInt))
            {

            } else
            {
                Console.WriteLine("The number must be an integer!");
            }
            number = optionAsInt;

            if (optionAsInt < minSelectable || optionAsInt > maxSelectable)
            {
                Console.WriteLine("The number must be within the range");
                return false;
            }
            else
            {
                return true;
            }
        }
    }
}
