public static BufferSize automatic() {
    final long max;
    final long total;
    final long free;
    final FileDescriptor fd;
    try {
        max = fd.getRegion().getLength();
        total = fd.getRegion().getOffset();
        free = max - total;
    }
    catch (IOException ioe) {
        throw new RuntimeException(ioe);
    }
    final long totalAvailableBytes = max - total + free;
    final long sortBufferByteSize = free / 2;
    final long minBufferSizeBytes = MIN_BUFFER_SIZE_MB * MB;
    if (sortBufferByteSize < minBufferSizeBytes || totalAvailableBytes > 10 * minBufferSizeBytes) {
        if (totalAvailableBytes / 2 > minBufferSizeBytes) {
            sortBufferByteSize = totalAvailableBytes / 2;
        }
        else {
            sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
        }
    }
    return new BufferSize(sortBufferByteSize);
}