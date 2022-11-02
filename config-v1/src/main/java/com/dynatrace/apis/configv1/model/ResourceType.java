/*
 * Dynatrace Configuration API
 * Documentation of the Dynatrace Configuration API. To read about use-cases and examples, see [Dynatrace Documentation](https://dt-url.net/4u43kxw).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.configv1.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A rule for the resource type.
 */
@ApiModel(description = "A rule for the resource type.")
@JsonPropertyOrder({
  ResourceType.JSON_PROPERTY_REGULAR_EXPRESSION,
  ResourceType.JSON_PROPERTY_PRIMARY_RESOURCE_TYPE,
  ResourceType.JSON_PROPERTY_SECONDARY_RESOURCE_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ResourceType {
  public static final String JSON_PROPERTY_REGULAR_EXPRESSION = "regularExpression";
  private String regularExpression;

  /**
   * The primary type of the resource.
   */
  public enum PrimaryResourceTypeEnum {
    CSS("CSS"),
    
    IMAGE("IMAGE"),
    
    OTHER("OTHER"),
    
    SCRIPT("SCRIPT");

    private String value;

    PrimaryResourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrimaryResourceTypeEnum fromValue(String value) {
      for (PrimaryResourceTypeEnum b : PrimaryResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIMARY_RESOURCE_TYPE = "primaryResourceType";
  private PrimaryResourceTypeEnum primaryResourceType;

  public static final String JSON_PROPERTY_SECONDARY_RESOURCE_TYPE = "secondaryResourceType";
  private String secondaryResourceType;

  public ResourceType() { 
  }

  public ResourceType regularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
    return this;
  }

   /**
   * The regular expression to detect the resource.
   * @return regularExpression
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The regular expression to detect the resource.")
  @JsonProperty(JSON_PROPERTY_REGULAR_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegularExpression() {
    return regularExpression;
  }


  @JsonProperty(JSON_PROPERTY_REGULAR_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }


  public ResourceType primaryResourceType(PrimaryResourceTypeEnum primaryResourceType) {
    this.primaryResourceType = primaryResourceType;
    return this;
  }

   /**
   * The primary type of the resource.
   * @return primaryResourceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The primary type of the resource.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PrimaryResourceTypeEnum getPrimaryResourceType() {
    return primaryResourceType;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrimaryResourceType(PrimaryResourceTypeEnum primaryResourceType) {
    this.primaryResourceType = primaryResourceType;
  }


  public ResourceType secondaryResourceType(String secondaryResourceType) {
    this.secondaryResourceType = secondaryResourceType;
    return this;
  }

   /**
   * The secondary type of the resource.
   * @return secondaryResourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secondary type of the resource.")
  @JsonProperty(JSON_PROPERTY_SECONDARY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryResourceType() {
    return secondaryResourceType;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryResourceType(String secondaryResourceType) {
    this.secondaryResourceType = secondaryResourceType;
  }


  /**
   * Return true if this ResourceType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceType resourceType = (ResourceType) o;
    return Objects.equals(this.regularExpression, resourceType.regularExpression) &&
        Objects.equals(this.primaryResourceType, resourceType.primaryResourceType) &&
        Objects.equals(this.secondaryResourceType, resourceType.secondaryResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regularExpression, primaryResourceType, secondaryResourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceType {\n");
    sb.append("    regularExpression: ").append(toIndentedString(regularExpression)).append("\n");
    sb.append("    primaryResourceType: ").append(toIndentedString(primaryResourceType)).append("\n");
    sb.append("    secondaryResourceType: ").append(toIndentedString(secondaryResourceType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
