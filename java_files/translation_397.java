import java.util.*;

public class Translation397 {
    public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt("core", (String)null, "packedgitopenfiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong("core", (String)null, "packedgitlimit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getInt("core", (String)null, "packedgitwindowsize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean("core", (String)null, "packedgitmmap", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getInt("core", (String)null, "deltabasecachelimit", getDeltaBaseCacheLimit()));
    long maxMem = Runtime.getRuntime().maxMemory();
    long sft = rc.getLong("core", (String)null, "streamfilethreshold", getStreamFileThreshold());
    sft = Math.min(sft, maxMem / 4);
    sft = Math.min(sft, Integer.MAX_VALUE);
    setStreamFileThreshold((int) sft);
}
}