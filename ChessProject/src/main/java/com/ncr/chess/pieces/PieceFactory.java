package com.ncr.chess.pieces;

import com.ncr.chess.Pawn;
import com.ncr.chess.constant.ChessBoardConstants;

public class PieceFactory {

	/**
	 * this method return the Instance of Piece based on the {@link PieceType}
	 * 
	 * @param pieceType
	 * @return {@link Piece[][]}
	 */
	public static Piece[][] getInstance(PieceType pieceType) {
		Piece[][] piece = null;
		switch (pieceType) {
		case PAWN:
			piece = new Pawn[8][ChessBoardConstants.MAX_BOARD_HEIGHT];
			break;
		case BISHOP:

			break;
		case KING:

			break;
		case KNIGHT:

			break;
		case QUEEN:

			break;

		case ROOK:

			break;
		default:

			break;
		}
		return piece;
	}

	/**
	 * private constructor
	 * 
	 */
	private PieceFactory() {
		// no need to implement
	}
}
