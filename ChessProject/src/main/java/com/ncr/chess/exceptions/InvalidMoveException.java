package com.ncr.chess.exceptions;

/**
 * Exception class for Invalid Move
 * 
 * @author mk250730
 *
 */
public class InvalidMoveException extends RuntimeException {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Parameterize constructor
	 * 
	 * @param message
	 */
	public InvalidMoveException(String message) {
		super(message);
	}
}
