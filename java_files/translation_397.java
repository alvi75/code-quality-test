import java.util.*;

public class Translation397 {
    public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt("core", null, "packedgitopenfiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong("core", null, "packedgitlimit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getInt("core", null, "packedgitwindowsize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean("core", null, "packedgitmmap", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getLong("core", null, "deltabasecache", getDeltaBaseCacheLimit()));
}
}