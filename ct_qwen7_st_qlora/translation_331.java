import java.util.*;

public class Translation331 {
    public void addIfNoOverlap(final WeightedPhraseInfo wpi) {
    for (final WeightedPhraseInfo existWpi : phraseList) {
        if (existWpi.isOffsetOverlap(wpi)) {
            existWpi.getTermsInfos().addAll(wpi.getTermsInfos());
            return;
        }
    }
    phraseList.add(wpi);
}
}