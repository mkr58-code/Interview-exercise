package com.ncr.chess.factory;

import com.ncr.chess.Pawn;
import com.ncr.chess.constant.ChessBoardConstants;
import com.ncr.chess.pieces.Piece;
import com.ncr.chess.pieces.PieceType;

/**
 * factory class to the the instance of {@link Piece}
 * 
 * @author mk250730
 *
 */
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
