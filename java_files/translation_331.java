import java.util.*;

public class Translation331 {
    public void addIfNoOverlap(WeightedPhraseInfo wpi) {
    for (int i = 0;
    i < phraseList.size();
    i++) {
        if (phraseList.get(i).isOffsetOverlap(wpi)) {
            phraseList.get(i).getTermsInfos().addAll(wpi.getTermsInfos());
            return;
        }
    }
    phraseList.add(wpi);
}
}