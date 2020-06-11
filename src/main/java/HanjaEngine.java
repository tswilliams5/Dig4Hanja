import derivation.Deriver;
import derivation.PracticeDeriver;
import derivation.WordDerivation;
import util.WordExtractor;

import java.util.ArrayList;
import java.util.List;

public class HanjaEngine {
    public HanjaReport compute(String document) {
        HanjaReport report = new HanjaReport(document);
        List<String> words = new WordExtractor().extractWords(document);
        List<String> hanjaWords = new ArrayList<String>();
        // implement this to hit a real API when ready
        Deriver deriver = new PracticeDeriver();
        for (String word : words) {
            WordDerivation wordDerivation = deriver.deriveOrigin(word);
            if (wordDerivation.isHanja()) {
                hanjaWords.add(word);
            }
        }

        report.setWordCount(words.size());
        report.setHanjaDerivedWords(hanjaWords);
        return report;
    }
}
