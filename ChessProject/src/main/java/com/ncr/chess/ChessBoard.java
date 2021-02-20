package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int MIN_INDEX = 0;
    public static int MAX_INDEX = 6;
    
    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
    	boolean res = isLegalBoardPosition(xCoordinate, yCoordinate);
    	if(res) {
    		if(pieces[xCoordinate][yCoordinate] != null) {
    			int getX = pieces[xCoordinate][yCoordinate].getXCoordinate();
    			int getY = pieces[xCoordinate][yCoordinate].getYCoordinate();
    			if(getX == xCoordinate && getY == yCoordinate) {
    				pawn.setXCoordinate(-1);
    				pawn.setYCoordinate(-1);
    		}
    	}else {
    		pieces[xCoordinate][yCoordinate] = new Pawn(PieceColor.BLACK);
			pieces[xCoordinate][yCoordinate].setXCoordinate(xCoordinate);
			pieces[xCoordinate][yCoordinate].setYCoordinate(yCoordinate);
			pawn.setXCoordinate(xCoordinate);
			pawn.setYCoordinate(yCoordinate);
		}
     }else {
    	 pawn.setXCoordinate(-1);
    	 pawn.setYCoordinate(-1);
     }
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate)throws UnsupportedOperationException {
    	boolean result = true;
    	if(xCoordinate < MIN_INDEX || xCoordinate > MAX_INDEX) {
    		result = false;
    	}
    	if(yCoordinate < MIN_INDEX || yCoordinate > MAX_INDEX) {
    		result = false;
    	}
    	return result;
       // throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
}
