import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_580 {
    public static void register(MergeStrategy mergeStrategy) {
        if (mergeStrategy instanceof MergeStrategy.UnshallowMergeStrategy) {
            unshallow = new ArrayList<>();
            unshallow.add(mergeStrategy);
        }
        else if (mergeStrategy instanceof MergeStrategy.ShallowMergeStrategy) {
            shallow = new ArrayList<>();
            shallow.add(mergeStrategy);
        }
        else {
            throw new IllegalArgumentException("Unsupported merge strategy type: " + mergeStrategy.getClass().getName());
        }
    }
}