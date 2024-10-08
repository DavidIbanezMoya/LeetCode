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
            //removeDuplicates.RemoveDuplicatesSolution(new int[] { 1,1,2});

            //Contains Duplicates
            ContainsDuplicate containsDuplicate = new ContainsDuplicate();
            //containsDuplicate.checkDuplicate(new int[] { 1, 2, 3 });

            //Buy and Sell Stock
            BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
            //buyAndSellStock.MaxProfit(new int[] { 2, 1, 2, 0, 1 });

            //Rotate Array
            RotateArray rotate = new RotateArray();
            //rotate.Rotate(new int[] {1},1);

            //Valid Sudoku
            //Board for sudoku
            char[][] board = new char[9][] {
            new char[] { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
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
    }
}
