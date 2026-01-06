import java.util.*;

public class Translation331 {
    ublic void addIfNoOverlap(WeightedPhraseInfo wpi) {
    for (WeightedPhraseInfo existWpi : phraseList) {
        if (existWpi.isOffsetOverlap(wpi)) {
            existWpi.getTermsInfos().addAll(wpi.getTermsInfos());
            return;
        }
    }
    phraseList.add(wpi);
}
}