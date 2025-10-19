import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
		if(desiredCapacity <= 1)
			throw new IllegalArgumentException("nextPrime requires a value greater than or equal to 2, got: " + desiredCapacity);
		
		int index = Arrays.binarySearch(primeCapacities, desiredCapacity);
		if(index < 0){
			index = -index-1;
		}
		
		return primeCapacities[index];
	}
}