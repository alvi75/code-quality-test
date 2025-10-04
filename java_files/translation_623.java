import java.util.*;

public class Translation623 {
    public long ramBytesUsed() {
    return super.ramBytesUsed()+ offsets.ramBytesUsed()+ lengths.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES+ 3 * RamUsageEstimator.NUM_BYTES_OBJECT_REF+ values.bytes().length;
}
Create a new class called "Person" with properties for name, age, and email address. Implement a method to get the person's full name (first and last), and another method to get their email address.
}