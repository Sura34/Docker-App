public class Min {

	public static int find_min(int[] a) {
		int x, i;
		x = a[1];
		//for(i = 1; i < a.length; i++){
		//	if(a[i] < x)
		//		x = a[i];
		//}
		
		//
		return x;

	}
	
	public static void main(String args[]){
		int[] intArray = new int[] {3,5,6};
		int res = Min.find_min(intArray);
		System.out.println("The min is: " + res);
	
	}

}


