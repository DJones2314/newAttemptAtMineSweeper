package MineSweeper;

import java.util.Random;

public class grid extends game {

/////Attributes
	private int size;
	private int numberOfBombs;
	private tile[][] gameGrid;
	///// Constructors

	public grid() {
		this.size = 8;
		this.numberOfBombs = 20;
		initializeGrid(this.size, this.numberOfBombs);
	}

	///// Methods
	private void initializeGrid(int size, int noOfBombs) {
		this.gameGrid = new tile[size][size];
		placeBombs();

	}

	private void placeBombs(int noOfBombs) {
			Random rand = new Random();
			int bombsLeftToPlace = numberOfBombs;
			while(bombsLeftToPlace>0) {
			
			int xCord = rand.nextInt(this.size);
			int yCord = rand.nextInt(this.size);
			if(!(gameGrid[yCord][xCord] instanceof bomb))
			{
			gameGrid[yCord][xCord] = new bomb();
			bombsLeftToPlace --;
	}
			
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumberOfBombs() {
		return numberOfBombs;
	}

	public void setNumberOfBombs(int numberOfBombs) {
		this.numberOfBombs = numberOfBombs;
	}

	public tile[][] getGameGrid() {
		return gameGrid;
	}

	public void setGameGrid(tile[][] gameGrid) {
		this.gameGrid = gameGrid;
	}

	private void calculateNeighbours() {
	}
	}

}
