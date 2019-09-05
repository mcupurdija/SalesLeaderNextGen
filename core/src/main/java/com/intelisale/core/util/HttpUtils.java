package com.intelisale.core.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringWriter;
import java.io.Writer;

public class HttpUtils {

    public static String serialize(ObjectMapper objectMapper, Object object) {

        Writer stringWriter = new StringWriter();
        try {
            objectMapper.writeValue(stringWriter, object);
            return stringWriter.toString();
        } catch (Exception ignored) {
        }
        return null;
    }

    public static <T> T deserialize(ObjectMapper objectMapper, String string, Class<T> type) {

        try {
            return objectMapper.readValue(string, type);
        } catch (Exception ignored) {
        }
        return null;
    }
}
