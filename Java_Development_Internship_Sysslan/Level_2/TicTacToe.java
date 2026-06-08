import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        char player = 'X';
        int moves = 0;
        boolean winner = false;

        while (!winner && moves < 9) {

            System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println(board[i][0] + " | " +
                                   board[i][1] + " | " +
                                   board[i][2]);

                if (i < 2) {
                    System.out.println("--+---+--");
                }
            }

            System.out.print("\nPlayer " + player +
                             ", enter position (1-9): ");

            int position = sc.nextInt();

            int row = (position - 1) / 3;
            int col = (position - 1) % 3;

            if (board[row][col] == 'X' ||
                board[row][col] == 'O') {

                System.out.println("Position already taken!");
                continue;
            }

            board[row][col] = player;
            moves++;

            if (
                (board[0][0] == player &&
                 board[0][1] == player &&
                 board[0][2] == player)

                ||

                (board[1][0] == player &&
                 board[1][1] == player &&
                 board[1][2] == player)

                ||

                (board[2][0] == player &&
                 board[2][1] == player &&
                 board[2][2] == player)

                ||

                (board[0][0] == player &&
                 board[1][0] == player &&
                 board[2][0] == player)

                ||

                (board[0][1] == player &&
                 board[1][1] == player &&
                 board[2][1] == player)

                ||

                (board[0][2] == player &&
                 board[1][2] == player &&
                 board[2][2] == player)

                ||

                (board[0][0] == player &&
                 board[1][1] == player &&
                 board[2][2] == player)

                ||

                (board[0][2] == player &&
                 board[1][1] == player &&
                 board[2][0] == player)
            ) {

                winner = true;

                System.out.println("\nPlayer " +
                                   player +
                                   " Wins!");
            }

            if (!winner) {

                if (player == 'X') {
                    player = 'O';
                } else {
                    player = 'X';
                }
            }
        }

        if (!winner) {
            System.out.println("\nMatch Draw!");
        }

        sc.close();
    }
}