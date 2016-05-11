/*
 *  Michael Cole
 *  3.9.2016 I-Tech AM
 *
 *  This program randomly generates 100 numbers and then determines how many of the values are even and how many are odd.
 *  It then displays the information to the user:
 *  1.number of even numbers
 *  2.number of odd numbers
 *  3.All the values that were generated during the current run of the program
 *
 * oddsAndEvens.java
 */

import java.util.*;

public class oddsAndEvens {

    public static void main(String[] args) {
        int[] values = getValues();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("There are a total of "+ evenCount + " even values and " + oddCount +" odd values in the array \n");
        System.out.println("The values in the array are: ");
        for(int i=0;i<values.length;i++)
        {
            System.out.println(values[i]);
        }

    }

    /**
     * Returns an array of integers. The values contained in the array will only contain positive values
     * @return int[]
     */
    public static int[] getValues() {
        int[] values = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            values[i] = rand.nextInt();
            if(values[i]<0) //if a value is negative it is switched to a positive value
            {
                values[i]=Math.abs(values[i]);
            }
        }
        return values;
    }

}
