package com.magaofei.tool.dao;

import java.util.Date;

/**
 * 项目
 * @author mark
 */

public class Project {

    private int id;
    private String name;
    private String email;
    private String dingtalkUrl;
    private String remark;
    private String host;
    private String proxy;
    private int environment;
    private Date gmtCreate;
    private Date gmtModified;
    private int deleted;

    public Project() {
    }


    Project(String name, String email, String dingtalkUrl, String remark, String host, String proxy, int environment, Date gmtModified) {

        if (gmtModified == null) {
            this.gmtModified = new Date();
        }
        this.name = name;
        this.email = email;
        this.dingtalkUrl = dingtalkUrl;
        this.remark = remark;
        this.host = host;
        this.proxy = proxy;
        this.environment = environment;
        this.gmtCreate = new Date();
        this.gmtModified = gmtModified;

    }

    @Override
    public String toString() {
        return getName() + getEmail() + getHost() + getGmtModified();
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDingtalkUrl() {
        return dingtalkUrl;
    }

    public void setDingtalkUrl(String dingtalkUrl) {
        this.dingtalkUrl = dingtalkUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public int getEnvironment() {
        return environment;
    }

    public void setEnvironment(int environment) {
        this.environment = environment;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}