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
 * Im
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class Im {
  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Im display(String display) {
    this.display = display;
    return this;
  }

   /**
   * User-name Skype/gtalk/yahoo detail
   * @return display
  **/
  @ApiModelProperty(example = "user Yahoo-id", value = "User-name Skype/gtalk/yahoo detail")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Im operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public Im primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * A Boolean value indicating the &#39;primary&#39; or preferred messenger, The primary attribute value &#39;true&#39; must appear no more than once.
   * @return primary
  **/
  @ApiModelProperty(example = "true", value = "A Boolean value indicating the 'primary' or preferred messenger, The primary attribute value 'true' must appear no more than once.")
  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public Im type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A label indicating the attribute&#39;s function, Accepted values include: [aim, gtalk, icq, xmpp, msn, skype, qq, yahoo]
   * @return type
  **/
  @ApiModelProperty(example = "aim", value = "A label indicating the attribute's function, Accepted values include: [aim, gtalk, icq, xmpp, msn, skype, qq, yahoo]")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Im value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Instant messaging addresses for the User
   * @return value
  **/
  @ApiModelProperty(example = "patrickStar123", value = "Instant messaging addresses for the User")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Im im = (Im) o;
    return Objects.equals(this.display, im.display) &&
        Objects.equals(this.operation, im.operation) &&
        Objects.equals(this.primary, im.primary) &&
        Objects.equals(this.type, im.type) &&
        Objects.equals(this.value, im.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, operation, primary, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Im {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

