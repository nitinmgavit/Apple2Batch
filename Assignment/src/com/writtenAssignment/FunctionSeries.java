package com.writtenAssignment;

//1.	Design a class to overload a function series() as follows:
//(i) double series(double n) with one double argument and returns the sum of the series, sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
//(ii) double series(double a, double n) with two double arguments and returns the sum of the series, sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms.
//
public class FunctionSeries {

	double series(double n) {
		double sum = 0;

		for (int i = 1; i <= n; i++) {

			sum = (sum + (1.0 / i));
		}
		return sum;
	}

	double series(double a, double n) {
		double sum = 0.0, count = 1.0, val = 2.0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (count /Math.pow(a ,val));
			count = count + 3;
			val = count + 1;
		}
		return sum;
	}

	public static void main(String[] args) {

		FunctionSeries f = new FunctionSeries();
		double series1 = f.series(4);
		double series2 =f.series(3, 4);

		System.out.println(series1);

		System.out.println(series2);
	}

}
