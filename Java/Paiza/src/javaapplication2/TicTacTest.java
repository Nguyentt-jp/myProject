package javaapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacTest {

	


		static ArrayList<Integer> playerPositons = new ArrayList<Integer>();// vi tri player
		static ArrayList<Integer> cpuPositons = new ArrayList<Integer>(); // vi tri cpu

		public static void main(String[] args) {
			char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
									{ '-', '+', '-', '+', '-' },
									{ ' ', '|', ' ', '|', ' ' },
									{ '-', '+', '-', '+', '-' },
									{ ' ', '|', ' ', '|', ' ' } };

			printGameBoard(gameBoard);
			while (true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter your placement(1-9)");
				// player
				int playerPos = scan.nextInt();
				while (playerPositons.contains(playerPos) || cpuPositons.contains(playerPos)) {
					System.out.println("positon taken! Enter a correct Position");// neu trung nhau
					playerPos = scan.nextInt();
				}
				System.out.println(playerPos);
				placePiece(gameBoard, playerPos, "player");
				// cpu
				String result = checkWinner();
//				if (result.length() > 0) {
//					System.out.println(result);
//					break;
//				}
				Random rand = new Random();
				int cpuPos = rand.nextInt(9) + 1;
				while (playerPositons.contains(cpuPos) || cpuPositons.contains(cpuPos)) {
					// neu trung nhau
					cpuPos = rand.nextInt(9) + 1;
				}
				placePiece(gameBoard, cpuPos, "cpu");

				printGameBoard(gameBoard);

				result = checkWinner();
				if (result.length() > 0) {
					System.out.println(result);
					break;
				}
				System.out.println(result);
			}
			System.out.close();
		}

		public static void printGameBoard(char[][] gameBoard) {
			for (char[] row : gameBoard) {
				for (char c : row) {
					System.out.print(c);
				}
				System.out.println();
			}

		}

		public static void placePiece(char[][] gameBoard, int pos, String user) {

			char symbol = 'X';

			if (user.equals("player")) {
				symbol = 'X';
				playerPositons.add(pos);
			} else if (user.equals("cpu")) {
				symbol = 'O';
				cpuPositons.add(pos);
			}

			switch (pos) {
			case 1:
				gameBoard[0][0] = symbol;
				break;
			case 2:
				gameBoard[0][2] = symbol;
				break;
			case 3:
				gameBoard[0][4] = symbol;
				break;
			case 4:
				gameBoard[2][0] = symbol;
				break;
			case 5:
				gameBoard[2][2] = symbol;
				break;
			case 6:
				gameBoard[2][4] = symbol;
				break;
			case 7:
				gameBoard[4][0] = symbol;
				break;
			case 8:
				gameBoard[4][2] = symbol;
				break;
			case 9:
				gameBoard[4][4] = symbol;
				break;
			default:
				break;
			}

		}

		public static String checkWinner() {

			List topRow = Arrays.asList(1, 2, 3);
			List midRow = Arrays.asList(4, 5, 6);
			List botRow = Arrays.asList(7, 8, 9);
			List leftCol = Arrays.asList(1, 4, 7);
			List midCol = Arrays.asList(2, 5, 8);
			List rightCol = Arrays.asList(3, 6, 9);
			List cross1 = Arrays.asList(1, 5, 9);
			List cross2 = Arrays.asList(3, 5, 7);

			List<List> winning = new ArrayList<List>();
			winning.add(topRow);
			winning.add(midRow);
			winning.add(botRow);
			winning.add(leftCol);
			winning.add(midCol);
			winning.add(rightCol);
			winning.add(cross1);
			winning.add(cross2);

			for (List l : winning) {
				if (playerPositons.containsAll(l)) {
					return "you won";
				} else if (cpuPositons.containsAll(l)) {
					return "CPU win";
				} else if (playerPositons.size() + cpuPositons.size() == 9) {
					return "Cat!";
				}
			}

			return "";

		}
}
