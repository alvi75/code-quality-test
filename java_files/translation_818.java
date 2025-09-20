import java.util.*;

public class Translation818 {
    public void preSerialize() {
    if ( records.get( Tabpos ) > 0 ) {
        TabIdRecord tir = (TabIdRecord) records.get( records.get( Tabpos ) - 1 );
        if ( tir.getTabids().length < boundsheets.size()) {
            fixTabIdRecord();
        }
    }
}
}