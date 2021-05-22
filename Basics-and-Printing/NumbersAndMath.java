public class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" );

		// divides 30 by 6, adds 25
		System.out.println( "Hens " + ( 25 + 30.00 / 6.00 ) );
		// multiplies 25 by 3, modulous 4, subtracted from 100
		System.out.println( "Roosters " + ( 100.00 - 25.00 * 3.00 % 4.00 ) );

		System.out.println( "Now I will count the eggs:" );

		// 3 + 2 + 1 - 5 + (4 modulous 2) - (1 divided by 4) + 6
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1.00 / 4.00 + 6 );

		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		// prints false
		System.out.println( 3 + 2 < 5 - 7 );

		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		System.out.println( "Is it greater? " + ( 5 > -2 ) ); // yes
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) ); // yes
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) ); // no
	}
}
