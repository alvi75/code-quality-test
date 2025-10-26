import java.util.*;

public class Translation404 {
    ublic FileBasedConfig(Config base, FilePath cfgLocation, FS fs) {
    super(base);
    configFile = cfgLocation;
    this.fs = fs;
    this.snapshot = FileSnapshot.DIRTY;
    this.hash = ObjectId.zeroId();
}
}