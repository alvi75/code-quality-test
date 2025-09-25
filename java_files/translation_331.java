import java.util.*;

public class Translation331 {
    public final WeightedPhraseInfo addIfNoOverlap(final WeightedPhraseInfo wpi) {
    for (final WeightedPhraseInfo existWpi : phraseList) {
        if (existWpi.isOffsetOverlap(wpi)) {
            existWpi.getTermsInfos().addAll(wpi.getTermsInfos());
            return this;
        }
    }
    phraseList.add(wpi);
    return this;
}
}