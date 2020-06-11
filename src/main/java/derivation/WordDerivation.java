package derivation;

import java.util.Map;

public class WordDerivation {

    private boolean isHanja;
    private Map<String, String> hangulToHanja;

    public boolean isHanja() {
        return isHanja;
    }

    public void setHanja(boolean hanja) {
        isHanja = hanja;
    }

    public Map<String, String> getHangulToHanja() {
        return hangulToHanja;
    }

    public void setHangulToHanja(Map<String, String> hangulToHanja) {
        this.hangulToHanja = hangulToHanja;
    }
}
