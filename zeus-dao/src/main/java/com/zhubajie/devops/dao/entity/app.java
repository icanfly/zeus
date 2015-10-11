package com.zhubajie.devops.dao.entity;

import java.util.Date;

public class app {
    private Long appId;

    private String appName;

    private String scmUrl;

    private String scmType;

    private String pkgName;

    private String compileStyle;

    private Date rawAddTime;

    private Date rawUpdateTime;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getScmUrl() {
        return scmUrl;
    }

    public void setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl == null ? null : scmUrl.trim();
    }

    public String getScmType() {
        return scmType;
    }

    public void setScmType(String scmType) {
        this.scmType = scmType == null ? null : scmType.trim();
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName == null ? null : pkgName.trim();
    }

    public String getCompileStyle() {
        return compileStyle;
    }

    public void setCompileStyle(String compileStyle) {
        this.compileStyle = compileStyle == null ? null : compileStyle.trim();
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}