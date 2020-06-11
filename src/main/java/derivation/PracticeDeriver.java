package derivation;

import java.util.HashMap;

public class PracticeDeriver implements Deriver {
    @Override
    public WordDerivation deriveOrigin(String koreanWord) {
        WordDerivation wordDerivation = new WordDerivation();
            HashMap<String, String> hangulToHanjaMap = new HashMap<String, String>();
        if (koreanWord.contains("공부")) {
            wordDerivation.setHanja(true);
            hangulToHanjaMap.put("공", "工");
            hangulToHanjaMap.put("부", "夫");
            wordDerivation.setHangulToHanja(hangulToHanjaMap);
        }
        if (koreanWord.contains("실제")) {
            wordDerivation.setHanja(true);
            hangulToHanjaMap.put("실", "實");
            hangulToHanjaMap.put("제", "際");
        } if (koreanWord.contains("결정")) {
            wordDerivation.setHanja(true);
            hangulToHanjaMap.put("결", "決");
            hangulToHanjaMap.put("정", "定");
        }
        return wordDerivation;
    }
}
