import java.util.*;

public class Translation331 {
    1 public final void addIfNoOverlap(final WeightedPhraseInfo wpi) {
    2 for (final WeightedPhraseInfo existWpi : phraseList) {
        3 if (existWpi.isOffsetOverlap(wpi)) {
            4 existWpi.termsInfos.addAll(wpi.termsInfos);
            5 return;
            6 }
            7 }
            8 phraseList.add(wpi);
        }
}