package com.example.antonio.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by antonio on 22/7/18.
 */

public class Session {

    private SharedPreferences prefs;

    public Session(Context cntx) {
        // TODO Auto-generated constructor stub
        prefs = PreferenceManager.getDefaultSharedPreferences(cntx);
    }

    public void setusename(String usename) {
        prefs.edit().putString("usename1", usename).commit();

    }

    public String getusename() {
        String usename = prefs.getString("usename","");
        return usename;
    }
}
