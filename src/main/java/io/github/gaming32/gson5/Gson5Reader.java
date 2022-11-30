package io.github.gaming32.gson5;

import org.quiltmc.json5.JsonReader;

import java.io.IOException;
import java.io.Reader;

public class Gson5Reader extends com.google.gson.stream.JsonReader {
    private static final Reader UNREADABLE_READER = new Reader() {
        @Override
        public int read(char[] buffer, int offset, int count) {
            throw new AssertionError();
        }

        @Override
        public void close() {
            throw new AssertionError();
        }
    };

    private final JsonReader in;

    public Gson5Reader(JsonReader in) {
        super(UNREADABLE_READER);
        this.in = in;
    }

    @Override
    public void beginArray() throws IOException {
        in.beginArray();
    }

    @Override
    public void endArray() throws IOException {
        in.endArray();
    }

    @Override
    public void beginObject() throws IOException {
        in.beginObject();
    }

    @Override
    public void endObject() throws IOException {
        in.endObject();
    }

    @Override
    public boolean hasNext() throws IOException {
        return in.hasNext();
    }

    @Override
    public com.google.gson.stream.JsonToken peek() throws IOException {
        return Gson5MappingData.Q2G_TOKENS.get(in.peek());
    }

    @Override
    public String nextName() throws IOException {
        return in.nextName();
    }

    @Override
    public String nextString() throws IOException {
        return in.nextString();
    }

    @Override
    public boolean nextBoolean() throws IOException {
        return in.nextBoolean();
    }

    @Override
    public void nextNull() throws IOException {
        in.nextNull();
    }

    @Override
    public double nextDouble() throws IOException {
        return in.nextDouble();
    }

    @Override
    public long nextLong() throws IOException {
        return in.nextLong();
    }

    @Override
    public int nextInt() throws IOException {
        return in.nextInt();
    }

    @Override
    public void close() throws IOException {
        in.close();
    }

    @Override
    public void skipValue() throws IOException {
        in.skipValue();
    }
}
