package com.example.tudiendongian.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService implements IDictionaryService {
    private static Map<String, String> dictionary;

    static {
        dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("bye", "Tạm biệt");
        dictionary.put("thank", "Cảm ơn");
        dictionary.put("welcome", "Chào mừng");
        dictionary.put("goodbye", "Tạm biệt");
        dictionary.put("thankyou", "Cảm ơn");
    }

    @Override
    public String getWord(String key) {
        return dictionary.getOrDefault(key, "Không tìm thấy từ");
    }
}
