import java.util.Scanner;

class TestSort {

	public static void toBase(int number) {

		String binary = "";
		int temp = number/2+1;

		for (int j = 0; j < temp ; j++) {
				binary += "" + number % 2;
				number /= 2;
		}
		for (int j = binary.length() - 1; j >= 0; j--) {
			System.out.print(binary.charAt(j));
		}
	}

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        while(true) {
            int num = in.nextInt();
            toBase(num);
            System.out.println();
        }
    }

}
