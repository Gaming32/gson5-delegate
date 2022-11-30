package io.github.gaming32.gson5;

import org.quiltmc.json5.JsonToken;

import java.util.EnumMap;
import java.util.Map;

public final class Gson5MappingData {
    public static final Map<JsonToken, com.google.gson.stream.JsonToken> Q2G_TOKENS = new EnumMap<>(JsonToken.class);
    public static final Map<com.google.gson.stream.JsonToken, JsonToken> G2Q_TOKENS;

    static {
        Q2G_TOKENS.put(JsonToken.BEGIN_ARRAY, com.google.gson.stream.JsonToken.BEGIN_ARRAY);
        Q2G_TOKENS.put(JsonToken.END_ARRAY, com.google.gson.stream.JsonToken.END_ARRAY);
        Q2G_TOKENS.put(JsonToken.BEGIN_OBJECT, com.google.gson.stream.JsonToken.BEGIN_OBJECT);
        Q2G_TOKENS.put(JsonToken.END_OBJECT, com.google.gson.stream.JsonToken.END_OBJECT);
        Q2G_TOKENS.put(JsonToken.NAME, com.google.gson.stream.JsonToken.NAME);
        Q2G_TOKENS.put(JsonToken.STRING, com.google.gson.stream.JsonToken.STRING);
        Q2G_TOKENS.put(JsonToken.NUMBER, com.google.gson.stream.JsonToken.NUMBER);
        Q2G_TOKENS.put(JsonToken.BOOLEAN, com.google.gson.stream.JsonToken.BOOLEAN);
        Q2G_TOKENS.put(JsonToken.NULL, com.google.gson.stream.JsonToken.NULL);
        Q2G_TOKENS.put(JsonToken.END_DOCUMENT, com.google.gson.stream.JsonToken.END_DOCUMENT);

        G2Q_TOKENS = new EnumMap<>(com.google.gson.stream.JsonToken.class);
        for (final JsonToken token : Q2G_TOKENS.keySet()) {
            G2Q_TOKENS.put(Q2G_TOKENS.get(token), token);
        }
    }

    private Gson5MappingData() {
    }
}
