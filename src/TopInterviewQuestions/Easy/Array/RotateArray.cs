using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Array
{
    class RotateArray
    {
        /*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.*/
        public void Rotate(int[] nums, int k)
        {

                //O(n) solution
                int n = nums.Length;
                k = k % n; // Cut repetitions where k > n

                if (k == 0 || n == 1)
                {
                    return; // If the array has 1 pos or if we have to move it 0 pos
                }

                //Temp array
                int[] temp = new int[k];
                for (int i = 0; i < k; i++)
                {
                    temp[i] = nums[n - k + i];
                }

                // Move the first n-k elements to the right
                for (int i = n - 1; i >= k; i--)
                {
                    nums[i] = nums[i - k];
                }

                //Replace it with the temporal array
                for (int i = 0; i < k; i++)
                {
                    nums[i] = temp[i];
                }
            }


            //Originally made the O(k*n) solution
            /*//Check that the array is long enough
            if (nums.Length > 1)
            {
                //We have to move the positions of the array
                int store;
                int use = 0;
                for (int i = 1; i <= k; i++)
                {

                    for (int j = 0; j < nums.Length; j++)
                    {

                        if (nums.Length > j + 1)
                        {
                            if (j == 0)
                            {
                                store = nums[j + 1];
                                nums[j + 1] = nums[j];
                            }
                            else
                            {
                                store = nums[j + 1];
                                nums[j + 1] = use;
                            }
                            use = store;

                        }
                        else
                        {
                            nums[0] = use;
                        }
                    }
                }
            }
        }*/
        }
    }
