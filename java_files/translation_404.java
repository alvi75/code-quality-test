import java.util.*;

public class Translation404 {
    public FileBasedConfig(Config base, File cfgLocation, FS fs) {
    super(base);
    this.cfgLocation = cfgLocation;
    this.fs = fs;
    this.snapshot = DIRTY;
    this.hash = ObjectId.zeroId();
}
}