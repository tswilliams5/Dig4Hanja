import java.util.Map;

public class HanjaReportReader {
    public String read(HanjaReport hanjaReport) {
        String isOrAre = (hanjaReport.getHanjaDerivedWordCount() == 1) ? "is" : "are";
        String readReport = "The number of words inside the passage \""
        + hanjaReport.getOriginalDocument()
                + "\" is: " + hanjaReport.getWordCount()
                + ". " + hanjaReport.getHanjaDerivedWordCount()
                + " of them " + isOrAre + " derived from hanja";
        Map<String, Integer> hanjaDerivedWords = hanjaReport.getHanjaDerivedWords();
        String[] words = hanjaDerivedWords.keySet().toArray(new String[hanjaDerivedWords.size()]);
        Integer[] quantities = hanjaDerivedWords.values().toArray(new Integer[hanjaDerivedWords.size()]);
        if (hanjaReport.getHanjaDerivedWordCount() == 0) {
            return readReport.concat(".");
        } else if (hanjaReport.getHanjaDerivedWordCount() == 1) {
            return readReport.concat(", " + words[0] + " (" + quantities[0] + (quantities[0] == 1 ? " time)" : " times)" + "."));
        }
        int i = 0;
        while (i < hanjaDerivedWords.size() - 1) {
            readReport = readReport.concat(", " + words[i] + " (" + quantities[i] + (quantities[i] == 1 ? " time)" : " times)") );
            i++;
        }
        return readReport.concat(" and " + words[i-1] + " (" + quantities[i-1] + (quantities[i-1] == 1 ? " time)" : " times)") + ".");
    }
}
