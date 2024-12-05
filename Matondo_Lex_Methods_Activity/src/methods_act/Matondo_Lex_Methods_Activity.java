/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods_act;

import javax.swing.JOptionPane;

/*
* Name: Lex Edrick Asherjesse C. Matondo
* Course: Computer Engineering - First Year
* Lab Activity: Array Implementation and For Loop Practice - Problem 1
* Submittion Date: December,06, 2024
*/
public class Matondo_Lex_Methods_Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean computeAgain = true;
        boolean menu = true;
        while (menu) {
            do {
                String[] methods = {"Power Method", "Compute Sum", "Find the Maximum", "Find the minimum", "Compute Average"};
                int pickMethod = JOptionPane.showOptionDialog(
                        null,
                        "\nChoose your desired function to use.\n\n",
                        "Methods",
                        JOptionPane.DEFAULT_OPTION, -1, null, methods, methods[0]);
                while (computeAgain) {
                    switch (pickMethod) {
                        case 0:
                            String x = JOptionPane.showInputDialog(null, "Input the value of your number: ", "Power Method", JOptionPane.PLAIN_MESSAGE);
                            int num = Integer.parseInt(x);
                            String y = JOptionPane.showInputDialog(null, "Input the value of your exponent: ", "Power Method", JOptionPane.PLAIN_MESSAGE);
                            int expo = Integer.parseInt(y);
                            long result = exponent(num, expo);
                            String[] choices = {"Compute Again", "Main Menu", "Exit"};
                            int answer = JOptionPane.showOptionDialog(
                                    null,
                                    num + " to the power of " + expo + " is: " + result,
                                    "Power Method Result",
                                    JOptionPane.DEFAULT_OPTION, -1, null, choices, choices[0]);
                            if (answer == 0) {
                                computeAgain = true;
                                menu = false;
                            } else if (answer == 1) {
                                menu = true;
                                computeAgain = false;
                            } else {
                                System.exit(0);
                            }
                            break;
                        case -1:
                            menu = false;
                            System.exit(0);
                            break;
                        case 1:

                            int[] array = getArrayFromUser();

                            int sum = ArraySum(array);
                            String[] choices2 = {"Compute Again", "Main Menu", "Exit"};
                            int answer2 = JOptionPane.showOptionDialog(
                                    null,
                                    "The sum of the array is: " + sum,
                                    "Sum of Array",
                                    JOptionPane.DEFAULT_OPTION, -1, null, choices2, choices2[0]);
                            if (answer2 == 0) {
                                computeAgain = true;
                                menu = false;
                            } else if (answer2 == 1) {
                                menu = true;
                                computeAgain = false;
                            } else {
                                System.exit(0);
                            }
                            break;
                        case 2:
                            int[] array2 = getArrayFromUser();
                            int max = findMax(array2);
                            String[] choices4 = {"Compute Again", "Main Menu", "Exit"};
                            int answer4 = JOptionPane.showOptionDialog(
                                    null,
                                    "The Maximum of the array is: " + max,
                                    "Average of Array",
                                    JOptionPane.DEFAULT_OPTION, -1, null, choices4, choices4[0]);
                            if (answer4 == 0) {
                                computeAgain = true;
                                menu = false;
                            } else if (answer4 == 1) {
                                menu = true;
                                computeAgain = false;
                            } else {
                                System.exit(0);
                            }
                            break;
                        case 3:
                            int[] array5 = getArrayFromUser();
                            int min = findMin(array5);
                            String[] choices5 = {"Compute Again", "Main Menu", "Exit"};
                            int answer5 = JOptionPane.showOptionDialog(
                                    null,
                                    "The Minimum of the array is: " + min,
                                    "Average of Array",
                                    JOptionPane.DEFAULT_OPTION, -1, null, choices5, choices5[0]);
                            if (answer5 == 0) {
                                computeAgain = true;
                                menu = false;
                            } else if (answer5 == 1) {
                                menu = true;
                                computeAgain = false;
                            } else {
                                System.exit(0);
                            }
                            break;
                        case 4:
                            int[] array1 = getArrayFromUser();
                            double average = computeAverage(array1);
                            String[] choices3 = {"Compute Again", "Main Menu", "Exit"};
                            int answer3 = JOptionPane.showOptionDialog(
                                    null,
                                    "The Average of the array is: " + average,
                                    "Average of Array",
                                    JOptionPane.DEFAULT_OPTION, -1, null, choices3, choices3[0]);
                            if (answer3 == 0) {
                                computeAgain = true;
                                menu = false;
                            } else if (answer3 == 1) {
                                menu = true;
                                computeAgain = false;
                            } else {
                                System.exit(0);
                            }
                            break;
                    }
                }
            } while (computeAgain = true);
        }
    }

    /*exponent method computes powers using a loop. 
 ArraySum calculates the total of array elements, while computeAverage finds their average. 
 findMax and findMin identify the largest and smallest values in an array. 
 getArrayFromUser prompts the user via JOptionPane to input and populate an array dynamically.
     */
    public static long exponent(int base, int expo) {
        long result = 1;
        for (int i = 1; i <= expo; i++) {
            result *= base;
        }
        return result;
    }

    public static int ArraySum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double computeAverage(int[] array) {
        return (double) ArraySum(array) / array.length;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int[] getArrayFromUser() {
        String input = JOptionPane.showInputDialog(null, "Input the number of elements that you desired: ", "Number of Elements", JOptionPane.PLAIN_MESSAGE);
        int size = Integer.parseInt(input);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            input = JOptionPane.showInputDialog(null, "Enter element " + (i + 1) + ":", "Number of Elements", JOptionPane.PLAIN_MESSAGE);
            array[i] = Integer.parseInt(input);
        }
        return array;
    }
}
