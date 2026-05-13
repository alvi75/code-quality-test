import java.util.*;

public class Translation397 {
    public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt(null, "packedgitopenfiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong(null, "packedgitlimit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getInt(null, "packedgitwindowsize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean(null, "packedgitmmap", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getInt(null, "deltabasecachelimit", getDeltaBaseCacheLimit()));
    setCompressionLevel(rc.getInt(null, "compressionlevel", getCompressionLevel()));
    final long maxmem = Runtime.getRuntime().maxMemory();
    final long sft = rc.getLong(null, "streamfilethreshold", getStreamFileThreshold());
    setStreamFileThreshold(Math.min(sft, maxmem/4));
}
}