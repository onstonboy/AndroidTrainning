package com.fstyle.androidtrainning.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 12/15/17.
 */

public class OpensearchQuery {

    @SerializedName("#text")
    @Expose
    private String text;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("startPage")
    @Expose
    private String startPage;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

}
