import java.util.*;

public class Translation397 {
    public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt("packedGit.openFiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong("packedGit.limit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getInt("packedGit.windowSize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean("packedGit.mmap", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getInt("deltaBase.cacheLimit", getDeltaBaseCacheLimit()));
    final long maxMem = Runtime.getRuntime().maxMemory();
    final long sft = rc.getLong("streamFile.threshold", getStreamFileThreshold());
    if (sft < MINIMUM_SIZE || sft > maxMem)throw new IllegalArgumentException(MessageFormat.format(JGitText.get().streamFileThresholdMustBeBetweenAnd,maximumSize, Long.valueOf(sft)));
    setStreamFileThreshold(sft);
}
}