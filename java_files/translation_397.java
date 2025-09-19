import java.util.*;

public class Translation397 {
    public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt("core", null, "packedGitOpenFiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong("core", null, "packedGitLimit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getInt("core", null, "packedGitWindowSize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean("core", null, "packedGitMMAP", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getInt("core", null, "deltaBaseCacheLimit", getDeltaBaseCacheLimit()));
    setStreamFileThreshold(rc.getLong("core", null, "streamFileThreshold", getStreamFileThreshold()));
    setLargeObjectThreshold(rc.getLong("core", null, "largeObjectThreshold", getLargeObjectThreshold()));
    setRefLogIncludeResult(rc.getBoolean("reflogIncludeResult", false));
    setAllowNonFastForwards(rc.getBoolean("allowNonFastForwards", false));
    setFetchResult(rc.get("fetch.result", Result.NO_CHANGE.name()));
    setPushResult(rc.get("push.result", Result.NO_CHANGE.name()));
}
}