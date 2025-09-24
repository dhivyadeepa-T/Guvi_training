package guvi_day_14;

import java.util.*;

public class SudukoSolver {
	static boolean isSafe(int[][] mat, int row, int col, int num) {
		for (int x = 0; x < 9; x++) {
			if (mat[row][x] == num) {
				return false;
			}
		}
		for (int x = 0; x < 9; x++) {
			if (mat[x][col] == num) {
				return false;
			}
		}
		int startRow = row - (row % 3), startCol = col - (col % 3);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (mat[i + startRow][j + startCol] == num) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean solve(int[][] mat) {
		int i = 0;
		int j = 0;
		int flag = 0;
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 9; j++) {
				if (mat[i][j] == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				break;
			}
		}
		if (i == 9 && j == 9) {
			return true;
		}

		for (int x = 1; x <= 9; x++) {
			if (isSafe(mat, i, j, x)) {
				mat[i][j] = x;
				if (solve(mat)) {
					return true;
				}
				mat[i][j] = 0;
			}
		}
		return false;
	}

	static void solveSudoko(int[][] mat) {
		solve(mat);
	}

	public static void main(String[] args) {
		int[][] mat = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 }, };
		solveSudoko(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}