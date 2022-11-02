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
import com.dynatrace.apis.configv1.model.CompareOperation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A condition of the service detection rule.
 */
@ApiModel(description = "A condition of the service detection rule.")
@JsonPropertyOrder({
  ConditionsOpaqueAndExternalWebServiceAttributeTypeDto.JSON_PROPERTY_ATTRIBUTE_TYPE,
  ConditionsOpaqueAndExternalWebServiceAttributeTypeDto.JSON_PROPERTY_COMPARE_OPERATIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ConditionsOpaqueAndExternalWebServiceAttributeTypeDto {
  /**
   * The type of the attribute to be checked.
   */
  public enum AttributeTypeEnum {
    ENDPOINT("ENDPOINT"),
    
    IP("IP"),
    
    OPERATION_NAME("OPERATION_NAME"),
    
    PG_TAG("PG_TAG"),
    
    URL_PATH("URL_PATH"),
    
    URL_PORT("URL_PORT");

    private String value;

    AttributeTypeEnum(String value) {
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
    public static AttributeTypeEnum fromValue(String value) {
      for (AttributeTypeEnum b : AttributeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ATTRIBUTE_TYPE = "attributeType";
  private AttributeTypeEnum attributeType;

  public static final String JSON_PROPERTY_COMPARE_OPERATIONS = "compareOperations";
  private List<CompareOperation> compareOperations = null;

  public ConditionsOpaqueAndExternalWebServiceAttributeTypeDto() { 
  }

  public ConditionsOpaqueAndExternalWebServiceAttributeTypeDto attributeType(AttributeTypeEnum attributeType) {
    this.attributeType = attributeType;
    return this;
  }

   /**
   * The type of the attribute to be checked.
   * @return attributeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the attribute to be checked.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AttributeTypeEnum getAttributeType() {
    return attributeType;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttributeType(AttributeTypeEnum attributeType) {
    this.attributeType = attributeType;
  }


  public ConditionsOpaqueAndExternalWebServiceAttributeTypeDto compareOperations(List<CompareOperation> compareOperations) {
    this.compareOperations = compareOperations;
    return this;
  }

  public ConditionsOpaqueAndExternalWebServiceAttributeTypeDto addCompareOperationsItem(CompareOperation compareOperationsItem) {
    if (this.compareOperations == null) {
      this.compareOperations = new ArrayList<>();
    }
    this.compareOperations.add(compareOperationsItem);
    return this;
  }

   /**
   * A list of conditions for the rule.   If several conditions are specified, the AND logic applies.
   * @return compareOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of conditions for the rule.   If several conditions are specified, the AND logic applies.")
  @JsonProperty(JSON_PROPERTY_COMPARE_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CompareOperation> getCompareOperations() {
    return compareOperations;
  }


  @JsonProperty(JSON_PROPERTY_COMPARE_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompareOperations(List<CompareOperation> compareOperations) {
    this.compareOperations = compareOperations;
  }


  /**
   * Return true if this ConditionsOpaqueAndExternalWebServiceAttributeTypeDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionsOpaqueAndExternalWebServiceAttributeTypeDto conditionsOpaqueAndExternalWebServiceAttributeTypeDto = (ConditionsOpaqueAndExternalWebServiceAttributeTypeDto) o;
    return Objects.equals(this.attributeType, conditionsOpaqueAndExternalWebServiceAttributeTypeDto.attributeType) &&
        Objects.equals(this.compareOperations, conditionsOpaqueAndExternalWebServiceAttributeTypeDto.compareOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeType, compareOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionsOpaqueAndExternalWebServiceAttributeTypeDto {\n");
    sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
    sb.append("    compareOperations: ").append(toIndentedString(compareOperations)).append("\n");
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

