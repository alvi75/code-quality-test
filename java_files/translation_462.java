import java.util.*;

public class Translation462 {
    0) {
    throw new ArgumentException("Invalid group name");
}
if (policyName == null || policyName.Length < 1 || policyName.Length > 256) {
    throw new ArgumentException("Invalid policy name");
}
this.groupName = groupName;
this.policyName = policyName;
}
}