package classandobject;

import com.wipro.classandobject.calculator;

public class calculator {
	static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
}


 class calculatorsta {

	public static void main(String[] args) {
		System.out.println(calculator.powerInt(2, 2));
		System.out.println(calculator.powerDouble(2.2, 2));

	

}
}
