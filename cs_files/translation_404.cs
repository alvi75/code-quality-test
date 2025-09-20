using System;
using System.Collections.Generic;

public class Translation404
{
    public FileBasedConfig(NGit.Config base, string configFilePath, FS fs) : base(){
    baseConfig = base;
    configFile = configFilePath;
    hash = new DigestHash();
    fs = fs;
}
}