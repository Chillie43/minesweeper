package minesweeper1;

public class mineField {
	private boolean[][] mineField = new boolean[10][10];
	private int[][] minesNear = new int[10][10];
	private boolean[][] revealed = new boolean[10][10];
	private boolean[][] flagged = new boolean[10][10];
	private int numRevealed;
	
	public mineField() {	
		this.setMineField();
		this.setMinesNear();
		this.setRevealed();
		this.setFlagged();
		this.setNumRevealed();
	}

	public boolean getMineField(int i, int j) {
		//System.out.println(i + ", " + j);
		return mineField[i][j];
	}

	public void setMineField() {
		// fills with false values
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.mineField[i][j] = false;
			}
		}

		// sets 10 mines
		for (int i = 0; i < 10; i++) {
			this.mineField[(int) (Math.random() * 10)][(int) (Math.random() * 10)] = true;
		}

		// checks to make sure there's 10 mines
		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (this.mineField[i][j]) {
					k++;
				}
			}
		}
		if (k < 10) {
			this.setMineField();
		}
		// end check
	}

	public int getMinesNear(int i, int j) {
		return minesNear[i][j];
	}

	public void setMinesNear() {
		//initial set to all 0s
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.minesNear[i][j] = 0;
			}
		}

		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (this.getMineField(i, j)) {
					//up left
					if (i > 0 && j > 0) {
						this.minesNear[i-1][j-1]++;
					}
					//left
					if (i > 0) {
						this.minesNear[i-1][j]++;
					}
					//down left
					if (i > 0 && j < 9) {
						this.minesNear[i-1][j+1]++;
					}
					//up
					if (j > 0) {
						this.minesNear[i][j-1]++;
					}
					//down
					if (j < 9) {
						this.minesNear[i][j+1]++;
					}
					//up right
					if (i < 9 && j > 0) {
						this.minesNear[i+1][j-1]++;
					}
					//right
					if (i < 9) {
						this.minesNear[i+1][j]++;
					}
					//down right
					if (i < 9 && j < 9) {
						this.minesNear[i+1][j+1]++;
					}
				}
			}
		}
	}

	public boolean getRevealed(int i, int j) {
		return revealed[i][j];
	}

	public void setRevealed() {
		//set initial values
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.revealed[i][j] = false;
			}
		}
	}
	
	public void setRevealed(int i, int j) {
		this.revealed[i][j] = true;
		this.numRevealed++;
	}
	
	public int getNumRevealed() {
		return numRevealed;
	}

	public void setNumRevealed() {
		this.numRevealed = 0;
	}

	public boolean getFlagged(int i, int j) {
		return flagged[i][j];
	}

	public void setFlagged() {
		//set initial values
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.flagged[i][j] = false;
			}
		}
	}
	
	public void setFlagged(int i, int j) {
		this.flagged[i][j] = !this.flagged[i][j];
	}

}
