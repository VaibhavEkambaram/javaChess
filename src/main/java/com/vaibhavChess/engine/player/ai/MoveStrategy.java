package com.vaibhavChess.engine.player.ai;

import com.vaibhavChess.engine.board.Board;
import com.vaibhavChess.engine.board.Move;

public interface MoveStrategy {

    Move execute(Board board);

}
