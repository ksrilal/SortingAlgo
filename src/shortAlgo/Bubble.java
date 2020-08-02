package shortAlgo;

public class Bubble {
	
	public void bubbleShort(int[] array) {
		boolean shorted = false;
		int temp;
		
		while(!shorted) {
			shorted = true;
			
			for(int i=0; i<array.length -1; i++) {
				if(array[i]>array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					
					shorted = false;
				}
			}
		}
	}
}

//O(n^2)
