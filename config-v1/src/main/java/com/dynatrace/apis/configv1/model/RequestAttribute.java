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
import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
import com.dynatrace.apis.configv1.model.DataSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RequestAttribute
 */
@JsonPropertyOrder({
  RequestAttribute.JSON_PROPERTY_METADATA,
  RequestAttribute.JSON_PROPERTY_ID,
  RequestAttribute.JSON_PROPERTY_NAME,
  RequestAttribute.JSON_PROPERTY_ENABLED,
  RequestAttribute.JSON_PROPERTY_DATA_TYPE,
  RequestAttribute.JSON_PROPERTY_DATA_SOURCES,
  RequestAttribute.JSON_PROPERTY_NORMALIZATION,
  RequestAttribute.JSON_PROPERTY_AGGREGATION,
  RequestAttribute.JSON_PROPERTY_CONFIDENTIAL,
  RequestAttribute.JSON_PROPERTY_SKIP_PERSONAL_DATA_MASKING
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class RequestAttribute {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  /**
   * The data type of the request attribute.
   */
  public enum DataTypeEnum {
    DOUBLE("DOUBLE"),
    
    INTEGER("INTEGER"),
    
    STRING("STRING");

    private String value;

    DataTypeEnum(String value) {
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
    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  private DataTypeEnum dataType;

  public static final String JSON_PROPERTY_DATA_SOURCES = "dataSources";
  private List<DataSource> dataSources = new ArrayList<>();

  /**
   * String values transformation.    If the **dataType** is not &#x60;string&#x60;, set the &#x60;Original&#x60; here.
   */
  public enum NormalizationEnum {
    ORIGINAL("ORIGINAL"),
    
    TO_LOWER_CASE("TO_LOWER_CASE"),
    
    TO_UPPER_CASE("TO_UPPER_CASE");

    private String value;

    NormalizationEnum(String value) {
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
    public static NormalizationEnum fromValue(String value) {
      for (NormalizationEnum b : NormalizationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NORMALIZATION = "normalization";
  private NormalizationEnum normalization;

  /**
   * Aggregation type for the request values.
   */
  public enum AggregationEnum {
    ALL_DISTINCT_VALUES("ALL_DISTINCT_VALUES"),
    
    AVERAGE("AVERAGE"),
    
    COUNT_DISTINCT_VALUES("COUNT_DISTINCT_VALUES"),
    
    COUNT_VALUES("COUNT_VALUES"),
    
    FIRST("FIRST"),
    
    LAST("LAST"),
    
    MAXIMUM("MAXIMUM"),
    
    MINIMUM("MINIMUM"),
    
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

  public static final String JSON_PROPERTY_CONFIDENTIAL = "confidential";
  private Boolean confidential;

  public static final String JSON_PROPERTY_SKIP_PERSONAL_DATA_MASKING = "skipPersonalDataMasking";
  private Boolean skipPersonalDataMasking;

  public RequestAttribute() { 
  }

  public RequestAttribute metadata(ConfigurationMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigurationMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(ConfigurationMetadata metadata) {
    this.metadata = metadata;
  }


  public RequestAttribute id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the request attribute.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the request attribute.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public RequestAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the request attribute.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the request attribute.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RequestAttribute enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The request attribute is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The request attribute is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public RequestAttribute dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The data type of the request attribute.
   * @return dataType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The data type of the request attribute.")
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DataTypeEnum getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  public RequestAttribute dataSources(List<DataSource> dataSources) {
    this.dataSources = dataSources;
    return this;
  }

  public RequestAttribute addDataSourcesItem(DataSource dataSourcesItem) {
    this.dataSources.add(dataSourcesItem);
    return this;
  }

   /**
   * The list of data sources.
   * @return dataSources
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of data sources.")
  @JsonProperty(JSON_PROPERTY_DATA_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DataSource> getDataSources() {
    return dataSources;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataSources(List<DataSource> dataSources) {
    this.dataSources = dataSources;
  }


  public RequestAttribute normalization(NormalizationEnum normalization) {
    this.normalization = normalization;
    return this;
  }

   /**
   * String values transformation.    If the **dataType** is not &#x60;string&#x60;, set the &#x60;Original&#x60; here.
   * @return normalization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "String values transformation.    If the **dataType** is not `string`, set the `Original` here.")
  @JsonProperty(JSON_PROPERTY_NORMALIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NormalizationEnum getNormalization() {
    return normalization;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNormalization(NormalizationEnum normalization) {
    this.normalization = normalization;
  }


  public RequestAttribute aggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Aggregation type for the request values.
   * @return aggregation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Aggregation type for the request values.")
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AggregationEnum getAggregation() {
    return aggregation;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  public RequestAttribute confidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

   /**
   * Confidential data flag. Set &#x60;true&#x60; to treat the captured data as confidential.
   * @return confidential
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Confidential data flag. Set `true` to treat the captured data as confidential.")
  @JsonProperty(JSON_PROPERTY_CONFIDENTIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getConfidential() {
    return confidential;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENTIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfidential(Boolean confidential) {
    this.confidential = confidential;
  }


  public RequestAttribute skipPersonalDataMasking(Boolean skipPersonalDataMasking) {
    this.skipPersonalDataMasking = skipPersonalDataMasking;
    return this;
  }

   /**
   * Personal data masking flag. Set &#x60;true&#x60; to skip masking.    Warning: This will potentially access personalized data.
   * @return skipPersonalDataMasking
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Personal data masking flag. Set `true` to skip masking.    Warning: This will potentially access personalized data.")
  @JsonProperty(JSON_PROPERTY_SKIP_PERSONAL_DATA_MASKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSkipPersonalDataMasking() {
    return skipPersonalDataMasking;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_PERSONAL_DATA_MASKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSkipPersonalDataMasking(Boolean skipPersonalDataMasking) {
    this.skipPersonalDataMasking = skipPersonalDataMasking;
  }


  /**
   * Return true if this RequestAttribute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestAttribute requestAttribute = (RequestAttribute) o;
    return Objects.equals(this.metadata, requestAttribute.metadata) &&
        Objects.equals(this.id, requestAttribute.id) &&
        Objects.equals(this.name, requestAttribute.name) &&
        Objects.equals(this.enabled, requestAttribute.enabled) &&
        Objects.equals(this.dataType, requestAttribute.dataType) &&
        Objects.equals(this.dataSources, requestAttribute.dataSources) &&
        Objects.equals(this.normalization, requestAttribute.normalization) &&
        Objects.equals(this.aggregation, requestAttribute.aggregation) &&
        Objects.equals(this.confidential, requestAttribute.confidential) &&
        Objects.equals(this.skipPersonalDataMasking, requestAttribute.skipPersonalDataMasking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, name, enabled, dataType, dataSources, normalization, aggregation, confidential, skipPersonalDataMasking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestAttribute {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
    sb.append("    normalization: ").append(toIndentedString(normalization)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    confidential: ").append(toIndentedString(confidential)).append("\n");
    sb.append("    skipPersonalDataMasking: ").append(toIndentedString(skipPersonalDataMasking)).append("\n");
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
