//package com.passorder.core;
//
//import org.json.JSONObject;
//import org.json.JSONException;
//
//public class Person implements JsonConvertible {
//    private String firstName;
//    private String lastName;
//    private String middleName;
//    private Company company;
//
//    public Person(String name, String surname, String middleName, Company company) {
//        this.firstName = name;
//        this.lastName = surname;
//        this.middleName = middleName;
//        this.company = company;
//    }
//    public Person(JSONObject jsonObject) {
//        try {
//            setFirstName(jsonObject.getString(DBHelper.PERSON_FIRST_NAME));
//            setLastName(jsonObject.getString(DBHelper.PERSON_LAST_NAME));
//            setMiddleName(jsonObject.getString(DBHelper.PERSON_MIDDLE_NAME));
//            setCompany(new Company(jsonObject.getJSONObject(DBHelper.PERSON_COMPANY)));
//        } catch(JSONException e) {}
//    }
//
//    @Override
//    public JSONObject toJson() {
//        JSONObject jo = new JSONObject();
//        try {
//            jo.put(DBHelper.PERSON_FIRST_NAME, firstName);
//            jo.put(DBHelper.PERSON_LAST_NAME, lastName);
//            jo.put(DBHelper.PERSON_MIDDLE_NAME, middleName);
//            jo.put(DBHelper.PERSON_COMPANY, company.toJson());
//        } catch(Exception e) {}
//
//        return jo;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }
//}
