package ex_1_2_16;

public class Rational {

	long numerator;
	long denominator;

	// recursive implementation
	public static long gcd(long p, long q) {
	//	if (q == 0)
		//	return p;
		//else
		//	return gcd(q, p % q);
		return gcd2(p,q);
	}
	
	// non recursive implementation test
	public static long gcd2(long p, long q) {
		long gcd = Math.min(p, q);
		for(long pp = Math.min(p, q); pp>0;pp--){
			if((Math.max(p, q)%pp )==0 && (Math.min(p, q)%pp )==0){  // is divisible between two factors
				return gcd;
			}
			gcd--;
		}
		return gcd;
		
	}

	public void toLowestTerms() {
		long gcd = gcd(numerator, denominator);

		numerator = numerator / gcd;
		denominator = denominator / gcd;
		// System.out.println(numerator/gcd+" / "+denominator/gcd);
	}

	Rational(long numerator, long denominator) {
		
		
		//System.out.println(gcd(numerator, denominator)+" ===="+gcd2(numerator, denominator));
		this.numerator = numerator;
		this.denominator = denominator;
		// System.out.println(gcd(numerator, denominator) );
		if (gcd(numerator, denominator) == 1) {
		//	throw new IllegalArgumentException();
		} else {
			// System.out.println("Valid");
		}
	}

	Rational plus(Rational b) {

		long sumDenomenator = this.denominator * b.denominator;
		long sumNumerator = (this.numerator*b.denominator) +(this.denominator * b.numerator);

		return new Rational(sumNumerator, sumDenomenator);

	}

	
	  Rational minus(Rational b){

			long diffDenomenator = this.denominator * b.denominator;
			long diffNumerator = (this.numerator*b.denominator) -(this.denominator * b.numerator);

			return new Rational(diffNumerator, diffDenomenator);
	  }
	
	Rational times(Rational b) {
		return new Rational(b.numerator * this.numerator, b.denominator * this.denominator);
	}

	Rational divide(Rational b) {
		return new Rational(this.numerator * b.denominator, this.denominator * b.numerator);
	}
	/*
	 * 
	 * boolean equals(Rational that){
	 * 
	 * }
	 */
@Override
	public String toString() {
		toLowestTerms();
		return this.numerator + " / " + this.denominator + " \n";
	}

}
