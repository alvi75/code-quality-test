import java.util.*;

public class Translation334 {
    0;
int i = 0;
while (i < children.Count){
    if (children[i] is RuleNode){
        RuleNode rn = (RuleNode)children[i];
        if (rn.GetRuleContext() == this){
            return rn.GetChildren();
        }
    }
    i++;
}
return null;
}
}