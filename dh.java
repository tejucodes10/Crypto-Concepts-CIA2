// This program calculates the Key for two persons
// using the Diffie-Hellman Key exchange algorithm
import java.util.*;
import java.io.*;
class dh {

	// Power function to return value of a ^ b mod P
	private static long power(long a, long b, long p)
	{
		if (b == 1)
			return a;
		else
			return (((long)Math.pow(a, b)) % p);
	}

	public static void main(String[] args)
	{
		long P, G, x, a, y, b, ka, kb;
		Scanner sc=new Scanner(System.in);

		// Both the persons will be agreed upon the
		// public keys G and P

		// A prime number P is taken
		P = 23;
		System.out.println("The value we have assigned for P(prime number) is " + P);

		// A primitive root for P, G is taken
		G = 9;
		System.out.println("The value we have assigned for G(primitive root) is " + G);

		// Alice will choose the private key a
		// a is the chosen private key
		System.out.println("Alice, enter your private key value");
		a=sc.nextLong();

		// Gets the generated key
		x = power(G, a, P);

		// Bob will choose the private key b
		// b is the chosen private key
		System.out.println("Bob, enter your private key value");
		b=sc.nextLong();

		// Gets the generated key
		y = power(G, b, P);

		// Generating the secret key after the exchange
		// of keys
		ka = power(y, a, P); // Secret key for Alice
		kb = power(x, b, P); // Secret key for Bob

		System.out.println("Secret key for the Alice is:"
						+ ka);
		System.out.println("Secret key for the Bob is:"
						+ kb);
		if(ka==kb)
		{
		System.out.println("Since the secret key values are matching - Diffie Hellman Key Exchange is successful!");
		}
	}
}


