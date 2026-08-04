import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    return RamUsageEstimator.sum(RamUsageEstimator.shallowSizeOf(this), RamUsageEstimator.sizeOf(terms), RamUsageEstimator.sizeOf(termsDict), RamUsageEstimator.sizeOf(termsBlocks), RamUsageEstimator.sizeOf(termsOffsets), RamUsageEstimator.sizeOf(termsIndex), RamUsageEstimator.sizeOf(termsOffsetsOffsets), RamUsageEstimator.sizeOf(termsIndexOffsets), RamUsageEstimator.sizeOf(termsIndexEndOffsets), RamUsageEstimator.sizeOf(termsDictOffsets), RamUsageEstimator.sizeOf(termsDictOffsetsEnd), RamUsageEstimator.sizeOf(termsDictOffsetsEnd));
}
}