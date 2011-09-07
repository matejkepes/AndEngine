package org.anddev.andengine.util.path;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 23:00:24 - 16.08.2010
 */
public interface IPathFinderMap<T> {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	public int getXMin();
	public int getXMax();
	public int getYMin();
	public int getYMax();

	public int getWidth();
	public int getHeight();

	public boolean isBlocked(final int pX, final int pY, final T pEntity);

	public float getCost(final int pFromX, final int pFromY, final int pToX, final int pToY, final T pEntity);
}