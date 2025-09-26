import java.util.*;

public class Translation331 {
    103 public void addIfNoOverlap(WeightedPhraseInfo wpi) {
    for (WeightedPhraseInfo existWpi : phraseList) {
        if (existWpi.isOffsetOverlap(wpi)) {
            existWpi.getTermsInfos().addAll(wpi.getTermsInfos());
            return;
        }
    }
    phraseList.add(wpi);
}
}