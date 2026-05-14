import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    /**Returns the element at the location specified by desiredCapacity in primeCapacities.**/
	public static int nextPrime(int desiredCapacity){
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		for (int i = 0; i < primes.length; i++) {
			if(primes[i] >= desiredCapacity) return primes[i];
		}
		return -1;
	}
}