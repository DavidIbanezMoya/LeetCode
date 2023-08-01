package Top100.Backtracking;

public class WordSearch {

    //todo Anar recorrent fins que trobi la següent lletra de la paraula,alla revisar les direccions
    //todo i si no troba res en aquella lletra desistir, la recurisivitat es basa en anar cambiant de lletra
    //todo conforme si es correcte o no

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        exist(board,"Test","",0,0);
    }

    public static boolean exist(char[][] board, String word, String currentWord, int posX, int posY) {
        System.out.println(board[0]);
        System.out.println(board.length);

        //Verificacio de les lletres
        if (board[posX][posY] == word.charAt(currentWord.length())) {
            currentWord += board[posX][posY];
        }

        //First verification, is the words matching
        if (word == currentWord) {
            return true;
        }


        if (posY == board.length) {
            if (posX == board[posY].length) {
                return false;
            }
        }


        //Anar recorrent, es necesita un current word, o equiparar si la lletra que estem revisant coincideix a la posicio x de la word
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
                //todo Recusivity comes here
            }
            //exist(board,word,currentWord,posX,i);
        }
        return true;
    }


}
