
public class Day3 {

	public static void main(String[] args) {
		//***********************LOOPS*****************
		
		//FOR LOOP
		for(int var = 1 ; var < 10 ; var++) {
			System.out.println(var);		
			}
		System.out.println("Hello world");
		
		for(int num = 99 ; num >=1 ; num-=2) {
			System.out.println(num);
		}
		
		//printing table logic
		
		int myNum = 10;
		for(int a = 1 ; a <= 10 ; a++) {
			System.out.println(myNum * a);
		}
		
		//Printing 1 to 10 in while
		int i = 1;
		while(i<11) {
			System.out.println(i);
			i++;
		}
		//Printing 1 to 10 in do while
		int j = 1;
		do {
			System.out.println(j);
			j = j+1;
		}while(j<11);
	}

}
