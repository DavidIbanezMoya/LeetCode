package Top100.Backtracking;

public class WordSearch {

    //todo Anar recorrent fins que trobi la següent lletra de la paraula,alla revisar les direccions
    //todo i si no troba res en aquella lletra desistir, la recurisivitat es basa en anar cambiant de lletra
    //todo conforme si es correcte o no

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board,"A","",0,0));
    }

    public static boolean exist(char[][] board, String word, String currentWord, int posX, int posY) {

        //Verificacio de les lletres
        if (currentWord.length() >= 0) {
            if (board[posX][posY] == word.charAt(0)) {
                currentWord += board[posX][posY];
            }

            else if (board[posX][posY] == word.charAt(currentWord.length()-1)) {
            currentWord += board[posX][posY];
            }

            boolean follow = false;
            //Verify the following character

            //We cant check if the character is on the edge

            if (posY < board[posX].length-1) {
                if (board[posX][posY+1] == word.charAt(currentWord.length()-1)) {
                    follow = true;
                }
                if (posY > 0) {
                    if (board[posX][posY-1] == word.charAt(currentWord.length()-1)) {
                        follow = true;
                    }
                }

            }
            if (posX < board.length-1) {
                if (board[posX+1][posY] == word.charAt(currentWord.length()-1)) {
                    follow = true;
                }
                if (posX > 0)
                    if (board[posX-1][posY] == word.charAt(currentWord.length()-1)) {
                    follow = true;
                }

            }
            if (follow == false) {

                //First verification, is the words matching
                if (word == currentWord) {
                    System.out.println(currentWord);
                    return true;
                }


                if (posX == board.length) {
                    if (posY == board[posX].length) {
                        System.out.println(currentWord);
                        return false;
                    }
                }
            }
        }

        //Delete wrong letter
        if (currentWord.length() > 0) {
            if (currentWord.charAt(currentWord.length()-1) != word.charAt(currentWord.length()-1)) {
                currentWord = currentWord.substring(0,currentWord.length()-1);
            }
        }




        //Anar recorrent, es necesita un current word, o equiparar si la lletra que estem revisant coincideix a la posicio x de la word
        for (int i = posX; i < board.length; i++) {
            for (int j = posY; j < board[i].length; j++) {
                if(posX == i && posY == j) {
                    //Check if its the last of the row
                    if (posX < board.length && posY < board[posX].length -1) {
                        //Check the other directions
                        exist(board,word,currentWord,posX,j+1);
                    }
                    else {
                        if (posX < board.length -1) {
                            exist(board,word,currentWord,i+1,0);
                        }
                    }
                }
                //todo Recusivity comes here
            }
            //exist(board,word,currentWord,posX,i);

        }
        return false;
    }


}
