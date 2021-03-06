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
import com.mastercard.developer.loyalty_airport_client.model.Account;
import com.mastercard.developer.loyalty_airport_client.model.Consent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class UserProduct {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_CONSENTS = "consents";
  @SerializedName(SERIALIZED_NAME_CONSENTS)
  private List<Consent> consents = null;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<Account> accounts = null;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Object object = null;

  public UserProduct product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(example = "benefits, wifi, rewards, offers, airport", required = true, value = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public UserProduct consents(List<Consent> consents) {
    this.consents = consents;
    return this;
  }

  public UserProduct addConsentsItem(Consent consentsItem) {
    if (this.consents == null) {
      this.consents = new ArrayList<Consent>();
    }
    this.consents.add(consentsItem);
    return this;
  }

   /**
   * Get consents
   * @return consents
  **/
  @ApiModelProperty(value = "")
  public List<Consent> getConsents() {
    return consents;
  }

  public void setConsents(List<Consent> consents) {
    this.consents = consents;
  }

  public UserProduct accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public UserProduct addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<Account>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public UserProduct object(Object object) {
    this.object = object;
    return this;
  }

   /**
   * Extended user object (with localized metadata) for the given product of the requested user.  See Developer Portal (https://developer.mastercard.com/documentation/product-bundle-registration/v1) for additional documentation of the product-specific fields.
   * @return object
  **/
  @ApiModelProperty(example = "{\"username\":\"boingoid123\",\"password\":\"boingopwd\"}", value = "Extended user object (with localized metadata) for the given product of the requested user.  See Developer Portal (https://developer.mastercard.com/documentation/product-bundle-registration/v1) for additional documentation of the product-specific fields.")
  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProduct userProduct = (UserProduct) o;
    return Objects.equals(this.product, userProduct.product) &&
        Objects.equals(this.consents, userProduct.consents) &&
        Objects.equals(this.accounts, userProduct.accounts) &&
        Objects.equals(this.object, userProduct.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, consents, accounts, object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProduct {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    consents: ").append(toIndentedString(consents)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

