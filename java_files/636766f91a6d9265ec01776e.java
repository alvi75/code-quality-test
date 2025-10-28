import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[],
                      final int off,
                      final int len)
        throws IOException {
        if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled())
            SibTr.entry(this, tc, "write", new Object[] {b, Integer.valueOf(off), Integer.valueOf(len)});
        // Check that the buffer is not null
        if (buffer == null) {
            throw new IllegalStateException("Buffer has been closed");
        }
        // Check that the buffer is not empty
        if (buffer.length == 0) {
            throw new IllegalStateException("Buffer is empty");
        }

        // Check that the buffer is large enough to hold the data
        if ((off + len) > buffer.length) {
            throw new IllegalArgumentException("Requested length (" + len +
                                                ") exceeds available buffer size (" + buffer.length + ")");
        }

        // Copy the requested number of bytes into the buffer
        System.arraycopy(b, off, buffer, off, len);

        // If we have reached the end of the buffer, then flush it out
        if (off + len == buffer.length) {
            flush();
        }
        if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled())
            SibTr.exit(this, tc, "write", new Object[] {this, Integer.valueOf(off), Integer.valueOf(len)});
    }
}