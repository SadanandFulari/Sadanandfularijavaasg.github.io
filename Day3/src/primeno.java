
public class primeno {

	public static void main(String[] args) {
		int num = 300;
		int count_of_factors = 0;
		
		for(int i = 1; i<=num ;i++) {
			if(num % i == 0) {
				count_of_factors = count_of_factors + 1;
			}
			
		}
		if(count_of_factors == 2) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}

	}

}
