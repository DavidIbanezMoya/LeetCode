using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Array
{
    /*Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.*/
    class ValidSudoku
    {
        public bool IsValidSudoku(char[][] board)
        {

            HashSet<Char> cNumber = new HashSet<char>();
            cNumber.Add('1');
            cNumber.Add('2');
            cNumber.Add('3');
            cNumber.Add('4');
            cNumber.Add('5');
            cNumber.Add('6');
            cNumber.Add('7');
            cNumber.Add('8');
            cNumber.Add('9');

            //We have to check the different rules

            //todo Currently is checking the row and not the column, have to find out why the column its not working
            //as intended as for now. Need to implement the rule of 3x3
            for (int i = 0; i < board.Length; i++)
            {
                if (board[i][0] != '.' && !cNumber.Contains(board[i][0]))
                {
                    return false;
                }
                else if (cNumber.Contains(board[i][0]))
                {
                    cNumber.Remove(board[i][0]);
                }

                HashSet<Char> rNumber = new HashSet<char>();
                rNumber.Add('1');
                rNumber.Add('2');
                rNumber.Add('3');
                rNumber.Add('4');
                rNumber.Add('5');
                rNumber.Add('6');
                rNumber.Add('7');
                rNumber.Add('8');
                rNumber.Add('9');

                //Check that it is not repeated on the same column
                for (int j = 0; j < board[i].Length; j++)
                {
                    if (board[i][j] != '.' && !rNumber.Contains(board[i][j]))
                    {
                        return false;
                    }
                    else if (rNumber.Contains(board[i][j]))
                    {
                        rNumber.Remove(board[i][j]);
                    }

                    //Here we will check the 3x3
                    if (i%3==0 && j%3==0)
                    {
                        HashSet<Char> grid = new HashSet<char>();
                    }
                }

            }


            return true;
        }
    }
}
