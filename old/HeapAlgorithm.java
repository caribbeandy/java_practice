import java.util.Arrays;

class HeapAlgorithm {

	
	public static void generate(int n, int [] a) {

		if ( n == 1 ) {
            //return a;
			System.out.println(Arrays.toString(a));
		} else {

            int i = 0;

            while(true) {

                generate(n-1, a);

                if ( i == (n-1) ) {
                    break;
                }

                if ( n%2 == 0 ) {
                    int tmp = a[i];
                    a[i] = a[n-1];
                    a[n-1] = tmp;
                } else {
                    int tmp = a[0];
                    a[0] = a[n-1];
                    a[n-1] = tmp;
                }
                i++;
            }
		}
	}

    public static void main (String [] args) {

        int [] a = new int[]{1,2,3};
        generate(3, a);
    }


/*
procedure generate(n : integer, A : array of any):
    if n = 1 then
          output(A)
    else
        i := 0
        while True do
            generate(n - 1, A)
            if i = (n - 1) then
                break
            end if
            if n is even then
                swap(A[i], A[n-1])
            else
                swap(A[0], A[n-1])
            end if
            i := i + 1
        end while
    end if
*/
}
