package com.ncr.chess;

import java.util.Objects;

import com.ncr.chess.constant.ChessBoardConstants;
import com.ncr.chess.exceptions.InvalidMoveException;
import com.ncr.chess.pieces.Piece;

/**
 * class for Pawn with property for move and Capture
 * 
 * @author mk250730
 *
 */
public class Pawn extends Piece {

	public Pawn(PieceColor pieceColor) {
		setPieceColor(pieceColor);
	}

	@Override
	public void move(MovementType movementType, int newX, int newY) {
		if (movementType == MovementType.MOVE) {
			try {
				this.movePawn(this, newX, newY);
			} catch (InvalidMoveException invalidMoveException) {
				//TODO: use logger to print log
				invalidMoveException.printStackTrace();
			}
		} else {
			this.capturePawn(this, newX, newY);
		}
	}

	/**
	 * move pawn as per coordinates.
	 * 
	 * @param pawn        {@link Pawn}
	 * @param xCoordinate {@link Integer}
	 * @param yCoordinate {@link Integer}
	 */
	public void movePawn(Pawn pawn, int xCoordinate, int yCoordinate) {
		Piece[][] pieces = getChessBoard().getPieces();
		if (Objects.nonNull(pieces[pawn.getXCoordinate()][pawn.getYCoordinate()])
				&& ((xCoordinate >= ChessBoardConstants.MIN_X_COORDINATE
						&& xCoordinate + 1 <= ChessBoardConstants.MAX_BOARD_WIDTH
						&& xCoordinate == pawn.getXCoordinate() || xCoordinate == pawn.getXCoordinate() + 1)
						&& (yCoordinate >= ChessBoardConstants.MIN_X_COORDINATE
								&& yCoordinate <= ChessBoardConstants.MAX_BOARD_HEIGHT
								&& yCoordinate == pawn.getYCoordinate() + 1
								|| yCoordinate == pawn.getYCoordinate() - 1))) {
			pawn.setXCoordinate(xCoordinate);
			pawn.setYCoordinate(yCoordinate);
			pieces[pawn.getXCoordinate()][pawn.getYCoordinate()] = null;
			pieces[xCoordinate][yCoordinate] = pawn;
		} else {
			throw new InvalidMoveException("invalid move");
		}
	}

	/**
	 * method for capturing the pieces as per coordinates.
	 * 
	 * @param pawn        {@link Pawn}
	 * @param xCoordinate {@link Integer}
	 * @param yCoordinate {@link Integer}
	 */
	public void capturePawn(Pawn pawn, int xCoordinate, int yCoordinate) {
		// TODO: need to implement
	}

	@Override
	public String toString() {
		return getCurrentPositionAsString();
	}

	protected String getCurrentPositionAsString() {
		String eol = System.lineSeparator();
		return String.format("Current X: {1}{0} Current Y: {2}{0} Piece Color: {3}", eol, getXCoordinate(),
				getYCoordinate(), getPieceColor());
	}
}
