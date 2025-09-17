import java.util.*;

public class Translationtranslation_549 {
    public RevFilterPattern(RevFilterPattern(RevFilter[] list) {
        if (list.length == 2)return create(list[0], list[1]);
        if (list.length < 2){
            throw new ArgumentException(JGitText.get().atLeastTwoFiltersNeeded);
        }
        final RevFilter[] subfilters = new RevFilter[list.length];
        else{
            subfilters;
        }
        for (int i = 0;
        i < list.length;
        i++)subfilters[i] = list[i].clone();
    }
    this.subfilters = subfilters;
    }
}