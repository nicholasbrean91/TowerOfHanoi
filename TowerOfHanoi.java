import java.util.Scanner;
public class TowerOfHanoi {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the # of bricks in the tower of hanoi, (The height.): ");
		int heightTower = userInput.nextInt();
		MoveTower(heightTower, "A" , "B", "C");
		
	}
	
	public static void MoveTower(int height, String poleA, String poleB, String poleC) {
		if (height >= 1) {
			MoveTower(height-1,poleA,poleB, poleC);
			MoveDisk(poleA,poleC);
			MoveTower(height-1,poleB,poleC,poleA);
		}
	}
	public static void MoveDisk(String poleA, String poleB) {
		System.out.println("moving disk from " + poleA + " to " + poleB);
	}

}
