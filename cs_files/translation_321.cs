using System;
using System.Collections.Generic;

public class Translation321
{
    public override ObjectStream OpenStream(){
    PackIndexReader packIn;
    object db = null;
    try{
        db = db.Open(dbDir, entryName);
        packIn = new PackIndexReader(db);
    }
    catch (IOException e){
        throw new IOException(e);
    }
    finally{
        if (db != null){
            db.Close();
        }
    }
    int bufferSize = 8192;
    Stream @in = new Stream(new InflaterInputStream(packIn, bufferSize), bufferSize);
    return new ObjectStream(@in);
}
}