import java.util.*;

public class Translation404 {
    public FileBasedConfig(Config base, File cfgLocation, FS fs) {
    super(base);
    configFile = cfgLocation;
    this.fs = fs;
    this.snapshot = FileSnapshot.DIRTY;
    this.hash = null;
}
}