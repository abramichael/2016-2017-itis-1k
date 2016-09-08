/**
	Mikhail Abramskiy
	ITIS KFU
	Starting java-program template
*/

public class FirstClass {

	public static void main(String [] args) {
	
		// Типы данных - целый int, вещественный double 
		int x = Integer.parseInt(args[0]);
		int y = Double.parseDouble(args[1]);
		
		// арифметика: +, -, *, /, %. При этом на целых числах - целочисленное деление
		double z = x + y;
		
		// При выводе любой тип конвертируется в строку (String)
		System.out.println(z);
	
	}

}