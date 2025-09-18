public void fromConfig(Config rc) {
    setPackedGitOpenFiles(rc.getInt("core", null, "packedgitopenfiles", getPackedGitOpenFiles()));
    setPackedGitLimit(rc.getLong("core", null, "packedgitlimit", getPackedGitLimit()));
    setPackedGitWindowSize(rc.getInt("core", null, "packedgitwindowsize", getPackedGitWindowSize()));
    setPackedGitMMAP(rc.getBoolean("core", null, "packedgitmmap", isPackedGitMMAP()));
    setDeltaBaseCacheLimit(rc.getInt("core", null, "deltabasecachelimit", getDeltaBaseCacheLimit()));
    final long maxMem = Runtime.getRuntime().maxMemory();
    final long sft = rc.getLong("core", null, "streamfilethreshold", getStreamFileThreshold());
    sft = Math.min(sft, maxMem / 4);
    sft = Math.min(sft, Integer.MAX_VALUE);
    setStreamFileThreshold(sft);
}