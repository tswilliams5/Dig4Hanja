package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordExtractor {
    public List<String> extractWords(String string) {
        String[] words = string.split(" ");
        return new ArrayList<String>(Arrays.asList(words));
    }
}
