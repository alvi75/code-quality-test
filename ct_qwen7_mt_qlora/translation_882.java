import java.util.*;

public class Translation882 {
    1 public RandomSamplingFacetsCollector(int sampleSize, long seed) {
    2 super(false);
    3 this.sampleSize = sampleSize;
    4 this.random = new XORShift64Random(seed);
    5 this.sampledDocs = null;
}
}