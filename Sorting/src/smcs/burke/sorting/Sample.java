package smcs.burke.sorting;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomVector v = new RandomVector(10);
		v.shuffle();
		System.out.println(v);
	//	InsertionSort(v);
		bubbleSort(v);
		//mergeSort(v);
		System.out.println(v);
	}
	
	private static void InsertionSort(RandomVector v) {
		
		//walk through unsorted eelements until we run out
		for(int i = 1; i < v.size(); i++) {
			
			
			int j = 0, //start looking through sorted section from beginning
					temp = v.get(i);  //stash our current unsorted element
			
			
			
			for(j=0; j < i && v.get(j) <= v.get(i); j++){}
			
			//walk from one element to the left of i through to j to the left
			for(int k = i-1; k >= j; k--){
				//move element at k one step to the right
				v.set(k+1, v.get(k));
			}
		//copy temp into element j	
			v.set(j, temp);
			System.out.println(v);
		}
		
	}
	
	
	private static void SelectionSort(RandomVector v){
		for (int i = 0; i < v.size(); ++i){
			int min = i +1;
			for( int j = i + 1; j < v.size(); j++){
				if(v.get(j) < v.get(min)){
					min = j;
				}
			}
			if (min != i) {
				v.swap(min,  i);
			}
			System.out.print(v);
			System.out.println(" <-- swap elt " + min + " and " + i);
		}
		
	}
	
	private static void bubbleSort(RandomVector v) {
		int swaps;
		do {
			// restart our swap counter at zero for this pass through the list
			swaps = 0;
			System.out.println("Starting a pass through the vector...");

			// walk through v...
			for (int i = 1; i < v.size(); i++) {

				// ...if we encounter two elements that are out of order, swap
				// them
				if (v.get(i - 1) > v.get(i)) {
					v.swap(i - 1, i);
					swaps++;
					System.out.print(v);
					System.out.println(" <-- swapped elt " + (i - 1) + " and " + i);
				}
			}
		} while (swaps > 0);
	}
	
	
	
	
private static void mergeSort(RandomVector v) {
		
		System.out.println(v + " <-- UNSORTED");
		
		// if we have 1 or fewer elements…
		if (v.size() <= 1) {
			// it's sorted!
			return;
		} else {
			int
				half = v.size() / 2,
				i = 0,
				j = 0;
			RandomVector
				left = v.subList(0, half-1),
				right = v.subList(half, v.size()-1);
			v.clear();

			System.out.println(left + " " + right);

			// otherwise, mergeSort the left and right halves…
			mergeSort(left);
			mergeSort(right);

			System.out.println(left + " " + right);
			
			// …and then merge them back together again
			while (i < left.size() || j < right.size()) {
				if (i < left.size()) {
					if (j < right.size()) {
						if (left.get(i) < right.get(j)) {
							v.add(left.get(i));
							i++;
						} else {
							v.add(right.get(j));
							j++;
						}
					} else {
						v.add(left.get(i));
						i++;
					}
				} else {
					v.add(right.get(j));
					j++;
				}
			}
			
			System.out.println(v + " <-- SORTED");
		}
	
}

}


