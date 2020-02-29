package com.vaibhavChess.engine.player.ai;

import com.vaibhavChess.engine.board.Board;

public interface BoardEvaluator {

    int evaluate(Board board, int depth);
}
