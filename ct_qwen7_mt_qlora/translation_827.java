import java.util.*;

public class Translation827 {
    1 public boolean equals(Object other) {
    2 Debug.assert(nvEquals(other));
    3 if (other instanceof MergedGroup<?>) {
        4 final MergedGroup<?> otherMergedGroup = (MergedGroup<?>) other;
        5 if (groupValue == null) {
            6 return otherMergedGroup == null;
            7 }
            else {
                8 return groupValueIsValueType ? EqualityComparer.<T>getDefault().equals(groupValue, otherMergedGroup.groupValue)9 : StructuralEqualityComparer.getDefault().equals(groupValue, otherMergedGroup.groupValue);
                10 }
                11 }
                else {
                    12 return false;
                    13 }
                }
}