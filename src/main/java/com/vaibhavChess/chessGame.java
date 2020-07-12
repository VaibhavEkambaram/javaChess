package com.vaibhavChess;

import com.vaibhavChess.engine.board.Board;
import com.vaibhavChess.gui.Table;

public class chessGame {

    public static void main(String[] args) {
        Board.createStandardBoard();
        Table.get().show();

    }

}
