package com.minesweeper;

import java.awt.Color;

public class Cell {
	private Color cellColor = Color.LIGHT_GRAY;
	private boolean isMine;
	private int surroundingBombs;

	public Cell() {
	}

	// Getters
	public boolean checkIfMine() {
		return isMine;
	}

	public Color getCellColor() {
		return cellColor;
	}

	public int getSurroundingBombCount() {
		return surroundingBombs;
	}

	// Setters
	public void setAsMine(boolean mine) {
		isMine = mine;
	}
	
	public void setColor(Color newColor) {
		cellColor = newColor;
	}
	
	public void setNeighborCount(int bombs) {
		surroundingBombs = bombs;
	}
}
