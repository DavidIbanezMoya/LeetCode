using LeetCode.src.TopInterviewQuestions.Easy.Array;
using LeetCode.src.TopInterviewQuestions.Easy.Strings;
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
            //We create the loop within a method
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
                        easyStringMenu();
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
            while (eMenuArrayFlag)
            {

                string message = "\n\t1.Buy and sell stock\n\t2.Contains Duplicate\n\t3.Remove Duplicate\n\t4.Rotate Array\n\t5.Valid Sudoku\n\t6.Single Number\n" +
                    "\t7.Intersection of Two Arrays II\n\t8.Plus One\n\t9.Move Zeroes\n\t10.Two Sum\n\t11.Rotate Image\n\t12.Back to Easy Menu";
                Console.WriteLine(message);
                Console.Write("\nOption ->");
                string userOption = Console.ReadLine().ToString();
                int number = 0;
                if (checkOption(userOption, 1, 12, out number) != false)
                {
                    //We should instantiate the class so we can go through the different Arrays methods
                    if (number == 1)
                    {
                        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
                        buyAndSellStock.MaxProfit(new int[] { 2, 1, 2, 0, 1 });
                    }
                    else if (number == 2)
                    {
                        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
                        containsDuplicate.checkDuplicate(new int[] { 1, 2, 3 });
                    }
                    else if (number == 3)
                    {
                        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
                        removeDuplicates.RemoveDuplicatesSolution(new int[] { 1,1,2});
                    }
                    else if (number == 4)
                    {
                        RotateArray rotate = new RotateArray();
                        rotate.Rotate(new int[] {1},1);
                    }
                    else if (number == 5)
                    {
                        //Board for sudoku
                        char[][] board = new char[9][] {
                        new char[] { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
                        new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                        new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                        new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                        new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                        new char[] { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                        new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                        new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                        new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' }};

                        ValidSudoku sudoku = new ValidSudoku();
                        sudoku.IsValidSudoku(board);
                    }
                    else if (number == 6)
                    {

                    }
                    else if (number == 7)
                    {
                        int[] nums1 = { 1,2,2,1};
                        int[] nums2 = { 2, 2 };
                        IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
                        intersectionOfTwoArraysII.Intersect(nums1, nums2);
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

        private static void easyStringMenu()
        {
            while (eMenuStringFlag)
            {

                string message = "\n\t1.Reverse String\n\t2.Reverse Integer\n\t3.First Unique Character in a String\n\t4.Valid Anagram\n\t5.Valid Palindrome\n\t6.String to integer\n" +
                    "\t7.Implement strStr()\n\t8.Longest Common Prefix\n\t10.Back to Easy Menu";
                Console.WriteLine(message);
                Console.Write("\nOption ->");
                string userOption = Console.ReadLine().ToString();
                int number = 0;
                checkOption(userOption, 1, 10, out number);
                if (number == 1)
                {
                    
                }
                else if(number == 2)
                {

                }
                else if (number == 3)
                {
                    FirstUniqueChar firstUniqueChar = new FirstUniqueChar();
                    System.Console.WriteLine("The first non repeated character is in position: "+firstUniqueChar.FirstUniqChar("aaab"));
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
                    easyMenuFlag = false;
                    eMenuStringFlag = false;
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
