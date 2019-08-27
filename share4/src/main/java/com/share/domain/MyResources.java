package com.share.domain;

import java.io.Serializable;
import java.util.Date;

public class MyResources implements Serializable {
    private int record_id;
    private String res_name;
    private String res_info;
    private String res_link;
    private String res_password;
    private String network_disk;
    private String res_seed;
    private String res_username;
    private Date res_uploadtime;
    private int res_indate;

    public MyResources() {
    }

    public MyResources(String res_name, String res_info, String res_link, String res_password, String network_disk, String res_seed, String res_username, Date res_uploadtime, int res_indate) {
        this.res_name = res_name;
        this.res_info = res_info;
        this.res_link = res_link;
        this.res_password = res_password;
        this.network_disk = network_disk;
        this.res_seed = res_seed;
        this.res_username = res_username;
        this.res_uploadtime = res_uploadtime;
        this.res_indate = res_indate;
    }

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public String getRes_info() {
        return res_info;
    }

    public void setRes_info(String res_info) {
        this.res_info = res_info;
    }

    public String getRes_link() {
        return res_link;
    }

    public void setRes_link(String res_link) {
        this.res_link = res_link;
    }

    public String getRes_password() {
        return res_password;
    }

    public void setRes_password(String res_password) {
        this.res_password = res_password;
    }

    public String getNetwork_disk() {
        return network_disk;
    }

    public void setNetwork_disk(String network_disk) {
        this.network_disk = network_disk;
    }

    public String getRes_seed() {
        return res_seed;
    }

    public void setRes_seed(String res_seed) {
        this.res_seed = res_seed;
    }

    public String getRes_username() {
        return res_username;
    }

    public void setRes_username(String res_username) {
        this.res_username = res_username;
    }

    public Date getRes_uploadtime() {
        return res_uploadtime;
    }

    public void setRes_uploadtime(Date res_uploadtime) {
        this.res_uploadtime = res_uploadtime;
    }

    public int getRes_indate() {
        return res_indate;
    }

    public void setRes_indate(int res_indate) {
        this.res_indate = res_indate;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "record_id=" + record_id +
                ", res_name='" + res_name + '\'' +
                ", res_info='" + res_info + '\'' +
                ", res_link='" + res_link + '\'' +
                ", res_password='" + res_password + '\'' +
                ", network_disk='" + network_disk + '\'' +
                ", res_seed='" + res_seed + '\'' +
                ", res_username='" + res_username + '\'' +
                ", res_uploadtime=" + res_uploadtime +
                ", res_indate=" + res_indate +
                '}';
    }
}
