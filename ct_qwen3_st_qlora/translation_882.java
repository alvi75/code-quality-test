import java.util.*;

public class Translation882 {
    ublic RandomSamplingFacetsCollector(int sampleSize, long seed) {
    super(false);
    this.sampleSize = sampleSize;
    this.random = new XORShift64Random(seed);
    this.sampledDocs = null;
}
}