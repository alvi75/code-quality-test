import java.util.*;

public class Translation967 {
    1 public static double max(final double[] values) {
    2 final int size = values.length;
    3 if (size == 0) {
        4 throw new IllegalArgumentException("Array cannot be empty");
        5 }
        6 double maxValue = Double.MIN_VALUE;
        7 for (final double value : values) {
            8 if (!Double.isNaN(value)) {
                9 if (value > maxValue) {
                    10 maxValue = value;
                    11 }
                    12 }
                    13 }
                    14 return maxValue;
                }
}