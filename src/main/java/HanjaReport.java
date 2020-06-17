import java.util.HashMap;
import java.util.Map;

public class HanjaReport {
    private String originalDocument;
    private int wordCount;
    private Map<String, Integer> hanjaDerivedWords;

    public HanjaReport(String originalDocument) {
        this.originalDocument = originalDocument;
        hanjaDerivedWords = new HashMap<String, Integer>();
        wordCount = 0;
    }

    private HanjaReport() {
    }

    public String getOriginalDocument() {
        return originalDocument;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public int getHanjaDerivedWordCount() {
        return hanjaDerivedWords.size();
    }

    public Map<String, Integer> getHanjaDerivedWords() {
        return hanjaDerivedWords;
    }

    public void setHanjaDerivedWords(Map<String, Integer> hanjaDerivedWords) {
        this.hanjaDerivedWords = hanjaDerivedWords;
    }
}
