package MineSweeper;

public class tile extends grid {

	///// Attributes
	private boolean flagged = true;
	public boolean isFlagged() {
		return flagged;
	}

	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public int getNumberOfNeighbourBombs() {
		return numberOfNeighbourBombs;
	}

	public void setNumberOfNeighbourBombs(int numberOfNeighbourBombs) {
		this.numberOfNeighbourBombs = numberOfNeighbourBombs;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	private boolean selected = true;
	private int numberOfNeighbourBombs;
	private String display = "";

	///// Constructors

	///// Methods

	public void flagTile(boolean b) {
		// this.flagged = b;
		if (this.flagged) {
			this.flagged = false;
		} else {
			this.flagged = true;
		}
	}

	public void selectTile() {
		this.selected = true;
	}

	@Override
	public String toString() {
		if (this.selected) {

			if (this instanceof bomb) {
				return "B";
			}
			else {
				return ((Integer)numberOfNeighbourBombs).toString();
			}
		}
		else if(this.flagged){
			return "F";
		} else {
			return "_";
		}
		
	}

}
