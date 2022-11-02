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
 * Configuration of the mobile session or user action property.
 */
@ApiModel(description = "Configuration of the mobile session or user action property.")
@JsonPropertyOrder({
  MobileSessionUserActionProperty.JSON_PROPERTY_KEY,
  MobileSessionUserActionProperty.JSON_PROPERTY_DISPLAY_NAME,
  MobileSessionUserActionProperty.JSON_PROPERTY_TYPE,
  MobileSessionUserActionProperty.JSON_PROPERTY_ORIGIN,
  MobileSessionUserActionProperty.JSON_PROPERTY_AGGREGATION,
  MobileSessionUserActionProperty.JSON_PROPERTY_STORE_AS_USER_ACTION_PROPERTY,
  MobileSessionUserActionProperty.JSON_PROPERTY_STORE_AS_SESSION_PROPERTY,
  MobileSessionUserActionProperty.JSON_PROPERTY_CLEANUP_RULE,
  MobileSessionUserActionProperty.JSON_PROPERTY_SERVER_SIDE_REQUEST_ATTRIBUTE,
  MobileSessionUserActionProperty.JSON_PROPERTY_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class MobileSessionUserActionProperty {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  /**
   * The data type of the property.
   */
  public enum TypeEnum {
    DOUBLE("DOUBLE"),
    
    LONG("LONG"),
    
    STRING("STRING");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * The origin of the property
   */
  public enum OriginEnum {
    API("API"),
    
    SERVER_SIDE_REQUEST_ATTRIBUTE("SERVER_SIDE_REQUEST_ATTRIBUTE");

    private String value;

    OriginEnum(String value) {
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
    public static OriginEnum fromValue(String value) {
      for (OriginEnum b : OriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private OriginEnum origin;

  /**
   * The aggregation type of the property.     It defines how multiple values of the property are aggregated.
   */
  public enum AggregationEnum {
    AVERAGE("AVERAGE"),
    
    FIRST("FIRST"),
    
    LAST("LAST"),
    
    MAX("MAX"),
    
    MIN("MIN"),
    
    SUM("SUM");

    private String value;

    AggregationEnum(String value) {
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
    public static AggregationEnum fromValue(String value) {
      for (AggregationEnum b : AggregationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private AggregationEnum aggregation;

  public static final String JSON_PROPERTY_STORE_AS_USER_ACTION_PROPERTY = "storeAsUserActionProperty";
  private Boolean storeAsUserActionProperty;

  public static final String JSON_PROPERTY_STORE_AS_SESSION_PROPERTY = "storeAsSessionProperty";
  private Boolean storeAsSessionProperty;

  public static final String JSON_PROPERTY_CLEANUP_RULE = "cleanupRule";
  private String cleanupRule;

  public static final String JSON_PROPERTY_SERVER_SIDE_REQUEST_ATTRIBUTE = "serverSideRequestAttribute";
  private String serverSideRequestAttribute;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public MobileSessionUserActionProperty() { 
  }

  public MobileSessionUserActionProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The unique key of the mobile session or user action property.
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique key of the mobile session or user action property.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public MobileSessionUserActionProperty displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the property.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the property.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public MobileSessionUserActionProperty type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The data type of the property.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The data type of the property.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public MobileSessionUserActionProperty origin(OriginEnum origin) {
    this.origin = origin;
    return this;
  }

   /**
   * The origin of the property
   * @return origin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The origin of the property")
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OriginEnum getOrigin() {
    return origin;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }


  public MobileSessionUserActionProperty aggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
    return this;
  }

   /**
   * The aggregation type of the property.     It defines how multiple values of the property are aggregated.
   * @return aggregation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aggregation type of the property.     It defines how multiple values of the property are aggregated.")
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AggregationEnum getAggregation() {
    return aggregation;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  public MobileSessionUserActionProperty storeAsUserActionProperty(Boolean storeAsUserActionProperty) {
    this.storeAsUserActionProperty = storeAsUserActionProperty;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the property is stored as a user action property
   * @return storeAsUserActionProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the property is stored as a user action property")
  @JsonProperty(JSON_PROPERTY_STORE_AS_USER_ACTION_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStoreAsUserActionProperty() {
    return storeAsUserActionProperty;
  }


  @JsonProperty(JSON_PROPERTY_STORE_AS_USER_ACTION_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreAsUserActionProperty(Boolean storeAsUserActionProperty) {
    this.storeAsUserActionProperty = storeAsUserActionProperty;
  }


  public MobileSessionUserActionProperty storeAsSessionProperty(Boolean storeAsSessionProperty) {
    this.storeAsSessionProperty = storeAsSessionProperty;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the property is stored as a session property
   * @return storeAsSessionProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the property is stored as a session property")
  @JsonProperty(JSON_PROPERTY_STORE_AS_SESSION_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStoreAsSessionProperty() {
    return storeAsSessionProperty;
  }


  @JsonProperty(JSON_PROPERTY_STORE_AS_SESSION_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreAsSessionProperty(Boolean storeAsSessionProperty) {
    this.storeAsSessionProperty = storeAsSessionProperty;
  }


  public MobileSessionUserActionProperty cleanupRule(String cleanupRule) {
    this.cleanupRule = cleanupRule;
    return this;
  }

   /**
   * The cleanup rule of the property.   Defines how to extract the data you need from a string value. Specify the [regular expression](https://dt-url.net/k9e0iaq) for the data you need there.
   * @return cleanupRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cleanup rule of the property.   Defines how to extract the data you need from a string value. Specify the [regular expression](https://dt-url.net/k9e0iaq) for the data you need there.")
  @JsonProperty(JSON_PROPERTY_CLEANUP_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCleanupRule() {
    return cleanupRule;
  }


  @JsonProperty(JSON_PROPERTY_CLEANUP_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCleanupRule(String cleanupRule) {
    this.cleanupRule = cleanupRule;
  }


  public MobileSessionUserActionProperty serverSideRequestAttribute(String serverSideRequestAttribute) {
    this.serverSideRequestAttribute = serverSideRequestAttribute;
    return this;
  }

   /**
   * The ID of the request attribute.   Only applicable when the **origin** is set to &#x60;SERVER_SIDE_REQUEST_ATTRIBUTE&#x60;.
   * @return serverSideRequestAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the request attribute.   Only applicable when the **origin** is set to `SERVER_SIDE_REQUEST_ATTRIBUTE`.")
  @JsonProperty(JSON_PROPERTY_SERVER_SIDE_REQUEST_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerSideRequestAttribute() {
    return serverSideRequestAttribute;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_SIDE_REQUEST_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerSideRequestAttribute(String serverSideRequestAttribute) {
    this.serverSideRequestAttribute = serverSideRequestAttribute;
  }


  public MobileSessionUserActionProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the reported value.   Only applicable when the **origin** is set to &#x60;API&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the reported value.   Only applicable when the **origin** is set to `API`.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this MobileSessionUserActionProperty object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileSessionUserActionProperty mobileSessionUserActionProperty = (MobileSessionUserActionProperty) o;
    return Objects.equals(this.key, mobileSessionUserActionProperty.key) &&
        Objects.equals(this.displayName, mobileSessionUserActionProperty.displayName) &&
        Objects.equals(this.type, mobileSessionUserActionProperty.type) &&
        Objects.equals(this.origin, mobileSessionUserActionProperty.origin) &&
        Objects.equals(this.aggregation, mobileSessionUserActionProperty.aggregation) &&
        Objects.equals(this.storeAsUserActionProperty, mobileSessionUserActionProperty.storeAsUserActionProperty) &&
        Objects.equals(this.storeAsSessionProperty, mobileSessionUserActionProperty.storeAsSessionProperty) &&
        Objects.equals(this.cleanupRule, mobileSessionUserActionProperty.cleanupRule) &&
        Objects.equals(this.serverSideRequestAttribute, mobileSessionUserActionProperty.serverSideRequestAttribute) &&
        Objects.equals(this.name, mobileSessionUserActionProperty.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, displayName, type, origin, aggregation, storeAsUserActionProperty, storeAsSessionProperty, cleanupRule, serverSideRequestAttribute, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileSessionUserActionProperty {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    storeAsUserActionProperty: ").append(toIndentedString(storeAsUserActionProperty)).append("\n");
    sb.append("    storeAsSessionProperty: ").append(toIndentedString(storeAsSessionProperty)).append("\n");
    sb.append("    cleanupRule: ").append(toIndentedString(cleanupRule)).append("\n");
    sb.append("    serverSideRequestAttribute: ").append(toIndentedString(serverSideRequestAttribute)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
