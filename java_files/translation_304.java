import java.util.*;

public class Translation304 {
    public DBCluster promoteReadReplica(DBClusterPromotionMode promotionMode) {
    return promoteReadReplica(new DBClusterPromotionRequest().withDBClusterIdentifier(getDbClusterIdentifier()).withPromotionMode(promotionMode));
}
}