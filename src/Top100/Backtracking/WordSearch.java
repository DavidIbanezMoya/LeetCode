package Top100.Backtracking;

public class WordSearch {

    //todo Anar recorrent fins que trobi la següent lletra de la paraula,alla revisar les direccions
    //todo i si no troba res en aquella lletra desistir, la recurisivitat es basa en anar cambiant de lletra
    //todo conforme si es correcte o no

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board,"AC","",0,0));
    }

    public static boolean exist(char[][] board, String word, String currentWord, int posX, int posY) {
        // Verify if the complete word has been found
        if (currentWord.equals(word)) {
            System.out.println(currentWord);
            return true;
        }

        // Verify if the position is out of bounds of the matrix
        if (posX < 0 || posX >= board.length || posY < 0 || posY >= board[posX].length) {
            return false;
        }

        // Verify if the current letter matches the next letter of the word
        if (board[posX][posY] == word.charAt(currentWord.length())) {
            currentWord += board[posX][posY];
        } else {
            return false;
        }

        // Mark the current letter as visited for the recursivity
        char temp = board[posX][posY];
        board[posX][posY] = '#';

        // Make recursive calls in the four possible directions
        boolean result = exist(board, word, currentWord, posX + 1, posY)
                || exist(board, word, currentWord, posX - 1, posY)
                || exist(board, word, currentWord, posX, posY + 1)
                || exist(board, word, currentWord, posX, posY - 1);

        // Restore the original letter in the matrix
        board[posX][posY] = temp;

        return result;
    }


}
