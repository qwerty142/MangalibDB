package org.example;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONTokener;

public final class JsonParser {
    private JsonParser() {}

    public static Double getData(String jsonString) throws JSONException {
        org.springframework.boot.configurationprocessor.json.JSONObject json = (org.springframework.boot.configurationprocessor.json.JSONObject) new JSONTokener(jsonString).nextValue();
        JSONArray nextJson = (JSONArray) json.getJSONArray("records").get(0);
        org.springframework.boot.configurationprocessor.json.JSONObject nextJson1 = (JSONObject) nextJson.getJSONArray(0).get(0);
        return nextJson1.getJSONObject("Plan").getDouble("Total Cost");
    }
}
