import java.util.*;

public class Translationtranslation_397 {
    public void fromConfig(Config rc) {
        setPackedGitOpenFiles(rc.getInt("core", null, "packedGitOpenFiles", getPackedGitOpenFiles()));
        setPackedGitLimit(rc.getLong("core", null, "packedGitLimit", getPackedGitLimit()));
        setPackedGitWindowSize(rc.getInt("core", null, "packedGitWindowSize", getPackedGitWindowSize()));
        setPackedGitMMAP(rc.getBoolean("core", null, "packedGitMMAP", isPackedGitMMAP());
        setDeltaBaseCacheLimit(rc.getInt("core", null, "deltaBaseCacheLimit", getDeltaBaseCacheLimit()));
        final long maxMem = Runtime.getRuntime().maxMemory();
        final long sft = rc.getLong("core", null, "streamFileThreshold", getStreamFileThreshold());
        sft = Math.min(sft, maxMem / 4);
        sft = Math.min(sft, Integer.MAX_VALUE);
        setStreamFileThreshold(sft);
    }
}