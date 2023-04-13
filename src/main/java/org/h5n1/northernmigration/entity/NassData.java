package org.h5n1.northernmigration.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nass_data")
public class NassData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("unit_desc")
    private String unitDesc;

    @JsonProperty("Value")
    private String value;

    @JsonProperty("agg_level_desc")
    private String aggLevelDesc;

    @JsonProperty("county_name")
    private String countyName;

    @JsonProperty("state_fips_code")
    private String stateFipsCode;

    @JsonProperty("domaincat_desc")
    private String domaincatDesc;

    @JsonProperty("domain_desc")
    private String domainDesc;

    @JsonProperty("state_ansi")
    private String stateAnsi;

    @JsonProperty("freq_desc")
    private String freqDesc;

    @JsonProperty("prodn_practice_desc")
    private String prodnPracticeDesc;

    @JsonProperty("sector_desc")
    private String sectorDesc;

    @JsonProperty("location_desc")
    private String locationDesc;

    @JsonProperty("region_desc")
    private String regionDesc;

    @JsonProperty("util_practice_desc")
    private String utilPracticeDesc;

    @JsonProperty("statisticcat_desc")
    private String statisticcatDesc;

    @JsonProperty("class_desc")
    private String classDesc;

    @JsonProperty("load_time")
    private String loadTime;

    @JsonProperty("source_desc")
    private String sourceDesc;

    @JsonProperty("zip_5")
    private String zip_5;

    @JsonProperty("county_ansi")
    private String countyAnsi;

    @JsonProperty("year")
    private String year;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("county_code")
    private String countyCode;

    @JsonProperty("CV (%)")
    private String cvPercent;

    @JsonProperty("asd_desc")
    private String asdDesc;

    @JsonProperty("asd_code")
    private String asdCode;

    @JsonProperty("week_ending")
    private String weekEnding;

    @JsonProperty("state_name")
    private String stateName;

    @JsonProperty("end_code")
    private String endCode;

    @JsonProperty("short_desc")
    private String shortDesc;

    @JsonProperty("begin_code")
    private String beginCode;

    @JsonProperty("state_alpha")
    private String stateAlpha;

    @JsonProperty("congr_district_code")
    private String congrDistrictCode;

    @JsonProperty("reference_period_desc")
    private String referencePeriodDesc;

    @JsonProperty("country_name")
    private String countryName;

    @JsonProperty("watershed_desc")
    private String watershedDesc;

    @JsonProperty("group_desc")
    private String groupDesc;

    @JsonProperty("commodity_desc")
    private String commodityDesc;

    @JsonProperty("watershed_code")
    private String watershedCode;
    public NassData() {
    }

    public NassData(Long id, String unitDesc, String value, String aggLevelDesc, String countyName, String stateFipsCode, String domaincatDesc,
                    String domainDesc, String stateAnsi, String freqDesc, String prodnPracticeDesc, String sectorDesc, String locationDesc,
                    String regionDesc, String utilPracticeDesc, String statisticcatDesc, String classDesc, String loadTime, String sourceDesc,
                    String zip_5, String countyAnsi, String year, String countryCode, String countyCode, String cvPercent, String asdDesc,
                    String asdCode, String weekEnding, String stateName, String endCode, String shortDesc, String beginCode, String stateAlpha,
                    String congrDistrictCode, String referencePeriodDesc, String countryName, String watershedDesc, String groupDesc,
                    String commodityDesc, String watershedCode) {
        this.id = id;
        this.unitDesc = unitDesc;
        this.value = value;
        this.aggLevelDesc = aggLevelDesc;
        this.countyName = countyName;
        this.stateFipsCode = stateFipsCode;
        this.domaincatDesc = domaincatDesc;
        this.domainDesc = domainDesc;
        this.stateAnsi = stateAnsi;
        this.freqDesc = freqDesc;
        this.prodnPracticeDesc = prodnPracticeDesc;
        this.sectorDesc = sectorDesc;
        this.locationDesc = locationDesc;
        this.regionDesc = regionDesc;
        this.utilPracticeDesc = utilPracticeDesc;
        this.statisticcatDesc = statisticcatDesc;
        this.classDesc = classDesc;
        this.loadTime = loadTime;
        this.sourceDesc = sourceDesc;
        this.zip_5 = zip_5;
        this.countyAnsi = countyAnsi;
        this.year = year;
        this.countryCode = countryCode;
        this.countyCode = countyCode;
        this.cvPercent = cvPercent;
        this.asdDesc = asdDesc;
        this.asdCode = asdCode;
        this.weekEnding = weekEnding;
        this.stateName = stateName;
        this.endCode = endCode;
        this.shortDesc = shortDesc;
        this.beginCode = beginCode;
        this.stateAlpha = stateAlpha;
        this.congrDistrictCode = congrDistrictCode;
        this.referencePeriodDesc = referencePeriodDesc;
        this.countryName = countryName;
        this.watershedDesc = watershedDesc;
        this.groupDesc = groupDesc;
        this.commodityDesc = commodityDesc;
        this.watershedCode = watershedCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitDesc() {
        return unitDesc;
    }

    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAggLevelDesc() {
        return aggLevelDesc;
    }

    public void setAggLevelDesc(String aggLevelDesc) {
        this.aggLevelDesc = aggLevelDesc;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getStateFipsCode() {
        return stateFipsCode;
    }

    public void setStateFipsCode(String stateFipsCode) {
        this.stateFipsCode = stateFipsCode;
    }

    public String getDomaincatDesc() {
        return domaincatDesc;
    }

    public void setDomaincatDesc(String domaincatDesc) {
        this.domaincatDesc = domaincatDesc;
    }

    public String getDomainDesc() {
        return domainDesc;
    }

    public void setDomainDesc(String domainDesc) {
        this.domainDesc = domainDesc;
    }

    public String getStateAnsi() {
        return stateAnsi;
    }

    public void setStateAnsi(String stateAnsi) {
        this.stateAnsi = stateAnsi;
    }

    public String getFreqDesc() {
        return freqDesc;
    }

    public void setFreqDesc(String freqDesc) {
        this.freqDesc = freqDesc;
    }

    public String getProdnPracticeDesc() {
        return prodnPracticeDesc;
    }

    public void setProdnPracticeDesc(String prodnPracticeDesc) {
        this.prodnPracticeDesc = prodnPracticeDesc;
    }

    public String getSectorDesc() {
        return sectorDesc;
    }

    public void setSectorDesc(String sectorDesc) {
        this.sectorDesc = sectorDesc;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public String getRegionDesc() {
        return regionDesc;
    }

    public void setRegionDesc(String regionDesc) {
        this.regionDesc = regionDesc;
    }

    public String getUtilPracticeDesc() {
        return utilPracticeDesc;
    }

    public void setUtilPracticeDesc(String utilPracticeDesc) {
        this.utilPracticeDesc = utilPracticeDesc;
    }

    public String getStatisticcatDesc() {
        return statisticcatDesc;
    }

    public void setStatisticcatDesc(String statisticcatDesc) {
        this.statisticcatDesc = statisticcatDesc;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public String getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(String loadTime) {
        this.loadTime = loadTime;
    }

    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    public String getZip_5() {
        return zip_5;
    }

    public void setZip_5(String zip_5) {
        this.zip_5 = zip_5;
    }

    public String getCountyAnsi() {
        return countyAnsi;
    }

    public void setCountyAnsi(String countyAnsi) {
        this.countyAnsi = countyAnsi;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCvPercent() {
        return cvPercent;
    }

    public void setCvPercent(String cvPercent) {
        this.cvPercent = cvPercent;
    }

    public String getAsdDesc() {
        return asdDesc;
    }

    public void setAsdDesc(String asdDesc) {
        this.asdDesc = asdDesc;
    }

    public String getAsdCode() {
        return asdCode;
    }

    public void setAsdCode(String asdCode) {
        this.asdCode = asdCode;
    }

    public String getWeekEnding() {
        return weekEnding;
    }

    public void setWeekEnding(String weekEnding) {
        this.weekEnding = weekEnding;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getEndCode() {
        return endCode;
    }

    public void setEndCode(String endCode) {
        this.endCode = endCode;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getBeginCode() {
        return beginCode;
    }

    public void setBeginCode(String beginCode) {
        this.beginCode = beginCode;
    }

    public String getStateAlpha() {
        return stateAlpha;
    }

    public void setStateAlpha(String stateAlpha) {
        this.stateAlpha = stateAlpha;
    }

    public String getCongrDistrictCode() {
        return congrDistrictCode;
    }

    public void setCongrDistrictCode(String congrDistrictCode) {
        this.congrDistrictCode = congrDistrictCode;
    }

    public String getReferencePeriodDesc() {
        return referencePeriodDesc;
    }

    public void setReferencePeriodDesc(String referencePeriodDesc) {
        this.referencePeriodDesc = referencePeriodDesc;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWatershedDesc() {
        return watershedDesc;
    }

    public void setWatershedDesc(String watershedDesc) {
        this.watershedDesc = watershedDesc;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    public String getWatershedCode() {
        return watershedCode;
    }

    public void setWatershedCode(String watershedCode) {
        this.watershedCode = watershedCode;
    }

    @Override
    public String toString() {
        return "NassData{" +
                "id=" + id +
                ", unitDesc='" + unitDesc + '\'' +
                ", value='" + value + '\'' +
                ", aggLevelDesc='" + aggLevelDesc + '\'' +
                ", countyName='" + countyName + '\'' +
                ", stateFipsCode='" + stateFipsCode + '\'' +
                ", domaincatDesc='" + domaincatDesc + '\'' +
                ", domainDesc='" + domainDesc + '\'' +
                ", stateAnsi='" + stateAnsi + '\'' +
                ", freqDesc='" + freqDesc + '\'' +
                ", prodnPracticeDesc='" + prodnPracticeDesc + '\'' +
                ", sectorDesc='" + sectorDesc + '\'' +
                ", locationDesc='" + locationDesc + '\'' +
                ", regionDesc='" + regionDesc + '\'' +
                ", utilPracticeDesc='" + utilPracticeDesc + '\'' +
                ", statisticcatDesc='" + statisticcatDesc + '\'' +
                ", classDesc='" + classDesc + '\'' +
                ", loadTime='" + loadTime + '\'' +
                ", sourceDesc='" + sourceDesc + '\'' +
                ", zip_5='" + zip_5 + '\'' +
                ", countyAnsi='" + countyAnsi + '\'' +
                ", year='" + year + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countyCode='" + countyCode + '\'' +
                ", cvPercent='" + cvPercent + '\'' +
                ", asdDesc='" + asdDesc + '\'' +
                ", asdCode='" + asdCode + '\'' +
                ", weekEnding='" + weekEnding + '\'' +
                ", stateName='" + stateName + '\'' +
                ", endCode='" + endCode + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", beginCode='" + beginCode + '\'' +
                ", stateAlpha='" + stateAlpha + '\'' +
                ", congrDistrictCode='" + congrDistrictCode + '\'' +
                ", referencePeriodDesc='" + referencePeriodDesc + '\'' +
                ", countryName='" + countryName + '\'' +
                ", watershedDesc='" + watershedDesc + '\'' +
                ", groupDesc='" + groupDesc + '\'' +
                ", commodityDesc='" + commodityDesc + '\'' +
                ", watershedCode='" + watershedCode + '\'' +
                '}';
    }
}
