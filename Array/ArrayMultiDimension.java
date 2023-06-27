package Array;

public class ArrayMultiDimension {

public static void main(String[] args) {
		
	}
	public void demoArrayMultiDimension() {
		String [][] names = new String[3][2];
		names[0][1] = "Amarin Sangkarat";
		names[1][0] = "Jojo Jotaro";
		for (int i = 0; i< names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println("[" + i + "][" + j + "]" + names[i][j]);
			}
		}
		
		String [][] fullNames = {{"Amarin Sangkarat","Jojo Jotaro"},{}};
		for (int i = 0; i< fullNames.length; i++) {
			for (int j = 0; j < fullNames[i].length; j++) {
				System.out.println("[" + i + "][" + j + "]" + fullNames[i][j]);
			}
		}
		
		int[][] values = new int[3][2];
		values[0][1] = 2;
		values[1][0] = 3;
		values[1][1] = 4;
		values[2][0] = 5;
		for (int i = 0; i < values[i].length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				System.out.println("[" + i + "][" + j + "]" + values[i][j]);
			}
		}
		
		int[][] scores = {{10,20,30,40,50},{5,8,10}};
		for (int i = 0; i< scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
			System.out.println("[" + i + "][" + j + "]" + scores[i][j]);
		}
	}
		
		
	}
		
		
	}
