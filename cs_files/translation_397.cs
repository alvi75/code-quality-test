using System;
using System.Collections.Generic;

public class Translation397
{
    public virtual WindowCacheConfig FromConfig(Config rc){
    packedGitUseStrongRefs = rc.GetBoolean(ConfigConstants.CONFIG_SECTION, "packedGitUseStrongRefs", true);
    packedGitOpenFiles = rc.GetInt32(ConfigConstants.CONFIG_SECTION, "packedGitOpenFiles", 10 * MB);
    packedGitLimit = rc.GetInt32(ConfigConstants.CONFIG_SECTION, "packedGitLimit", 10 * MB);
    packedGitWindowSize = rc.GetInt32(ConfigConstants.CONFIG_SECTION, "packedGitWindowSize", 8192);
    packedGitMMAP = rc.GetBoolean(ConfigConstants.CONFIG_SECTION, "packedGitMMAP", false);
    deltaBaseCacheLimit = rc.GetInt32(ConfigConstants.CONFIG_SECTION, "deltaBaseCacheLimit", 10 * MB);
    rc.SetInt32(ConfigConstants.CONFIG_SECTION, "streamFileThreshold", 8 * MB);
    long maxMem = Runtime.GetRuntime().GetMaxMemory();
    long sft = rc.GetLong(ConfigConstants.CONFIG_SECTION, "streamFileThreshold", maxMem / 4);
    sft = Math.Min(sft, maxMem / 4);
    sft = Math.Max(sft, 1 * MB);
    SetStreamFileThreshold(sft);
    return this;
}
}