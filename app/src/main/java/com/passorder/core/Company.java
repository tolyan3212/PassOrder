package com.passorder.core;

import org.json.JSONException;
import org.json.JSONObject;

public class Company implements JsonConvertible {
    private String name;
    public Company(String name) {
        this.name = name;
    }
    public Company(JSONObject jsonObject) {
        try {
            setName(jsonObject.getString(DBHelper.COMPANY_NAME));
        } catch (JSONException e) {}
    }
    public JSONObject toJson() {
        JSONObject jo = new JSONObject();
        try {
            jo.put(DBHelper.COMPANY_NAME, name);
        } catch (JSONException e) {}
        return jo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
