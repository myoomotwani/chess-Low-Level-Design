package chessLLD;

public class BoardInitializer {

    String[][] initBoard(){
        String[][] board = new String[8][8];

        for(int i = 0 ; i < 8 ; i ++){
            for(int j = 0 ; j < 8 ; j++){
                board[i][j] = "--";

            }

        }

        int i = 0 ;
        board[i][0] =  "BR";
        board[i][1] =  "BN";
        board[i][2] =  "BB";
        board[i][3] =  "BQ";
        board[i][4] =  "BK";
        board[i][5] =  "BB";
        board[i][6] =  "BN";
        board[i][7] =  "BR";

        i = 1 ;
        board[i][0] =  "BP";
        board[i][1] =  "BP";
        board[i][2] =  "BP";
        board[i][3] =  "BP";
        board[i][4] =  "BP";
        board[i][5] =  "BP";
        board[i][6] =  "BP";
        board[i][7] =  "BP";

        i = 6 ;
        board[i][0] =  "WP";
        board[i][1] =  "WP";
        board[i][2] =  "WP";
        board[i][3] =  "WP";
        board[i][4] =  "WP";
        board[i][5] =  "WP";
        board[i][6] =  "WP";
        board[i][7] =  "WP";

        i = 7 ;
        board[i][0] =  "WR";
        board[i][1] =  "WN";
        board[i][2] =  "WB";
        board[i][3] =  "WQ";
        board[i][4] =  "WK";
        board[i][5] =  "WB";
        board[i][6] =  "WN";
        board[i][7] =  "WR";

        System.out.println("hey " +board[0][0] + " ");
        return board ;
    }

}
