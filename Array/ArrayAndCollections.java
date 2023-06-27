package Array;//Array1มิติ

public class ArrayAndCollections {
	public static void main(String[] args) {
		
	}
	
	public void demoArray() {
		String[] names = new String[10];
		names[0] = "Amarin Sangkarat";
		names[1] = "Jojo Jotaro";
		for(int i = 0; i< names.length; i++) {
			System.out.println("name [" + i +"]" + names[i]);
		}
		
		String[] fullNames = {"Amarin Sangkarat","Jojo Jotaro"};
		for (int i = 0; i< fullNames.length; i++) {
			System.out.println("fullName [" + i +"]" + fullNames[i]);
		}
		
		int[] values = new int [5];
		values[0] = 1;
		values[1] = 2;
		for (int i =0; i < values.length; i++){
		System.out.println("value [" + i +"]" + values[i]);
	    }
	
		int[] scores = {10,20,30,40,50};
		for (int i = 0; i < scores.length; i++){
			System.out.println("score [" + i +"]" + scores[i]);
		}
}

}
