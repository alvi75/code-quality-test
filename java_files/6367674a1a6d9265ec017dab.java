import java.util.*;

public class Generated_6367674a1a6d9265ec017dab {
    /**
	 * Compares two values. If the difference between the two values is less than epsilon, 0 is returned. Otherwise, Double.compare is invoked.
	 */
	@Override
	public int compare(Double o1,Double o2) {
		if (Math.abs(o1-o2)<epsilon)
			return 0;
		else
			return Double.compare(o1,o2);
	}
}