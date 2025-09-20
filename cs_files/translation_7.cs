using System;
using System.Collections.Generic;

public class Translation7
{
    public POIFSFileSystem(){
    this(true);
    _header.BATCount = 1;
    _header.BATArray = new int[1];
    _bat_block = new BATBlock();
    _bat_block.SetBlockType(BATBlock.BAT_TYPE_FAT);
    _bat_block.AddProperty(new Property(PropertyIDMap.PID_FAT));
    _sbat_block = new SBABlock();
    _sbat_block.SetBlockType(BATBlock.BAT_TYPE_SBA);
    _sbat_block.AddProperty(new Property(PropertyIDMap.PID_SBA));
}
}