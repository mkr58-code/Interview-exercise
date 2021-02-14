package com.ncr.chess.pieces;

import com.ncr.chess.ChessBoard;
import com.ncr.chess.MovementType;
import com.ncr.chess.PieceColor;
import com.ncr.chess.exceptions.InvalidMoveException;

public abstract class Piece {
	private ChessBoard chessBoard;
	private int xCoordinate;
	private int yCoordinate;
	private PieceColor pieceColor;

	public ChessBoard getChessBoard() {
		return chessBoard;
	}

	public void setChessBoard(ChessBoard chessBoard) {
		this.chessBoard = chessBoard;
	}

	public int getXCoordinate() {
		return xCoordinate;
	}

	public void setXCoordinate(int value) {
		this.xCoordinate = value;
	}

	public int getYCoordinate() {
		return yCoordinate;
	}

	public void setYCoordinate(int value) {
		this.yCoordinate = value;
	}

	public PieceColor getPieceColor() {
		return this.pieceColor;
	}

	public void setPieceColor(PieceColor value) {
		pieceColor = value;
	}

	/**
	 * move pieces as per their type and coordinates.
	 * 
	 * @param movementType {@link MovementType}
	 * @param newX         {@link Integer}
	 * @param newY         {@link Integer}
	 */
	public abstract void move(MovementType movementType, int newX, int newY) throws InvalidMoveException;
}
