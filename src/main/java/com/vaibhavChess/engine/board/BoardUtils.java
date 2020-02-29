package com.vaibhavChess.engine.board;

import com.google.common.collect.ImmutableMap;

import java.util.*;

public class BoardUtils {

    // For checking if for example first_column[0] equals true so we know that a
    // tile with coordinate 0 lies in the first column or not
    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);

    public static final boolean[] EIGHTH_RANK = initRow(0);
    public static final boolean[] SEVENTH_RANK = initRow(8);
    public static final boolean[] SIXTH_RANK = initRow(16);
    public static final boolean[] FIFTH_RANK = initRow(24);
    public static final boolean[] FOURTH_RANK = initRow(32);
    public static final boolean[] THIRD_RANK = initRow(40);
    public static final boolean[] SECOND_RANK = initRow(48);
    public static final boolean[] FIRST_RANK = initRow(56);

    public static final String[] ALGEBRAIC_NOTATION = initilizeAlgebraicNotation();



    public static final Map<String,Integer> POSITION_TO_COORDINATE = initilizePositionToCoordinateMap();



    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;


    /**
     * Just a helping class, not to be instantiated
     */
    public BoardUtils() {
        throw new RuntimeException("This class cannot be instantiated!");
    }

    private static String[] initilizeAlgebraicNotation() {
        return new  String[]{
                "a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8",
                "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7",
                "a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6",
                "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5",
                "a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4",
                "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3",
                "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2",
                "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"
        };
    }

    private static Map<String, Integer> initilizePositionToCoordinateMap() {
        final Map<String, Integer> positionToCoordinate = new HashMap<>();

        for(int i = 0; i < NUM_TILES; i++){
            positionToCoordinate.put(ALGEBRAIC_NOTATION[i],i);
        }
        return ImmutableMap.copyOf(positionToCoordinate);
    }

    private static boolean[] initColumn(int columnNumber) {
        final boolean[] column = new boolean[64];
        do {
            column[columnNumber] = true;
            columnNumber += 8;
        } while (columnNumber < 64);
        return column;
    }

    private static boolean[] initRow(int rowNumber) {
        final boolean[] row = new boolean[64];
        do {
            row[rowNumber] = true;
            rowNumber++;
        } while (rowNumber % NUM_TILES_PER_ROW != 0);
        return row;
    }

    /**
     * Returns whether an entered coordinate is valid not not
     *
     * @param coordinate a coord we want to check
     * @return true for valid, false for invalid coordinate
     */
    public static boolean isValidTileCoordinate(final int coordinate) {
        return coordinate >= 0 && coordinate < NUM_TILES;
    }


    public static int getCoordinateAtPosition(final String position) {
        return POSITION_TO_COORDINATE.get(position);
    }

    public static String getPositionAtCoordinate(final int coordinate){
        return ALGEBRAIC_NOTATION[coordinate];
    }

}
