package MineSweeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MineSweeper.grid grid = new Grid();
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<8;j++) {
				System.out.print(grid.getGameGrid()[i][j].toString());
			}
		}
		
	}

}
