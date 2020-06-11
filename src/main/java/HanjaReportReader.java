import java.util.List;

public class HanjaReportReader {
    public String read(HanjaReport hanjaReport) {
        String isOrAre = (hanjaReport.getHanjaDerivedWordCount() == 1) ? "is" : "are";
        String readReport = "The number of words inside the passage \""
        + hanjaReport.getOriginalDocument()
                + "\" is: " + hanjaReport.getWordCount()
                + ". " + hanjaReport.getHanjaDerivedWordCount()
                + " of them " + isOrAre + " derived from hanja";
        List<String> hanjaDerivedWords = hanjaReport.getHanjaDerivedWords();
        if (hanjaReport.getHanjaDerivedWordCount() == 0) {
            return readReport.concat(".");
        } else if (hanjaReport.getHanjaDerivedWordCount() == 1) {
            return readReport.concat(", " + hanjaDerivedWords.get(0) + ".");
        }
        int i = 0;
        while (i < hanjaDerivedWords.size() - 1) {
            readReport = readReport.concat(", " + hanjaDerivedWords.get(i));
            i++;
        }
        return readReport.concat(" and " + hanjaDerivedWords.get(hanjaReport.getHanjaDerivedWordCount()-1) + ".");
    }
}
