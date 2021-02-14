package com.ncr.chess;

import com.ncr.chess.constant.ChessBoardConstants;
import com.ncr.chess.exceptions.InvalidPositionException;
import com.ncr.chess.factory.PieceFactory;
import com.ncr.chess.pieces.Piece;
import com.ncr.chess.pieces.PieceType;

/**
 * class for ChessBoard with property for adding the pieces and their valid
 * position
 * 
 * @author mk250730
 *
 */
public class ChessBoard {
	private Piece[][] pieces;

	public ChessBoard() {
		pieces = PieceFactory.getInstance(PieceType.PAWN);
	}

	/**
	 * places the pieces according to there type and coordinate and color
	 * 
	 * @param pawn        {@link Pawn}
	 * @param xCoordinate {@link Integer}
	 * @param yCoordinate {@link Integer}
	 * @param pieceColor  {@link PieceColor}
	 */
	public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
		try {
			if (pieces[xCoordinate][yCoordinate] == null) {
				pawn.setChessBoard(this);
				if ((xCoordinate >= ChessBoardConstants.MIN_X_COORDINATE
						&& xCoordinate < ChessBoardConstants.MAX_BOARD_WIDTH)
						&& (yCoordinate >= ChessBoardConstants.MIN_X_COORDINATE
								&& yCoordinate < ChessBoardConstants.MAX_BOARD_HEIGHT)) {
					pawn.setXCoordinate(xCoordinate);
					pawn.setYCoordinate(yCoordinate);
				} else {
					pawn.setXCoordinate(-1);
					pawn.setYCoordinate(-1);
				}
				pawn.setPieceColor(pieceColor);
				pieces[xCoordinate][yCoordinate] = pawn;
			} else {
				pawn.setXCoordinate(-1);
				pawn.setYCoordinate(-1);
			}
		} catch (InvalidPositionException invalidPositionException) {
			// TODO: use logger to print log
			invalidPositionException.printStackTrace();
		}

	}

	/**
	 * check weather the position of the pieces is valid or not
	 * 
	 * @param xCoordinate {@link Integer}
	 * @param yCoordinate {@link Integer}
	 * @return {@link Boolean}
	 */
	public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
		boolean isLeagalPosition = Boolean.FALSE;
		if (xCoordinate >= ChessBoardConstants.MIN_X_COORDINATE && yCoordinate >= ChessBoardConstants.MIN_Y_COORDINATE
				&& xCoordinate <= ChessBoardConstants.MAX_BOARD_WIDTH
				&& yCoordinate <= ChessBoardConstants.MAX_BOARD_HEIGHT) {
			isLeagalPosition = Boolean.TRUE;
		}
		return isLeagalPosition;
	}

	/**
	 * get the {@link Piece} object
	 * 
	 * @return {@link Piece[][]}
	 */
	public Piece[][] getPieces() {
		return pieces;
	}

}
