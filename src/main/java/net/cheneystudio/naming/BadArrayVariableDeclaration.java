package net.cheneystudio.naming;

/**
 * Create on 2019-07-19 09:46
 *
 * @author Cheney Wong
 */
public class BadArrayVariableDeclaration {
    static {
        int[] intArrayCompliant;
        int intArrayNoncompliant[];
        int[][] twoDimensionArrayCompliant;
        int[] twoDimensionArrayNoncompliantA[];
        int twoDimensionArrayNoncompliantB[][];
    }

    int[] intArrayCompliant;
    int intArrayNoncompliant[];
    int[][] twoDimensionArrayCompliant;
    int[] twoDimensionArrayNoncompliantA[];
    int twoDimensionArrayNoncompliantB[][];

    void methodA(int[] intArray) {
        int[] anotherIntArray = intArray.clone();
    }

    void methodB(int intArray[]) {
        int anotherIntArray[] = intArray.clone();
    }

    void methodC(int[][] twoDimensionArray) {
        int[][] anotherTwoDimensionArray = twoDimensionArray.clone();
    }

    void methodD(int[] twoDimensionArray[]) {
        int[] anotherTwoDimensionArray[] = twoDimensionArray.clone();
    }

    void methodE(int twoDimensionArray[][]) {
        int anotherTwoDimensionArray[][] = twoDimensionArray.clone();
    }
}
