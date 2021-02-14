package com.ncr.chess.exceptions;

/**
 * Exception class for Invalid Position
 * 
 * @author mk250730
 *
 */
public class InvalidPositionException extends RuntimeException {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Parameterize constructor
	 * 
	 * @param message
	 */
	public InvalidPositionException(String message) {
		super(message);
	}
}
