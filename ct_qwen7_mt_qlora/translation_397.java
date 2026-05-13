import java.util.*;

public class Translation397 {
    1 public void fromConfig( Config rc ) {
    2 setPackedGitOpenFiles( rc.getInt( "core" , null , "packedgitopenfiles" , getPackedGitOpenFiles() ) );
    3 setPackedGitLimit( rc.getLong( "core" , null , "packedgitlimit" , getPackedGitLimit() ) );
    4 setPackedGitWindowSize( rc.getInt( "core" , null , "packedgitwindowsize" , getPackedGitWindowSize() ) );
    5 setPackedGitMMAP( rc.getBoolean( "core" , null , "packedgitmmap" , isPackedGitMMAP() ) );
    6 setDeltaBaseCacheLimit( rc.getInt( "core" , null , "deltabasecachelimit" , getDeltaBaseCacheLimit() ) );
    7 long maxMem = Runtime.getRuntime().maxMemory();
    8 long sft = rc.getLong( "core" , null , "streamfilethreshold" , getStreamFileThreshold() );
    9 sft = Math.min( sft , maxMem / 4 );
    10 sft = Math.min( sft , Integer.MAX_VALUE );
    11 setStreamFileThreshold( (int) sft );
}
}