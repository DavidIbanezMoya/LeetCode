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
                string message = "\n\t1.Easy\n\t2.Normal\n\t3.Hard\n\t4.Exit program\n";
                Console.WriteLine(message);
                Console.Write("\nOption ->");
                string userOption = Console.ReadLine().ToString();
                int number = 0;
                if (checkOption(userOption,1,4,out number) != false)
                {
                    if (number == 1)
                    {
                        Console.WriteLine("Entering Easy Menu");
                        easyMenuFlag = true;
                        easyMenu();
                        
                    }
                    else if (number == 2)
                    {
                        Console.WriteLine("Normal questions are not yet finished!");
                    }
                    else if (number == 3)
                    {
                        Console.WriteLine("Hard questions are not yet finished!");
                    }
                    else if (number == 4)
                    {
                        mainMenuFlag = false;
                        Console.WriteLine("See you soon!");
                        break;
                    }
                }
            }





        }

        private static void easyMenu ()
        {
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
                    if (number == 1)
                    {
                        eMenuArrayFlag = true;
                        System.Console.WriteLine("Entering the Array menu");
                        easyArrayMenu();
                    } else if (number == 2)
                    {
                        eMenuDesignFlag = true;
                        System.Console.WriteLine("Entering the Design menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 3)
                    {
                        eMenuDynamicProgrammingFlag = true;
                        System.Console.WriteLine("Entering the Dynamic Programming menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 4)
                    {
                        eMenuLinkedListsFlag = true;
                        System.Console.WriteLine("Entering the Linked Lists menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 5)
                    {
                        eMenuMathFlag = true;
                        System.Console.WriteLine("Entering the Math menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 6)
                    {
                        eMenuSortingAndSearchingFlag = true;
                        System.Console.WriteLine("Entering the Sorting and Searching menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 7)
                    {
                        eMenuStringFlag = true;
                        System.Console.WriteLine("Entering the String menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 8)
                    {
                        eMenuTreesFlag = true;
                        System.Console.WriteLine("Entering the Trees menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 9)
                    {
                        eMenuOthersFlag = true;
                        System.Console.WriteLine("Entering the Others menu");
                        easyMenuFlag = false;
                    }
                    else if (number == 10)
                    {
                        easyMenuFlag = false;
                        Console.WriteLine("Entering main menu");
                        mainMenuFlag = true;
                    }
                }
            }
        }

        private static void easyArrayMenu()
        {
            //Check the loop, and decide how to manage it, be it with a general while loop or with diferent methods
            while (easyMenuFlag)
            {
                string message = "\n\t1.Buy and sell stock\n\t2.Contains Duplicate\n\t3.Remove Duplicate\n\t4.Rotate Array\n\t5.Valid Sudoku\n\t6.Single Number\n\t7.Intersection of Two Arrays II\n\t8.Plus One\n\t9.Move Zeroes\n\t10.Two Sum\n\t11.Rotate Image\n\t12.Back to Easy Menu";
                Console.WriteLine(message);
                Console.Write("\nOption ->");
                string userOption = Console.ReadLine().ToString();
                int number = 0;
                if (checkOption(userOption, 1, 10, out number) != false)
                {
                    //We should instantiate the class so we can go through the different Arrays methods
                    if (number == 1)
                    {

                    }
                    else if (number == 2)
                    {

                    }
                    else if (number == 3)
                    {

                    }
                    else if (number == 4)
                    {

                    }
                    else if (number == 5)
                    {

                    }
                    else if (number == 6)
                    {

                    }
                    else if (number == 7)
                    {

                    }
                    else if (number == 8)
                    {

                    }
                    else if (number == 9)
                    {

                    }
                    else if (number == 10)
                    {

                    }
                    else if (number == 11)
                    {

                    }
                    else if (number == 12)
                    {
                        eMenuArrayFlag = false;
                        Console.WriteLine("Entering easy menu");
                        easyMenuFlag = true;
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
