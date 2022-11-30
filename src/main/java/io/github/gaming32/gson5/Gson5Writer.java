package io.github.gaming32.gson5;

import org.quiltmc.json5.JsonWriter;

import java.io.IOException;
import java.io.Writer;

public class Gson5Writer extends com.google.gson.stream.JsonWriter {
    private static final Writer UNWRITABLE_WRITER = new Writer() {
        @Override
        public void write(char[] buffer, int offset, int counter) {
            throw new AssertionError();
        }

        @Override
        public void flush() {
            throw new AssertionError();
        }

        @Override
        public void close() {
            throw new AssertionError();
        }
    };

    private final JsonWriter out;

    public Gson5Writer(JsonWriter out) {
        super(UNWRITABLE_WRITER);
        this.out = out;
    }

    @Override
    public com.google.gson.stream.JsonWriter beginArray() throws IOException {
        out.beginArray();
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter endArray() throws IOException {
        out.endArray();
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter beginObject() throws IOException {
        out.beginObject();
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter endObject() throws IOException {
        out.endObject();
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter name(String name) throws IOException {
        out.name(name);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter value(String value) throws IOException {
        out.value(value);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter jsonValue(String value) throws IOException {
        out.jsonValue(value);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter nullValue() throws IOException {
        out.nullValue();
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter value(boolean value) throws IOException {
        out.value(value);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter value(Boolean value) throws IOException {
        out.value(value);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter value(float value) throws IOException {
        out.value(value);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter value(double value) throws IOException {
        out.value(value);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter value(long value) throws IOException {
        out.value(value);
        return this;
    }

    @Override
    public com.google.gson.stream.JsonWriter value(Number value) throws IOException {
        out.value(value);
        return this;
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}
