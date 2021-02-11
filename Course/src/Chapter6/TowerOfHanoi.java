package Chapter6;

public class TowerOfHanoi {
	public static int numberOfMoves = 0;
	
	public void move(int numOfDiscs, char from,char to,char inter) {
		if(numOfDiscs == 1) {
			System.out.println("Moving Disc 1 from " + from + " to " + to );
			numberOfMoves++;
		}
		else {
			move(numOfDiscs - 1,from,inter,to);
			System.out.println("Moving "+ numOfDiscs + " Disc(s) from " + from + " to " + to );
			numberOfMoves++;
			move(numOfDiscs - 1,inter,to,from);
		}
			
	}
	
	public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(5,'A','B','C');
		System.out.println("No. of moves : " +numberOfMoves);
	}

}
