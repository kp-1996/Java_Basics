
public class MathFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = Math.abs(-5); //Returns the absolute value of a given number
		int abs2 = Math.abs(2);
		System.out.println("Absolute Num1: "+number+"\nAbsolute Num2: "+abs2);
		System.out.println("Square Root: "+Math.sqrt(36)); //Returns the rounded positive square root of a double
		
		System.out.println("Cube Root: "+(int) Math.cbrt(125)); //Returns the cube root of a double
		
		System.out.println("Max: "+Math.max(50, 56)); //Returns the maximum between two values
		
		System.out.println("Min: "+Math.min(20, 10)); //Returns the minimum between two values
		
		System.out.println("Random: "+Math.random()); //Returns a pseudorandomly double greater than or equal to 0.0 and less than 1.0
		
		System.out.println("Signum: " +Math.signum(-5)); //Returns 1.0 if the argument is greater than zero or -1.0 otherwise.
		
		System.out.println("Copy sign: "+ Math.copySign(6, -2)); //Accepts two parameters and returns the first argument with the sign of the second argument
		
		System.out.println("Exponential e power x: "+ Math.exp(1));
		
		System.out.println("Exponential e power x - 1: "+Math.expm1(1));
		
		System.out.println("Log value: "+Math.log(10)); //Returns the natural logarithm of a double value
		
		System.out.println("Log 10: "+Math.log10(2)); //Returns the logarithm in base 10 of the argument
		
		System.out.println("ln(1 + x): "+Math.log1p(2)); //It adds 1 to the argument ln(1 + x)
		
		System.out.println("Degree: "+Math.toDegrees(Math.PI)); //convert radians to degrees
		
		System.out.println("Radians: "+Math.toRadians(180)); //Returns the radians of a given number
		
		System.out.println("Round: "+Math.ceil(Math.PI)); //
		
		System.out.println(Math.floor(Math.PI));
		
		System.out.println(Math.round(12.35698));
		
		System.out.println(Math.pow(2, 6));
		
	}

}
