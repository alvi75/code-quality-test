import java.util.*;

public class Translation882 {
    public RandomSamplingFacetsCollector(int sampleSize, long seed) {
    this.sampleSize = sampleSize;
    this.random = new XORShift64Random(seed);
    this.sampledDocs = null;
}
}