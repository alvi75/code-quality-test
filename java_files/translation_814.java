import java.util.*;

public class Translation814 {
    public ValueFiller getValueFiller() {
    return new ValueFiller() {
        private final MutableValueBool mval = new MutableValueBoolean();
        @Override @Override public void fillSlice(ValueSource vs, int from, int to) {
            assert from >= 0;
            assert from <= to;
            assert PackedInts.unsignedBitsRequired(vs.length()) <= bitsPerValue;
            final int valuesPerBlock = 64 / bitsPerValue;
            if (to - from + 1) > valuesPerBlock << 1) {
                throw new IllegalArgumentException("cannot handle blocks of more than " + valuesPerBlock + " values");
            }
            int fromOffsetInBlock = from % valuesPerBlock;
            final int fromBlock = from / valuesPerBlock;
            final int toBlock = to / valuesPerBlock;
            final int fromMask = mask(from);
            final int toMask = mask(to);
            while (true) {
                final long blockValue = BlockPackedReaderIterator.readLong(block);
                if ((blockValue & fromMask) != 0) {
                    fillSliceImpl(vs, from, to, fromBlock * valuesPerBlock, blockValue);
                }
                from += valuesPerBlock;
                block++;
            }
            while (block < toBlock);
            for (int i = valuesPerBlock * to;
            i < to;
            ++i) {
                set(i, fromBlock, 0);
            }
        }
}