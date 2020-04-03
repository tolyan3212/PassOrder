package com.passorder.core;

import org.json.JSONException;
import org.json.JSONObject;

public interface JsonConvertible {
    public JSONObject toJson() throws JSONException;
}
