package org.gregsewell;

import java.util.Arrays;

public class ValidSudoku {

    private static final int BOARD_SIZE = 9;
    private static final int SUB_BOX_SIZE = 3;

    private static final int[][] offsets = {
            {0,0}, {0,3}, {0,6},
            {3,0}, {3,3}, {3,6},
            {6,0}, {6,3}, {6,6}
    };

    public static boolean isValidSudoku(char[][] board) {

        // No need to check the dimensions of array according to question constraints
        char[][] rotatedBoard = new char[BOARD_SIZE][BOARD_SIZE];
        char[][] boxes = new char[BOARD_SIZE][BOARD_SIZE];

        for (int row=0; row < BOARD_SIZE; row++) {
            // Validate all the rows of the original board
            if (!isArrayValid(board[row])) {
                return false;
            }
            for (int column=0; column < BOARD_SIZE; column++) {
                rotatedBoard[row][column] = board[column][row];
            }
        }

        // Validate all the rows of the rotated board == columns of the original board
        for (int row=0; row < BOARD_SIZE; row++) {
            if (!isArrayValid(rotatedBoard[row])) {
                return false;
            }
        }

        // Create sub-boxes
        for (int box=0; box < offsets.length; box++) {
            int[] offset = offsets[box];
            int pos = 0;
            for (int row=offset[0]; row < SUB_BOX_SIZE+offset[0]; row++) {
                for (int column=offset[1]; column < SUB_BOX_SIZE+offset[1]; column++) {
                    boxes[box][pos] = board[row][column];
                    pos++;
                }
            }
        }

        // Validate sub-boxes
        for (char[] box : boxes) {
            if (!isArrayValid(box)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isArrayValid(char[] data) {
        char[] array = Arrays.copyOf(data, BOARD_SIZE);
        Arrays.sort(array);
        for (int i=0; i < array.length; i++) {
            if (array[i] != '.' && (array[i] < '1' && array[i] > '9')) {
                return false;
            }
            if (i > 0 && array[i] != '.' && array[i-1] != '.' && array[i] == array[i-1]) {
                return false;
            }
        }
        return true;
    }
}
