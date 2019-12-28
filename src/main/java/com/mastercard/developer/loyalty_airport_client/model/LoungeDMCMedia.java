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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LoungeDMCMedia
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class LoungeDMCMedia {
  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public LoungeDMCMedia width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Lounge image width
   * @return width
  **/
  @ApiModelProperty(example = "60", value = "Lounge image width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public LoungeDMCMedia height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Lounge image height
   * @return height
  **/
  @ApiModelProperty(example = "60", value = "Lounge image height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public LoungeDMCMedia mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Lounge image mime type
   * @return mimeType
  **/
  @ApiModelProperty(example = "image/jpeg", value = "Lounge image mime type")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public LoungeDMCMedia url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Lounge image URL
   * @return url
  **/
  @ApiModelProperty(example = "http://example.url.com/...", value = "Lounge image URL")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LoungeDMCMedia description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Lounge image description
   * @return description
  **/
  @ApiModelProperty(example = "DMC", value = "Lounge image description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LoungeDMCMedia lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Date on which the image was last modified
   * @return lastModified
  **/
  @ApiModelProperty(example = "2011-08-18T00:00:00", value = "Date on which the image was last modified")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoungeDMCMedia loungeDMCMedia = (LoungeDMCMedia) o;
    return Objects.equals(this.width, loungeDMCMedia.width) &&
        Objects.equals(this.height, loungeDMCMedia.height) &&
        Objects.equals(this.mimeType, loungeDMCMedia.mimeType) &&
        Objects.equals(this.url, loungeDMCMedia.url) &&
        Objects.equals(this.description, loungeDMCMedia.description) &&
        Objects.equals(this.lastModified, loungeDMCMedia.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, mimeType, url, description, lastModified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoungeDMCMedia {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
