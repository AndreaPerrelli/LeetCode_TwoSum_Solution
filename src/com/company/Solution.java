package com.company;


/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?*/

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
//sommo ogni elemento ai suoi successivi
        int indice = 0;
        int i;
        int[] risultato;
        while (indice < nums.length-1) {
            for (i = indice; i < nums.length-1; i++) {
                // 2 + 7 = 9? soluzione.
                // 3 + 2 uguale 6? no, vai avanti. 2 + 4 = 6? si, soluzione.
                // 3 +3 = 6? soluzione.
                if (target > 0) {
                    boolean isNegativeNumberAvailable = false;
                    int indiceNumeroNegativo;
                    //se  il valore dell'indice è maggiore del target, devo assicurarmi che non ci siano numeri negativi nelle posizioni successive
                    if (nums[indice] > target && isNegativeNumberAvailable != true) {
                        for (indiceNumeroNegativo = indice; indiceNumeroNegativo < nums.length; indiceNumeroNegativo++) {
                            if (Integer.signum(nums[indiceNumeroNegativo]) == -1) {
                                isNegativeNumberAvailable = true;
                                break;
                            }
                        }
                        if (!isNegativeNumberAvailable)
                            break;
                    }
                }

                if (nums[indice] + nums[i+1] == target) {
                    risultato = new int[] {indice, i+1};
                    //risultato[0] = nums[indice];
                    //risultato[1] = nums[i+1];
                    return risultato;
                }
            }
            indice++;
        }
        risultato = new int[] {0, 0};
        return risultato;
    }
    // static final swap String temp = arr[1];
    //arr[1] = arr[2];
    //arr[2] = temp;
}
