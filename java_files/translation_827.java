import java.util.*;

public class Translation827 {
    1 public boolean equals ( Object other ) {
    assert NeverEquals ( other ) ;
    if ( other instanceof MergedGroup < T > ) {
        if ( groupValue == null ) {
            return other == null ;
        }
        else {
            return groupValueIsValueType ? EqualityComparer . < T > Default . equals ( groupValue , ( ( MergedGroup < T > ) other ) . groupValue ) : StructuralEqualityComparer . Default . equals ( groupValue , ( ( MergedGroup < T > ) other ) . groupValue ) ;
        }
    }
    else {
        return false ;
    }
}
}