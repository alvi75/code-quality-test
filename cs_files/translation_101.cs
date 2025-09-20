using System;
using System.Collections.Generic;

public class Translation101
{
    public SparseIntArray(int initialCapacity){
    m_array = new int[ArrayUtil.Oversize(initialCapacity, RamUsageEstimator.NUM_BYTES_INT32)];
    m_cursor = 0;
}
}