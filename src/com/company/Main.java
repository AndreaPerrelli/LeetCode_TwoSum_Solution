package com.company;


import java.util.Scanner;
import com.company.Solution;

public class Main {
    static int[] arrayInput;
    static int[] arraySoluzione;
    static int target;
    public static void main(String[] args) {
        solutionTwoSum();
	// write your code here
    }

    public static void solutionTwoSum() {
        assignVariables();
        printSolution(arraySoluzione = Solution.twoSum(arrayInput, target));
        //printSolution(arraySoluzione);
    }

    private static void assignVariables() {
        arrayInput = readInputArray();
        target = readInputTarget();
    }

    static private int[] readInputArray() {
        System.out.print("Inserisci una serie di numeri : ");
        Scanner scanner = new Scanner(System.in);
        int [] arrayInput = new int[5];
        for (var i = 0; i < 5; i++) {
            arrayInput[i] = scanner.nextInt();
        }

        return arrayInput;
    }

    static private int readInputTarget() {
        System.out.print("Inserisci il numero target : ");
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        return target;
    }

    static private void printSolution(int[] arraySoluzione) {
        System.out.print("I due numeri la cui somma è uguale al target sono : " + arraySoluzione[0] + arraySoluzione[1]);
    }

}

