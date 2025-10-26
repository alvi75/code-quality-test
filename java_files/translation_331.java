import java.util.*;

public class Translation331 {
    public void addIfNoOverlap(WeightedPhraseInfo wpi) {
    for (int i = 0;
    i < phraseList.size();
    ++i) {
        WeightedPhraseInfo existWpi = phraseList.get(i);
        if (existWpi.isOffsetOverlap(wpi)) {
            existWpi.addTermsInfos(wpi.getTermsInfos());
            return;
        }
    }
    phraseList.add(wpi);
}
}