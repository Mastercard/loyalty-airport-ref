/*
 *  Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * 
 * Loyalty Airport Experience API
 * The Loyalty Airport Lounge APIs offers cardholders, via their issuers, the ability to  access the Mastercard Airport Lounge service through this digital channel.  Cardholders can search for airport lounges, get airport lounge details,  access airport lounges via their personalized Digital Membership Card,  and access their lounge history. These APIs can be used to build a rich,  interactive airport experience within the issuer's existing mobile application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



package com.mastercard.developer.loyalty_airport_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mastercard.developer.loyalty_airport_client.model.LoungeImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LoungeHistoryItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class LoungeHistoryItem {
  public static final String SERIALIZED_NAME_VISIT_DATE = "visitDate";
  @SerializedName(SERIALIZED_NAME_VISIT_DATE)
  private String visitDate;

  public static final String SERIALIZED_NAME_PROCESSED_DATE = "processedDate";
  @SerializedName(SERIALIZED_NAME_PROCESSED_DATE)
  private String processedDate;

  public static final String SERIALIZED_NAME_TOTAL_VISITORS = "totalVisitors";
  @SerializedName(SERIALIZED_NAME_TOTAL_VISITORS)
  private Integer totalVisitors;

  public static final String SERIALIZED_NAME_TOTAL_GUESTS = "totalGuests";
  @SerializedName(SERIALIZED_NAME_TOTAL_GUESTS)
  private Integer totalGuests;

  public static final String SERIALIZED_NAME_NON_MEMBER_CHARGE_COUNT = "nonMemberChargeCount";
  @SerializedName(SERIALIZED_NAME_NON_MEMBER_CHARGE_COUNT)
  private Integer nonMemberChargeCount;

  public static final String SERIALIZED_NAME_MEMBER_CHARGE_COUNT = "memberChargeCount";
  @SerializedName(SERIALIZED_NAME_MEMBER_CHARGE_COUNT)
  private Integer memberChargeCount;

  public static final String SERIALIZED_NAME_MEMBER_CHARGE_CURRENCY = "memberChargeCurrency";
  @SerializedName(SERIALIZED_NAME_MEMBER_CHARGE_CURRENCY)
  private String memberChargeCurrency;

  public static final String SERIALIZED_NAME_MEMBER_CHARGE_FEE = "memberChargeFee";
  @SerializedName(SERIALIZED_NAME_MEMBER_CHARGE_FEE)
  private Integer memberChargeFee;

  public static final String SERIALIZED_NAME_MEMBER_CHARGE_DECLINED = "memberChargeDeclined";
  @SerializedName(SERIALIZED_NAME_MEMBER_CHARGE_DECLINED)
  private Boolean memberChargeDeclined;

  public static final String SERIALIZED_NAME_LOUNGE_CODE = "loungeCode";
  @SerializedName(SERIALIZED_NAME_LOUNGE_CODE)
  private String loungeCode;

  public static final String SERIALIZED_NAME_LOUNGE_NAME = "loungeName";
  @SerializedName(SERIALIZED_NAME_LOUNGE_NAME)
  private String loungeName;

  public static final String SERIALIZED_NAME_AIRPORT_NAME = "airportName";
  @SerializedName(SERIALIZED_NAME_AIRPORT_NAME)
  private String airportName;

  public static final String SERIALIZED_NAME_AIRPORT_TERMINAL = "airportTerminal";
  @SerializedName(SERIALIZED_NAME_AIRPORT_TERMINAL)
  private String airportTerminal;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LOUNGE_IMAGE = "loungeImage";
  @SerializedName(SERIALIZED_NAME_LOUNGE_IMAGE)
  private LoungeImage loungeImage = null;

  public LoungeHistoryItem visitDate(String visitDate) {
    this.visitDate = visitDate;
    return this;
  }

   /**
   * Date on which the lounge visit occurred
   * @return visitDate
  **/
  @ApiModelProperty(example = "2016-08-18T00:00:00Z", value = "Date on which the lounge visit occurred")
  public String getVisitDate() {
    return visitDate;
  }

  public void setVisitDate(String visitDate) {
    this.visitDate = visitDate;
  }

  public LoungeHistoryItem processedDate(String processedDate) {
    this.processedDate = processedDate;
    return this;
  }

   /**
   * Date on which the lounge visit was procedded
   * @return processedDate
  **/
  @ApiModelProperty(example = "2016-08-18T00:00:00Z", value = "Date on which the lounge visit was procedded")
  public String getProcessedDate() {
    return processedDate;
  }

  public void setProcessedDate(String processedDate) {
    this.processedDate = processedDate;
  }

  public LoungeHistoryItem totalVisitors(Integer totalVisitors) {
    this.totalVisitors = totalVisitors;
    return this;
  }

   /**
   * Total number of people that visited the lounge
   * @return totalVisitors
  **/
  @ApiModelProperty(example = "2", value = "Total number of people that visited the lounge")
  public Integer getTotalVisitors() {
    return totalVisitors;
  }

  public void setTotalVisitors(Integer totalVisitors) {
    this.totalVisitors = totalVisitors;
  }

  public LoungeHistoryItem totalGuests(Integer totalGuests) {
    this.totalGuests = totalGuests;
    return this;
  }

   /**
   * Total number of guests that visited the lounge, other than the digital membership card holder
   * @return totalGuests
  **/
  @ApiModelProperty(example = "2", value = "Total number of guests that visited the lounge, other than the digital membership card holder")
  public Integer getTotalGuests() {
    return totalGuests;
  }

  public void setTotalGuests(Integer totalGuests) {
    this.totalGuests = totalGuests;
  }

  public LoungeHistoryItem nonMemberChargeCount(Integer nonMemberChargeCount) {
    this.nonMemberChargeCount = nonMemberChargeCount;
    return this;
  }

   /**
   * Total number of visitors that the cardholder was not charged for
   * @return nonMemberChargeCount
  **/
  @ApiModelProperty(example = "0", value = "Total number of visitors that the cardholder was not charged for")
  public Integer getNonMemberChargeCount() {
    return nonMemberChargeCount;
  }

  public void setNonMemberChargeCount(Integer nonMemberChargeCount) {
    this.nonMemberChargeCount = nonMemberChargeCount;
  }

  public LoungeHistoryItem memberChargeCount(Integer memberChargeCount) {
    this.memberChargeCount = memberChargeCount;
    return this;
  }

   /**
   * Total number of visitors the cardholder was charged for
   * @return memberChargeCount
  **/
  @ApiModelProperty(example = "0", value = "Total number of visitors the cardholder was charged for")
  public Integer getMemberChargeCount() {
    return memberChargeCount;
  }

  public void setMemberChargeCount(Integer memberChargeCount) {
    this.memberChargeCount = memberChargeCount;
  }

  public LoungeHistoryItem memberChargeCurrency(String memberChargeCurrency) {
    this.memberChargeCurrency = memberChargeCurrency;
    return this;
  }

   /**
   * 3 character ISO currency code
   * @return memberChargeCurrency
  **/
  @ApiModelProperty(example = "BRL", value = "3 character ISO currency code")
  public String getMemberChargeCurrency() {
    return memberChargeCurrency;
  }

  public void setMemberChargeCurrency(String memberChargeCurrency) {
    this.memberChargeCurrency = memberChargeCurrency;
  }

  public LoungeHistoryItem memberChargeFee(Integer memberChargeFee) {
    this.memberChargeFee = memberChargeFee;
    return this;
  }

   /**
   * The fee charged to the cardholder, if applicable
   * @return memberChargeFee
  **/
  @ApiModelProperty(example = "0", value = "The fee charged to the cardholder, if applicable")
  public Integer getMemberChargeFee() {
    return memberChargeFee;
  }

  public void setMemberChargeFee(Integer memberChargeFee) {
    this.memberChargeFee = memberChargeFee;
  }

  public LoungeHistoryItem memberChargeDeclined(Boolean memberChargeDeclined) {
    this.memberChargeDeclined = memberChargeDeclined;
    return this;
  }

   /**
   * True if the cardholder was required to pay a fee, but declined the charge
   * @return memberChargeDeclined
  **/
  @ApiModelProperty(example = "false", value = "True if the cardholder was required to pay a fee, but declined the charge")
  public Boolean getMemberChargeDeclined() {
    return memberChargeDeclined;
  }

  public void setMemberChargeDeclined(Boolean memberChargeDeclined) {
    this.memberChargeDeclined = memberChargeDeclined;
  }

  public LoungeHistoryItem loungeCode(String loungeCode) {
    this.loungeCode = loungeCode;
    return this;
  }

   /**
   * Airport lounge code
   * @return loungeCode
  **/
  @ApiModelProperty(example = "LGW1", value = "Airport lounge code")
  public String getLoungeCode() {
    return loungeCode;
  }

  public void setLoungeCode(String loungeCode) {
    this.loungeCode = loungeCode;
  }

  public LoungeHistoryItem loungeName(String loungeName) {
    this.loungeName = loungeName;
    return this;
  }

   /**
   * Airport lounge name
   * @return loungeName
  **/
  @ApiModelProperty(example = "No1 Lounge, Gatwick", value = "Airport lounge name")
  public String getLoungeName() {
    return loungeName;
  }

  public void setLoungeName(String loungeName) {
    this.loungeName = loungeName;
  }

  public LoungeHistoryItem airportName(String airportName) {
    this.airportName = airportName;
    return this;
  }

   /**
   * Airport name
   * @return airportName
  **/
  @ApiModelProperty(example = "London Gatwick", value = "Airport name")
  public String getAirportName() {
    return airportName;
  }

  public void setAirportName(String airportName) {
    this.airportName = airportName;
  }

  public LoungeHistoryItem airportTerminal(String airportTerminal) {
    this.airportTerminal = airportTerminal;
    return this;
  }

   /**
   * Airport terminal name
   * @return airportTerminal
  **/
  @ApiModelProperty(example = "3", value = "Airport terminal name")
  public String getAirportTerminal() {
    return airportTerminal;
  }

  public void setAirportTerminal(String airportTerminal) {
    this.airportTerminal = airportTerminal;
  }

  public LoungeHistoryItem city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "London", value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LoungeHistoryItem country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @ApiModelProperty(example = "United Kingdom", value = "Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LoungeHistoryItem loungeImage(LoungeImage loungeImage) {
    this.loungeImage = loungeImage;
    return this;
  }

   /**
   * Get loungeImage
   * @return loungeImage
  **/
  @ApiModelProperty(value = "")
  public LoungeImage getLoungeImage() {
    return loungeImage;
  }

  public void setLoungeImage(LoungeImage loungeImage) {
    this.loungeImage = loungeImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoungeHistoryItem loungeHistoryItem = (LoungeHistoryItem) o;
    return Objects.equals(this.visitDate, loungeHistoryItem.visitDate) &&
        Objects.equals(this.processedDate, loungeHistoryItem.processedDate) &&
        Objects.equals(this.totalVisitors, loungeHistoryItem.totalVisitors) &&
        Objects.equals(this.totalGuests, loungeHistoryItem.totalGuests) &&
        Objects.equals(this.nonMemberChargeCount, loungeHistoryItem.nonMemberChargeCount) &&
        Objects.equals(this.memberChargeCount, loungeHistoryItem.memberChargeCount) &&
        Objects.equals(this.memberChargeCurrency, loungeHistoryItem.memberChargeCurrency) &&
        Objects.equals(this.memberChargeFee, loungeHistoryItem.memberChargeFee) &&
        Objects.equals(this.memberChargeDeclined, loungeHistoryItem.memberChargeDeclined) &&
        Objects.equals(this.loungeCode, loungeHistoryItem.loungeCode) &&
        Objects.equals(this.loungeName, loungeHistoryItem.loungeName) &&
        Objects.equals(this.airportName, loungeHistoryItem.airportName) &&
        Objects.equals(this.airportTerminal, loungeHistoryItem.airportTerminal) &&
        Objects.equals(this.city, loungeHistoryItem.city) &&
        Objects.equals(this.country, loungeHistoryItem.country) &&
        Objects.equals(this.loungeImage, loungeHistoryItem.loungeImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitDate, processedDate, totalVisitors, totalGuests, nonMemberChargeCount, memberChargeCount, memberChargeCurrency, memberChargeFee, memberChargeDeclined, loungeCode, loungeName, airportName, airportTerminal, city, country, loungeImage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoungeHistoryItem {\n");
    
    sb.append("    visitDate: ").append(toIndentedString(visitDate)).append("\n");
    sb.append("    processedDate: ").append(toIndentedString(processedDate)).append("\n");
    sb.append("    totalVisitors: ").append(toIndentedString(totalVisitors)).append("\n");
    sb.append("    totalGuests: ").append(toIndentedString(totalGuests)).append("\n");
    sb.append("    nonMemberChargeCount: ").append(toIndentedString(nonMemberChargeCount)).append("\n");
    sb.append("    memberChargeCount: ").append(toIndentedString(memberChargeCount)).append("\n");
    sb.append("    memberChargeCurrency: ").append(toIndentedString(memberChargeCurrency)).append("\n");
    sb.append("    memberChargeFee: ").append(toIndentedString(memberChargeFee)).append("\n");
    sb.append("    memberChargeDeclined: ").append(toIndentedString(memberChargeDeclined)).append("\n");
    sb.append("    loungeCode: ").append(toIndentedString(loungeCode)).append("\n");
    sb.append("    loungeName: ").append(toIndentedString(loungeName)).append("\n");
    sb.append("    airportName: ").append(toIndentedString(airportName)).append("\n");
    sb.append("    airportTerminal: ").append(toIndentedString(airportTerminal)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    loungeImage: ").append(toIndentedString(loungeImage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

