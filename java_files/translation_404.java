import java.util.*;

public class Translation404 {
    public FileBasedConfig(Config base, Path cfgLocation, FileSystem fs) {
    super(base);
    configFile = cfgLocation;
    this.fs = fs;
    hash = new ObjectId();
}
}