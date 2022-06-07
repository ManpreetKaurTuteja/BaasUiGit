package com.payu.baas.coreUI.nonUI.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.StringReader;

/*
Converting JSON data to Gson data (models)
 */
public class JsonUtils {
    public static String toString(Object o) {
        return getGson().toJson(o);
    } // object to string

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static Object toObject(String json, Class type) { // json string to object conversion
        return getGson().fromJson(json.trim(), type);
    }

    public static Gson getGson() {
        return new GsonBuilder().disableHtmlEscaping().create();
    }
}
