package com.vaibhavChess.engine.player;

import com.vaibhavChess.engine.board.Board;
import com.vaibhavChess.engine.board.Move;

public class MoveTransition {

    private final Board transitionBoard;
    private final MoveStatus moveStatus;

    public MoveTransition(final Board transitionBoard, final Move move, final MoveStatus moveStatus) {
        this.transitionBoard = transitionBoard;
        this.moveStatus = moveStatus;
    }

    public MoveStatus getMoveStatus() {
        return moveStatus;
    }

    public Board getTransitionBoard() {
        return this.transitionBoard;
    }


}
