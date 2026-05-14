import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    final long maxTotal;
    final long maxFree;
    try {
        ManagementFactory.getMemoryMXBean();
        // workaround for https://github.com/jenkinsci/jenkins-core/commit/5329b8a7c5eac0efd01dd2fe4a1d117818cbecae#commitcomment-13341386 maxTotal = ManagementFactory.getMemoryMXBean().getMaxHeapMemory();
        maxFree = ManagementFactory.getMemoryMXBean().getFreeHeapMemory();
    }
    catch (NoClassDefFoundError e) {
        return new BufferSize(1 << 24);
    }
    if (maxTotal == Long.MAX_VALUE) {
        return new BufferSize(1 << 24);
    }
    else {
        return new BufferSize(Math.min(maxTotal >> 3 , Math.max(maxFree >> 3 , 1 << 24)));
    }
}
}