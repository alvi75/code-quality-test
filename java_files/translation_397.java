import java.util.*;

public class Translation397 {
    public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt("core", null, "packedgitopenfiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong("core", null, "packedgitlimit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getInt("core", null, "packedgitwindowsize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean("core", null, "packedgitmmap", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getLong("core", null, "deltabasecachelimit", getDeltaBaseCacheLimit()));
    long maxMem = Runtime.getRuntime().maxMemory();
    long sft = rc.getLong("core", null, "streamfilethreshold", getStreamFileThreshold());
    sft = Math.min(sft, maxMem / 4);
    sft = Math.min(sft, Integer.MAX_VALUE);
    setStreamFileThreshold((int) sft);
}
}