import java.util.ArrayList;
import java.util.List;

public class HanjaReport {
    private String originalDocument;
    private int wordCount;
    private List<String> hanjaDerivedWords;

    public HanjaReport(String originalDocument) {
        this.originalDocument = originalDocument;
        hanjaDerivedWords = new ArrayList<String>();
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

    public List<String> getHanjaDerivedWords() {
        return hanjaDerivedWords;
    }

    public void setHanjaDerivedWords(List<String> hanjaDerivedWords) {
        this.hanjaDerivedWords = hanjaDerivedWords;
    }
}
