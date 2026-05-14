import java.util.*;

public class Translation397 {
    public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getLong("core.packedGitOpenFiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong("core.packedGitLimit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getLong("core.packedGitWindowSize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean("core.packedGitMMap", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getLong("core.deltaBaseCacheLimit", getDeltaBaseCacheLimit()));
    final long maxMem = Runtime.getRuntime().maxMemory();
    long sft = rc.getLong("core.streamFileThreshold", getStreamFileThreshold());
    sft = Math.min(sft, maxMem/4);
    sft = Math.min(sft, Integer.MAX_VALUE);
    setStreamFileThreshold((int)sft);
}
}