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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LoungeVisitEntitlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class LoungeVisitEntitlement {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LIMITEDENTITLEMENTS("LimitedEntitlements"),
    
    UNLIMITEDENTITLEMENTS("UnlimitedEntitlements"),
    
    NOENTITLEMENTS("NoEntitlements");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Integer used;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Integer pending;

  public static final String SERIALIZED_NAME_REMAINING = "remaining";
  @SerializedName(SERIALIZED_NAME_REMAINING)
  private Integer remaining;

  public static final String SERIALIZED_NAME_CHARGE_FEE = "chargeFee";
  @SerializedName(SERIALIZED_NAME_CHARGE_FEE)
  private Integer chargeFee;

  public static final String SERIALIZED_NAME_CHARGE_CURRENCY = "chargeCurrency";
  @SerializedName(SERIALIZED_NAME_CHARGE_CURRENCY)
  private String chargeCurrency;

  public LoungeVisitEntitlement type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public LoungeVisitEntitlement total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total entitlements
   * @return total
  **/
  @ApiModelProperty(value = "Total entitlements")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public LoungeVisitEntitlement used(Integer used) {
    this.used = used;
    return this;
  }

   /**
   * Entitlements used
   * @return used
  **/
  @ApiModelProperty(value = "Entitlements used")
  public Integer getUsed() {
    return used;
  }

  public void setUsed(Integer used) {
    this.used = used;
  }

  public LoungeVisitEntitlement pending(Integer pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Entitlements pending (before being processed)
   * @return pending
  **/
  @ApiModelProperty(value = "Entitlements pending (before being processed)")
  public Integer getPending() {
    return pending;
  }

  public void setPending(Integer pending) {
    this.pending = pending;
  }

  public LoungeVisitEntitlement remaining(Integer remaining) {
    this.remaining = remaining;
    return this;
  }

   /**
   * Entitlements remaining
   * @return remaining
  **/
  @ApiModelProperty(value = "Entitlements remaining")
  public Integer getRemaining() {
    return remaining;
  }

  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }

  public LoungeVisitEntitlement chargeFee(Integer chargeFee) {
    this.chargeFee = chargeFee;
    return this;
  }

   /**
   * Fee required (if any)
   * @return chargeFee
  **/
  @ApiModelProperty(value = "Fee required (if any)")
  public Integer getChargeFee() {
    return chargeFee;
  }

  public void setChargeFee(Integer chargeFee) {
    this.chargeFee = chargeFee;
  }

  public LoungeVisitEntitlement chargeCurrency(String chargeCurrency) {
    this.chargeCurrency = chargeCurrency;
    return this;
  }

   /**
   * 3 digit ISO currency code
   * @return chargeCurrency
  **/
  @ApiModelProperty(value = "3 digit ISO currency code")
  public String getChargeCurrency() {
    return chargeCurrency;
  }

  public void setChargeCurrency(String chargeCurrency) {
    this.chargeCurrency = chargeCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoungeVisitEntitlement loungeVisitEntitlement = (LoungeVisitEntitlement) o;
    return Objects.equals(this.type, loungeVisitEntitlement.type) &&
        Objects.equals(this.total, loungeVisitEntitlement.total) &&
        Objects.equals(this.used, loungeVisitEntitlement.used) &&
        Objects.equals(this.pending, loungeVisitEntitlement.pending) &&
        Objects.equals(this.remaining, loungeVisitEntitlement.remaining) &&
        Objects.equals(this.chargeFee, loungeVisitEntitlement.chargeFee) &&
        Objects.equals(this.chargeCurrency, loungeVisitEntitlement.chargeCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, total, used, pending, remaining, chargeFee, chargeCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoungeVisitEntitlement {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    chargeFee: ").append(toIndentedString(chargeFee)).append("\n");
    sb.append("    chargeCurrency: ").append(toIndentedString(chargeCurrency)).append("\n");
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

