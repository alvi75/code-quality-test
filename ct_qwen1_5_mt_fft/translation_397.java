import java.util.*;

public class Translation397 {
    public void fromConfig(Config cfg) {
    setPackedGitOpenFiles(cfg.getInt(null, "packedGitOpenFiles", getPackedGitOpenFiles()));
    setPackedGitLimit(cfg.getLong(null, "packedGitLimit", getPackedGitLimit()));
    setPackedGitWindowSize(cfg.getInt(null, "packedGitWindowSize", getPackedGitWindowSize()));
    setPackedGitMMAP(cfg.getBoolean(null, "packedGitMMAP", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(cfg.getInt(null, "deltaBaseCacheLimit", getDeltaBaseCacheLimit()));
    long maxMem = Runtime.getRuntime().maxMemory();
    long sft = cfg.getLong(null, "streamFileThreshold", getStreamFileThreshold());
    sft = Math.min(sft, maxMem / 4);
    sft = Math.min(sft, Integer.MAX_VALUE);
    setStreamFileThreshold((int) sft);
}
}