class H { 
/*
 * Complete the function below.
 */

static int test=1;
    
    static int segment(int x, int[] arr) {

        List<Integer> mins = new ArrayList<Integer>();
        
        int min;
        
        for(int i=0; i<=arr.length-k;i++) {
            min = arr[i];
          /*  for(int j=1; j<k;j++){
                if (arr[i+j] < min) {
                    min = arr[i+j];
                }
            }*/
            mins.add(min);
        }
        
        return 1;//Collections.max(mins);
    }

	public static void main(String [] args) {
		segment(2, new int[]{1,2,3});
	}
}
