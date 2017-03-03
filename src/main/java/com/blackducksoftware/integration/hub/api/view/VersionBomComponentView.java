/**
 * Hub Common
 *
 * Copyright (C) 2017 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.blackducksoftware.integration.hub.api.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.blackducksoftware.integration.hub.model.view.HubView;
import com.google.gson.annotations.SerializedName;

/**
 * VersionBomComponentView
 */
public class VersionBomComponentView extends HubView {
    @SerializedName("activityData")
    private ActivityDataView activityData = null;

    @SerializedName("activityRiskProfile")
    private RiskProfileView activityRiskProfile = null;

    @SerializedName("component")
    private String component = null;

    @SerializedName("componentName")
    private String componentName = null;

    @SerializedName("componentVersion")
    private String componentVersion = null;

    @SerializedName("componentVersionName")
    private String componentVersionName = null;

    @SerializedName("licenseRiskProfile")
    private RiskProfileView licenseRiskProfile = null;

    @SerializedName("licenses")
    private List<VersionBomLicenseView> licenses = new ArrayList<VersionBomLicenseView>();

    @SerializedName("operationalRiskProfile")
    private RiskProfileView operationalRiskProfile = null;

    @SerializedName("releasedOn")
    private Date releasedOn = null;

    @SerializedName("securityRiskProfile")
    private RiskProfileView securityRiskProfile = null;

    @SerializedName("usages")
    private List<UsageEnum> usages = new ArrayList<UsageEnum>();

    @SerializedName("versionRiskProfile")
    private RiskProfileView versionRiskProfile = null;

    public VersionBomComponentView activityData(final ActivityDataView activityData) {
        this.activityData = activityData;
        return this;
    }

    /**
     * Description of development activity on the component
     * 
     * @return activityData
     **/
    public ActivityDataView getActivityData() {
        return activityData;
    }

    public void setActivityData(final ActivityDataView activityData) {
        this.activityData = activityData;
    }

    public VersionBomComponentView activityRiskProfile(final RiskProfileView activityRiskProfile) {
        this.activityRiskProfile = activityRiskProfile;
        return this;
    }

    /**
     * Risk levels associated with activity aspects of the component
     * 
     * @return activityRiskProfile
     **/
    public RiskProfileView getActivityRiskProfile() {
        return activityRiskProfile;
    }

    public void setActivityRiskProfile(final RiskProfileView activityRiskProfile) {
        this.activityRiskProfile = activityRiskProfile;
    }

    public VersionBomComponentView component(final String component) {
        this.component = component;
        return this;
    }

    /**
     * Reference to the representation of the component
     * 
     * @return component
     **/
    public String getComponent() {
        return component;
    }

    public void setComponent(final String component) {
        this.component = component;
    }

    public VersionBomComponentView componentName(final String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * Label distinguishing the component from other components
     * 
     * @return componentName
     **/
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(final String componentName) {
        this.componentName = componentName;
    }

    public VersionBomComponentView componentVersion(final String componentVersion) {
        this.componentVersion = componentVersion;
        return this;
    }

    /**
     * Reference to the representation of the component version
     * 
     * @return componentVersion
     **/
    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(final String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public VersionBomComponentView componentVersionName(final String componentVersionName) {
        this.componentVersionName = componentVersionName;
        return this;
    }

    /**
     * Label distinguishing the version from other versions of the component
     * 
     * @return componentVersionName
     **/
    public String getComponentVersionName() {
        return componentVersionName;
    }

    public void setComponentVersionName(final String componentVersionName) {
        this.componentVersionName = componentVersionName;
    }

    public VersionBomComponentView licenseRiskProfile(final RiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
        return this;
    }

    /**
     * Risk levels associated with licensing aspects of the component
     * 
     * @return licenseRiskProfile
     **/
    public RiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(final RiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public VersionBomComponentView licenses(final List<VersionBomLicenseView> licenses) {
        this.licenses = licenses;
        return this;
    }

    public VersionBomComponentView addLicensesItem(final VersionBomLicenseView licensesItem) {
        this.licenses.add(licensesItem);
        return this;
    }

    /**
     * Any license(s) associated with the component's use in the project
     * 
     * @return licenses
     **/
    public List<VersionBomLicenseView> getLicenses() {
        return licenses;
    }

    public void setLicenses(final List<VersionBomLicenseView> licenses) {
        this.licenses = licenses;
    }

    public VersionBomComponentView operationalRiskProfile(final RiskProfileView operationalRiskProfile) {
        this.operationalRiskProfile = operationalRiskProfile;
        return this;
    }

    /**
     * Risk levels associated with operational aspects of the component
     * 
     * @return operationalRiskProfile
     **/
    public RiskProfileView getOperationalRiskProfile() {
        return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(final RiskProfileView operationalRiskProfile) {
        this.operationalRiskProfile = operationalRiskProfile;
    }

    public VersionBomComponentView releasedOn(final Date releasedOn) {
        this.releasedOn = releasedOn;
        return this;
    }

    /**
     * The date the component was made available for use
     * 
     * @return releasedOn
     **/
    public Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(final Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public VersionBomComponentView securityRiskProfile(final RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
        return this;
    }

    /**
     * Risk levels associated with security aspects of the component
     * 
     * @return securityRiskProfile
     **/
    public RiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(final RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public VersionBomComponentView usages(final List<UsageEnum> usages) {
        this.usages = usages;
        return this;
    }

    public VersionBomComponentView addUsagesItem(final UsageEnum usagesItem) {
        this.usages.add(usagesItem);
        return this;
    }

    /**
     * The usage(s) of the component within the project
     * 
     * @return usages
     **/
    public List<UsageEnum> getUsages() {
        return usages;
    }

    public void setUsages(final List<UsageEnum> usages) {
        this.usages = usages;
    }

    public VersionBomComponentView versionRiskProfile(final RiskProfileView versionRiskProfile) {
        this.versionRiskProfile = versionRiskProfile;
        return this;
    }

    /**
     * Risk levels associated with versioning aspects of the component
     * 
     * @return versionRiskProfile
     **/

    public RiskProfileView getVersionRiskProfile() {
        return versionRiskProfile;
    }

    public void setVersionRiskProfile(final RiskProfileView versionRiskProfile) {
        this.versionRiskProfile = versionRiskProfile;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}