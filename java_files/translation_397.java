import java.util.*;

public class Translation397 {
    ublic void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt("core", null, "packedgitopenfiles", getPackConfig().getOpenFiles()));
    setPackedGitLimit(rc.getLong("core", null, "packedgitlimit", getPackConfig().getLimit()));
    setPackedGitWindowSize(rc.getInt("core", null, "packedgitwindowsize", getPackConfig().getWindowSize()));
    setPackedGitMMAP(rc.getBoolean("core", null, "packedgitmmap", getPackConfig().isMMAP()));
    setDeltaBaseCacheLimit(rc.getInt("core", null, "deltabasecachelimit", getDeltaBaseCacheLimit()));
    long maxMem = Runtime.getRuntime().maxMemory();
    long sft = rc.getLong("core", null, "streamfilethreshold", getMaxMergeSize());
    if (sft == -1)sft = maxMem / (4 * MB);
    elsesft = Math.min(sft, maxMem / (2 * MB));
    setStreamFileThreshold((int) sft);
}
}