
//*******************Print in Java*****************************************
public class Daytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Welcome");
	
	
//********************Variables and Datatypes******************************
	
	byte age = 40;
	short birthyear = 1999;
	int pin = 1111;
	long number = 4593950394L;
	
	char a ='A';
	String b ="Sada F";

//******************TypeCasting******************************************
	
	int myInt = 8;
	double myDouble = myInt;
	System.out.println(myDouble);     //Automatic Typecasting
	
	double myDoub = 7.0;
	int myIn = (int) myDoub;
	System.out.println(myIn);		//Manual Typecasting
	
//*******************IF ELSE*********************************************
	
	int myNum = 32;
	
	if(myNum % 2 ==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	
//**********************Operators****************************************
	
	System.out.println(9 == 9);
	System.out.println(2 == 20);
	System.out.println(8 != 40);
	System.out.println(30 > 40);
	System.out.println(60 < 80);
	System.out.println(50 >= 100);
	System.out.println(100 <= 40);
	
	int myNum2 = 0;
	
	if (myNum2 == 0) {
		System.out.println("Zero");
	}
	else if(myNum % 2 ==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	
//************************Conditional Operators**************************
	//AND OPERATOR
	int num1 = 40;
	if(num1 > 0 && num1 % 2 == 0) {
		System.out.println("even positive");
		}
	else if(num1 < 0 && num1 % 2 == 0) {
		System.out.println("even negative");
		}
	else if(num1 == 0) {
		System.out.println("Zero");
		}
	else if(num1 > 0 && num1 % 2 != 0) {
		System.out.println("odd negative");
		}
	else {
		System.out.println("odd negative");
		}
	
	//OR OPERATOR
	int num2 = 20;
	if(num2 > 0 || num2 % 2 == 0) {
		System.out.println("Not zero");
		}
	else {
		System.out.println("Zero");
		}
	
	//NOT OPERATOR
	
	boolean value = false;
	System.out.println(!value);	
	
	//Problem 1
	int n1 = 20; 
	int n2 = 30;
	if(n1>n2) {
		System.out.println("n1 is greater than n2");
	}
	else {
		System.out.println("n1 is smaller than n2");
	}
	
	//Homework Problem 
	int m1= 20;
	int m2= 50;
	int m3= 100;
	if(m1 > m2 && m1 > m3) {
		System.out.println("m1 is greater among all the numbers");
	}
	else if(m2 > m1 && m2 > m3) {
		System.out.println("m2 is greater among all the numbers");
	}
	else {
		System.out.println("m3 is greater among all the numbers");
	}
	}
}





	