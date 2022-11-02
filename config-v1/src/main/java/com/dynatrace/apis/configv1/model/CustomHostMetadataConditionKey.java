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
import com.dynatrace.apis.configv1.model.ConditionKey;
import com.dynatrace.apis.configv1.model.CustomHostMetadataConditionKey;
import com.dynatrace.apis.configv1.model.CustomHostMetadataKey;
import com.dynatrace.apis.configv1.model.CustomProcessMetadataConditionKey;
import com.dynatrace.apis.configv1.model.ProcessMetadataConditionKey;
import com.dynatrace.apis.configv1.model.StaticConditionKey;
import com.dynatrace.apis.configv1.model.StringConditionKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * The key for dynamic attributes of the &#x60;HOST_CUSTOM_METADATA_KEY&#x60; type.
 */
@ApiModel(description = "The key for dynamic attributes of the `HOST_CUSTOM_METADATA_KEY` type.")
@JsonPropertyOrder({
  CustomHostMetadataConditionKey.JSON_PROPERTY_DYNAMIC_KEY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CustomHostMetadataConditionKey.class, name = "HOST_CUSTOM_METADATA_KEY"),
  @JsonSubTypes.Type(value = CustomProcessMetadataConditionKey.class, name = "PROCESS_CUSTOM_METADATA_KEY"),
  @JsonSubTypes.Type(value = ProcessMetadataConditionKey.class, name = "PROCESS_PREDEFINED_METADATA_KEY"),
  @JsonSubTypes.Type(value = StaticConditionKey.class, name = "STATIC"),
  @JsonSubTypes.Type(value = StringConditionKey.class, name = "STRING"),
})

public class CustomHostMetadataConditionKey extends ConditionKey {
  public static final String JSON_PROPERTY_DYNAMIC_KEY = "dynamicKey";
  private CustomHostMetadataKey dynamicKey;

  public CustomHostMetadataConditionKey() { 
  }

  public CustomHostMetadataConditionKey dynamicKey(CustomHostMetadataKey dynamicKey) {
    this.dynamicKey = dynamicKey;
    return this;
  }

   /**
   * Get dynamicKey
   * @return dynamicKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DYNAMIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CustomHostMetadataKey getDynamicKey() {
    return dynamicKey;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDynamicKey(CustomHostMetadataKey dynamicKey) {
    this.dynamicKey = dynamicKey;
  }


  /**
   * Return true if this CustomHostMetadataConditionKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomHostMetadataConditionKey customHostMetadataConditionKey = (CustomHostMetadataConditionKey) o;
    return Objects.equals(this.dynamicKey, customHostMetadataConditionKey.dynamicKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomHostMetadataConditionKey {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dynamicKey: ").append(toIndentedString(dynamicKey)).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("HOST_CUSTOM_METADATA_KEY", CustomHostMetadataConditionKey.class);
  mappings.put("PROCESS_CUSTOM_METADATA_KEY", CustomProcessMetadataConditionKey.class);
  mappings.put("PROCESS_PREDEFINED_METADATA_KEY", ProcessMetadataConditionKey.class);
  mappings.put("STATIC", StaticConditionKey.class);
  mappings.put("STRING", StringConditionKey.class);
  mappings.put("CustomHostMetadataConditionKey", CustomHostMetadataConditionKey.class);
  JSON.registerDiscriminator(CustomHostMetadataConditionKey.class, "type", mappings);
}
}

