package com.ncr.chess.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ncr.chess.Pawn;
import com.ncr.chess.pieces.Piece;
import com.ncr.chess.pieces.PieceType;

/**
 * test class for {@link PieceFactory}
 * 
 * @author mk250730
 *
 */
public class PieceFactoryTest {

	@Test
	public void getPawnInstance() {
		Piece[][] pieces = PieceFactory.getInstance(PieceType.PAWN);
		assertTrue(pieces instanceof Pawn[][]);
	}
}
