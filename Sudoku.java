public class Sudoku {
    
    private int[][] board;
    private int boardSize;
    private int subBoardSize;
    
    public Sudoku(int boardSize) {
        this.boardSize = boardSize;
        this.subBoardSize = (int) Math.sqrt(boardSize);
        this.board = new int[boardSize][boardSize];
    }
    
    // Method to generate a new Sudoku board
    public void generateBoard() {
        // TODO: Write code to generate a new Sudoku board
    }
    
    // Method to print the Sudoku board
    public void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            if (i % subBoardSize == 0) {
                System.out.println(" -----------------------");
            }
            for (int j = 0; j < boardSize; j++) {
                if (j % subBoardSize == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println(" -----------------------");
    }
    
    // Getter and setter methods for the board variable
    public int[][] getBoard() {
        return board;
    }
    
    public void setBoard(int[][] board) {
        this.board = board;
    }
    
}
public void generateBoard() {
    int[][] tempBoard = new int[boardSize][boardSize];
    
    // Initialize all cells to 0
    for (int i = 0; i < boardSize; i++) {
        for (int j = 0; j < boardSize; j++) {
            tempBoard[i][j] = 0;
        }
    }
    
    // Fill in diagonal sub-boards
    for (int i = 0; i < boardSize; i += subBoardSize) {
        fillSubBoard(tempBoard, i, i);
    }
    
    // Fill in remaining cells
    fillRemaining(tempBoard, 0, subBoardSize);
    
    board = tempBoard;
}

private boolean fillSubBoard(int[][] board, int row, int col) {
    if (col >= boardSize && if (row < boardSize - 1) {
row = row + 1;
col = 0;
}
if (row >= boardSize && col >= boardSize) {
    return true;
}

if (row < subBoardSize) {
    if (col < subBoardSize) {
        col = subBoardSize;
    }
} else if (row < boardSize - subBoardSize) {
    if (col == (int) (row / subBoardSize) * subBoardSize) {
        col = col + subBoardSize;
    }
} else {
    if (col == boardSize - subBoardSize) {
        row = row + 1;
        col = 0;
        if (row >= boardSize) {
            return true;
        }
    }
}

for (int num = 1; num <= boardSize; num++) {
    if (isValid(board, row, col, num)) {
        board[row][col] = num;
        if (fillSubBoard(board, row, col + 1)) {
            return true;
        }
        board[row][col] = 0;
    }
}

return false;
}

private boolean fillRemaining(int[][] board, int row, int col) {
if (col >= boardSize && row < boardSize - 1) {
row = row + 1;
col = 0;
}
if (row >= boardSize && col >= boardSize) {
    return true;
}

if (row < subBoardSize) {
    if (col < subBoardSize) {
        col = subBoardSize;
    }
} else if (row < boardSize - subBoardSize) {
    if (col == (int) (row / subBoardSize) * subBoardSize) {
        col = col + subBoardSize;
    }
} else {
    if (col == boardSize - subBoardSize) {
        row = row + 1;
        col = 0;
        if (row >= boardSize) {
            return true;
        }
    }
}

for (int num = 1; num <= boardSize; num++) {
    if (isValid(board, row, col, num)) {
        board[row][col] = num;
        if (fillRemaining(board, row, col + 1)) {
            return true;
        }
        board[row][col] = 0;
    }
}

return false;
for (int i = 0; i < boardSize; i++) {
    if (board[i][col] == num) {
        return false;
    }
}

int subBoardRow = row - row % subBoardSize;
int subBoardCol = col - col % subBoardSize;
for (int i = subBoardRow; i < subBoardRow + subBoardSize; i++) {
    for (int j = subBoardCol; j < subBoardCol + subBoardSize; j++) {
        if (board[i][j] == num) {
            return false;
        }
    }
}

return true;
import javax.swing.*;
import java.awt.*;

public class SudokuGame extends JFrame {

    private int[][] board;
    private int[][] solution;

    public SudokuGame() {
        this.board = new int[9][9];
        this.solution = new int[9][9];
        this.generateBoard();
        this.setVisible(true);
    }

    private void generateBoard() {
        // code to generate board
    }

    private void solveBoard() {
        // code to solve board
    }

    private void printBoard(int[][] board) {
        // code to print board
    }

    private void showBoard() {
        // code to show board in UI
    }

    private void showError(String message) {
        // code to show error message
    }

    private void showMessage(String message) {
        // code to show message
    }

    public static void main(String[] args) {
        new SudokuGame();
    }
}

