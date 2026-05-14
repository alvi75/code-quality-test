import java.util.*;

public class Translation661 {
    1 public LifecycleHook[] describeLifecycleHooks(String autoScalingGroupName) {
    2 return describeLifecycleHooks(new DescribeLifecycleHooksRequest().withAutoScalingGroupName(autoScalingGroupName)).getLifecycleHooks().toArray(new LifecycleHook[0]);
}
}