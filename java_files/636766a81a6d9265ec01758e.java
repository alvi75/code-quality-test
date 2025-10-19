import java.util.*;

public class Generated_636766a81a6d9265ec01758e {
    public static int nextPrime(int desiredCapacity){
		int capacity = 1;
		while(capacity < desiredCapacity){
			capacity <<= 1;
		}
		return capacity;
	}
}