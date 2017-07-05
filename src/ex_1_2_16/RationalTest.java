package ex_1_2_16;

public class RationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rational rationalX = new Rational(7,58);
			Rational rationalY = new Rational(1,8);
			
			Rational product = rationalX.times(rationalY);
			Rational quotient = rationalX.divide(rationalY);
			Rational sum = rationalX.plus(rationalY);
			Rational diff = rationalX.minus(rationalY);
			
			
			product.toLowestTerms();
			System.out.println("product = "+product.toString());
			
			System.out.println("quotient = "+quotient.toString());

			
			System.out.println("sum = "+sum.toString());
			
			System.out.println("diff = "+diff.toString());
			Rational rationalz = new Rational(96,49);
	}

}
