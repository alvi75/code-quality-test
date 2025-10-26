import java.util.*;

public class Translation397 {
    ublic override void FromConfig(IConfig rc){
    base.FromConfig(rc);
    SetPackedGitOpenFiles(rc.GetInt("core", null, "packedgitopenfiles", GetPackedGitOpenFiles()));
    SetPackedGitLimit(rc.GetLong("core", null, "packedgitlimit", GetPackedGitLimit()));
    SetPackedGitWindowSize(rc.GetInt("core", null, "packedgitwindowsize", GetPackedGitWindowSize()));
    SetPackedGitMMAP(rc.GetBoolean("core", null, "packedgitmmap", IsPackedGitMMAP()));
    SetDeltaBaseCacheLimit(rc.GetInt("core", null, "deltabasecachelimit", GetDeltaBaseCacheLimit()));
    long maxMem = Runtime.getRuntime().maxMemory();
    long sft = rc.GetLong("core", null, "streamfilethreshold", GetStreamFileThreshold());
    sft = Math.Min(sft, maxMem / 4);
    sft = Math.Min(sft, Integer.MAX_VALUE);
    SetStreamFileThreshold((int)sft);
}
}