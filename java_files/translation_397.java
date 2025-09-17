import java.util.*;

public class Translationtranslation_397 {
    public void fromConfig(Config rc) {
        setPackedGitOpenFiles(rc.getInt("core", "packedgitopenfiles", DEFAULT_PACKED_GIT_OPEN_FILES));
        setPackedGitLimit(rc.getLong("core", "packedgitlimit", DEFAULT_PACKED_GIT_LIMIT));
        setPackedGitWindowSize(rc.getInt("core", "packedgitwindowsize", DEFAULT_PACKED_GIT_WINDOW_SIZE));
        setPackedGitMMAP(rc.getBoolean("core", "packedgitmmap", false));
        setDeltaBaseCacheLimit(rc.getInt("core", "deltabasecachelimit", DEFAULT_DELTA_BASE_CACHE_LIMIT));
        long maxMem = Runtime.getRuntime().maxMemory();
        long sft = rc.getLong("core", "streamfilethreshold", DEFAULT_STREAM_FILE_THRESHOLD);
        if (sft == -1 || sft > maxMem / 4) {
            sft = maxMem / 4;
        }
        else if (sft < 0) {
            sft = 0;
        }
        setStreamFileThreshold(sft);
    }
}