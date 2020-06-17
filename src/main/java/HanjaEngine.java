import java.util.HashMap;
import java.util.List;
import java.util.Map;

import derivation.Deriver;
import derivation.PracticeDeriver;
import derivation.WordDerivation;
import util.WordExtractor;

public class HanjaEngine {
    public HanjaReport compute(String document) {
        HanjaReport report = new HanjaReport(document);
        List<String> words = new WordExtractor().extractWords(document);
        Map<String, Integer> hanjaWords = new HashMap<String, Integer>();
        // implement this to hit a real API when ready
        Deriver deriver = new PracticeDeriver();
        for (String word : words) {
            WordDerivation wordDerivation = deriver.deriveOrigin(word);
            if (wordDerivation.isHanja()) {
                hanjaWords.merge(word, 1, Integer::sum);
            }
        }

        report.setWordCount(words.size());
        report.setHanjaDerivedWords(hanjaWords);
        return report;
    }
}
