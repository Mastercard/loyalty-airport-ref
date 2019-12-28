/*
 * Loyalty Airport Experience API
 * The Loyalty Airport Lounge APIs offers cardholders, via their issuers, the ability to  access the Mastercard Airport Lounge service through this digital channel.  Cardholders can search for airport lounges, get airport lounge details,  access airport lounges via their personalized Digital Membership Card,  and access their lounge history. These APIs can be used to build a rich,  interactive airport experience within the issuer's existing mobile application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: project-ole@mastercard.flowdock.com
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
import com.mastercard.developer.loyalty_airport_client.model.LoungeVisitEntitlement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LoungeEntitlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class LoungeEntitlement {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_FREE_GUESTS_PER_EXPERIENCE = "freeGuestsPerExperience";
  @SerializedName(SERIALIZED_NAME_FREE_GUESTS_PER_EXPERIENCE)
  private Integer freeGuestsPerExperience;

  public static final String SERIALIZED_NAME_SHARED_MEMBER_GUEST_ALLOWANCE = "sharedMemberGuestAllowance";
  @SerializedName(SERIALIZED_NAME_SHARED_MEMBER_GUEST_ALLOWANCE)
  private Boolean sharedMemberGuestAllowance;

  public static final String SERIALIZED_NAME_MEMBER_ENTITLEMENTS = "memberEntitlements";
  @SerializedName(SERIALIZED_NAME_MEMBER_ENTITLEMENTS)
  private LoungeVisitEntitlement memberEntitlements = null;

  public static final String SERIALIZED_NAME_GUEST_ENTITLEMENTS = "guestEntitlements";
  @SerializedName(SERIALIZED_NAME_GUEST_ENTITLEMENTS)
  private LoungeVisitEntitlement guestEntitlements = null;

  public LoungeEntitlement category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Category of entitlement e.g Visit
   * @return category
  **/
  @ApiModelProperty(example = "VISIT", value = "Category of entitlement e.g Visit")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public LoungeEntitlement freeGuestsPerExperience(Integer freeGuestsPerExperience) {
    this.freeGuestsPerExperience = freeGuestsPerExperience;
    return this;
  }

   /**
   * Number of guests allowed per a free visit
   * @return freeGuestsPerExperience
  **/
  @ApiModelProperty(value = "Number of guests allowed per a free visit")
  public Integer getFreeGuestsPerExperience() {
    return freeGuestsPerExperience;
  }

  public void setFreeGuestsPerExperience(Integer freeGuestsPerExperience) {
    this.freeGuestsPerExperience = freeGuestsPerExperience;
  }

  public LoungeEntitlement sharedMemberGuestAllowance(Boolean sharedMemberGuestAllowance) {
    this.sharedMemberGuestAllowance = sharedMemberGuestAllowance;
    return this;
  }

   /**
   * Indicates whether the member and guest have shared allocation
   * @return sharedMemberGuestAllowance
  **/
  @ApiModelProperty(value = "Indicates whether the member and guest have shared allocation")
  public Boolean getSharedMemberGuestAllowance() {
    return sharedMemberGuestAllowance;
  }

  public void setSharedMemberGuestAllowance(Boolean sharedMemberGuestAllowance) {
    this.sharedMemberGuestAllowance = sharedMemberGuestAllowance;
  }

  public LoungeEntitlement memberEntitlements(LoungeVisitEntitlement memberEntitlements) {
    this.memberEntitlements = memberEntitlements;
    return this;
  }

   /**
   * Get memberEntitlements
   * @return memberEntitlements
  **/
  @ApiModelProperty(value = "")
  public LoungeVisitEntitlement getMemberEntitlements() {
    return memberEntitlements;
  }

  public void setMemberEntitlements(LoungeVisitEntitlement memberEntitlements) {
    this.memberEntitlements = memberEntitlements;
  }

  public LoungeEntitlement guestEntitlements(LoungeVisitEntitlement guestEntitlements) {
    this.guestEntitlements = guestEntitlements;
    return this;
  }

   /**
   * Get guestEntitlements
   * @return guestEntitlements
  **/
  @ApiModelProperty(value = "")
  public LoungeVisitEntitlement getGuestEntitlements() {
    return guestEntitlements;
  }

  public void setGuestEntitlements(LoungeVisitEntitlement guestEntitlements) {
    this.guestEntitlements = guestEntitlements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoungeEntitlement loungeEntitlement = (LoungeEntitlement) o;
    return Objects.equals(this.category, loungeEntitlement.category) &&
        Objects.equals(this.freeGuestsPerExperience, loungeEntitlement.freeGuestsPerExperience) &&
        Objects.equals(this.sharedMemberGuestAllowance, loungeEntitlement.sharedMemberGuestAllowance) &&
        Objects.equals(this.memberEntitlements, loungeEntitlement.memberEntitlements) &&
        Objects.equals(this.guestEntitlements, loungeEntitlement.guestEntitlements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, freeGuestsPerExperience, sharedMemberGuestAllowance, memberEntitlements, guestEntitlements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoungeEntitlement {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    freeGuestsPerExperience: ").append(toIndentedString(freeGuestsPerExperience)).append("\n");
    sb.append("    sharedMemberGuestAllowance: ").append(toIndentedString(sharedMemberGuestAllowance)).append("\n");
    sb.append("    memberEntitlements: ").append(toIndentedString(memberEntitlements)).append("\n");
    sb.append("    guestEntitlements: ").append(toIndentedString(guestEntitlements)).append("\n");
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
