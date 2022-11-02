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
import com.dynatrace.apis.configv1.model.ApplicationTypeComparison;
import com.dynatrace.apis.configv1.model.AzureComputeModeComparison;
import com.dynatrace.apis.configv1.model.AzureSkuComparision;
import com.dynatrace.apis.configv1.model.BitnessComparision;
import com.dynatrace.apis.configv1.model.CloudTypeComparison;
import com.dynatrace.apis.configv1.model.CustomApplicationTypeComparison;
import com.dynatrace.apis.configv1.model.DatabaseTopologyComparison;
import com.dynatrace.apis.configv1.model.DcrumDecoderComparison;
import com.dynatrace.apis.configv1.model.EntityIdComparison;
import com.dynatrace.apis.configv1.model.HypervisorTypeComparision;
import com.dynatrace.apis.configv1.model.IndexedNameComparison;
import com.dynatrace.apis.configv1.model.IndexedStringComparison;
import com.dynatrace.apis.configv1.model.IndexedTagComparison;
import com.dynatrace.apis.configv1.model.IntegerComparison;
import com.dynatrace.apis.configv1.model.IpAddressComparison;
import com.dynatrace.apis.configv1.model.MobilePlatformComparison;
import com.dynatrace.apis.configv1.model.OsArchitectureComparison;
import com.dynatrace.apis.configv1.model.OsTypeComparison;
import com.dynatrace.apis.configv1.model.PaasTypeComparison;
import com.dynatrace.apis.configv1.model.ServiceTopologyComparison;
import com.dynatrace.apis.configv1.model.ServiceTypeComparison;
import com.dynatrace.apis.configv1.model.SimpleHostTechComparison;
import com.dynatrace.apis.configv1.model.SimpleTechComparison;
import com.dynatrace.apis.configv1.model.StringComparison;
import com.dynatrace.apis.configv1.model.SyntheticEngineTypeComparison;
import com.dynatrace.apis.configv1.model.TagComparison;
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
 * Defines how the matching is actually performed: what and how are we comparing.   The actual set of fields and possible values of the **operator** field depend on the type of the comparison. Find the list of actual objects in the description of the **type** field or see [JSON models](https://dt-url.net/0b83s6z).
 */
@ApiModel(description = "Defines how the matching is actually performed: what and how are we comparing.   The actual set of fields and possible values of the **operator** field depend on the type of the comparison. Find the list of actual objects in the description of the **type** field or see [JSON models](https://dt-url.net/0b83s6z).")
@JsonPropertyOrder({
  ComparisonBasic.JSON_PROPERTY_OPERATOR,
  ComparisonBasic.JSON_PROPERTY_VALUE,
  ComparisonBasic.JSON_PROPERTY_NEGATE,
  ComparisonBasic.JSON_PROPERTY_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ApplicationTypeComparison.class, name = "ApplicationTypeComparison"),
  @JsonSubTypes.Type(value = AzureComputeModeComparison.class, name = "AzureComputeModeComparison"),
  @JsonSubTypes.Type(value = AzureSkuComparision.class, name = "AzureSkuComparision"),
  @JsonSubTypes.Type(value = BitnessComparision.class, name = "BitnessComparision"),
  @JsonSubTypes.Type(value = CloudTypeComparison.class, name = "CloudTypeComparison"),
  @JsonSubTypes.Type(value = CustomApplicationTypeComparison.class, name = "CustomApplicationTypeComparison"),
  @JsonSubTypes.Type(value = DatabaseTopologyComparison.class, name = "DatabaseTopologyComparison"),
  @JsonSubTypes.Type(value = DcrumDecoderComparison.class, name = "DcrumDecoderComparison"),
  @JsonSubTypes.Type(value = EntityIdComparison.class, name = "EntityIdComparison"),
  @JsonSubTypes.Type(value = HypervisorTypeComparision.class, name = "HypervisorTypeComparision"),
  @JsonSubTypes.Type(value = IndexedNameComparison.class, name = "IndexedNameComparison"),
  @JsonSubTypes.Type(value = IndexedStringComparison.class, name = "IndexedStringComparison"),
  @JsonSubTypes.Type(value = IndexedTagComparison.class, name = "IndexedTagComparison"),
  @JsonSubTypes.Type(value = IntegerComparison.class, name = "IntegerComparison"),
  @JsonSubTypes.Type(value = IpAddressComparison.class, name = "IpAddressComparison"),
  @JsonSubTypes.Type(value = MobilePlatformComparison.class, name = "MobilePlatformComparison"),
  @JsonSubTypes.Type(value = OsArchitectureComparison.class, name = "OsArchitectureComparison"),
  @JsonSubTypes.Type(value = OsTypeComparison.class, name = "OsTypeComparison"),
  @JsonSubTypes.Type(value = PaasTypeComparison.class, name = "PaasTypeComparison"),
  @JsonSubTypes.Type(value = ServiceTopologyComparison.class, name = "ServiceTopologyComparison"),
  @JsonSubTypes.Type(value = ServiceTypeComparison.class, name = "ServiceTypeComparison"),
  @JsonSubTypes.Type(value = SimpleHostTechComparison.class, name = "SimpleHostTechComparison"),
  @JsonSubTypes.Type(value = SimpleTechComparison.class, name = "SimpleTechComparison"),
  @JsonSubTypes.Type(value = StringComparison.class, name = "StringComparison"),
  @JsonSubTypes.Type(value = SyntheticEngineTypeComparison.class, name = "SyntheticEngineTypeComparison"),
  @JsonSubTypes.Type(value = TagComparison.class, name = "TagComparison"),
})

public class ComparisonBasic {
  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public static final String JSON_PROPERTY_NEGATE = "negate";
  private Boolean negate;

  /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;STRING&#x60; -&gt; StringComparison  * &#x60;INDEXED_NAME&#x60; -&gt; IndexedNameComparison  * &#x60;INDEXED_STRING&#x60; -&gt; IndexedStringComparison  * &#x60;INTEGER&#x60; -&gt; IntegerComparison  * &#x60;SERVICE_TYPE&#x60; -&gt; ServiceTypeComparison  * &#x60;PAAS_TYPE&#x60; -&gt; PaasTypeComparison  * &#x60;CLOUD_TYPE&#x60; -&gt; CloudTypeComparison  * &#x60;AZURE_SKU&#x60; -&gt; AzureSkuComparision  * &#x60;AZURE_COMPUTE_MODE&#x60; -&gt; AzureComputeModeComparison  * &#x60;ENTITY_ID&#x60; -&gt; EntityIdComparison  * &#x60;SIMPLE_TECH&#x60; -&gt; SimpleTechComparison  * &#x60;SIMPLE_HOST_TECH&#x60; -&gt; SimpleHostTechComparison  * &#x60;SERVICE_TOPOLOGY&#x60; -&gt; ServiceTopologyComparison  * &#x60;DATABASE_TOPOLOGY&#x60; -&gt; DatabaseTopologyComparison  * &#x60;OS_TYPE&#x60; -&gt; OsTypeComparison  * &#x60;HYPERVISOR_TYPE&#x60; -&gt; HypervisorTypeComparision  * &#x60;IP_ADDRESS&#x60; -&gt; IpAddressComparison  * &#x60;OS_ARCHITECTURE&#x60; -&gt; OsArchitectureComparison  * &#x60;BITNESS&#x60; -&gt; BitnessComparision  * &#x60;APPLICATION_TYPE&#x60; -&gt; ApplicationTypeComparison  * &#x60;MOBILE_PLATFORM&#x60; -&gt; MobilePlatformComparison  * &#x60;CUSTOM_APPLICATION_TYPE&#x60; -&gt; CustomApplicationTypeComparison  * &#x60;DCRUM_DECODER_TYPE&#x60; -&gt; DcrumDecoderComparison  * &#x60;SYNTHETIC_ENGINE_TYPE&#x60; -&gt; SyntheticEngineTypeComparison  * &#x60;TAG&#x60; -&gt; TagComparison  * &#x60;INDEXED_TAG&#x60; -&gt; IndexedTagComparison  
   */
  public enum TypeEnum {
    APPLICATION_TYPE("APPLICATION_TYPE"),
    
    AZURE_COMPUTE_MODE("AZURE_COMPUTE_MODE"),
    
    AZURE_SKU("AZURE_SKU"),
    
    BITNESS("BITNESS"),
    
    CLOUD_TYPE("CLOUD_TYPE"),
    
    CUSTOM_APPLICATION_TYPE("CUSTOM_APPLICATION_TYPE"),
    
    DATABASE_TOPOLOGY("DATABASE_TOPOLOGY"),
    
    DCRUM_DECODER_TYPE("DCRUM_DECODER_TYPE"),
    
    ENTITY_ID("ENTITY_ID"),
    
    HYPERVISOR_TYPE("HYPERVISOR_TYPE"),
    
    INDEXED_NAME("INDEXED_NAME"),
    
    INDEXED_STRING("INDEXED_STRING"),
    
    INDEXED_TAG("INDEXED_TAG"),
    
    INTEGER("INTEGER"),
    
    IP_ADDRESS("IP_ADDRESS"),
    
    MOBILE_PLATFORM("MOBILE_PLATFORM"),
    
    OS_ARCHITECTURE("OS_ARCHITECTURE"),
    
    OS_TYPE("OS_TYPE"),
    
    PAAS_TYPE("PAAS_TYPE"),
    
    SERVICE_TOPOLOGY("SERVICE_TOPOLOGY"),
    
    SERVICE_TYPE("SERVICE_TYPE"),
    
    SIMPLE_HOST_TECH("SIMPLE_HOST_TECH"),
    
    SIMPLE_TECH("SIMPLE_TECH"),
    
    STRING("STRING"),
    
    SYNTHETIC_ENGINE_TYPE("SYNTHETIC_ENGINE_TYPE"),
    
    TAG("TAG");

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

  public ComparisonBasic() { 
  }

  public ComparisonBasic operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Operator of the comparison. You can reverse it by setting **negate** to `true`.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperator(String operator) {
    this.operator = operator;
  }


  public ComparisonBasic value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value to compare to.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value to compare to.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Object value) {
    this.value = value;
  }


  public ComparisonBasic negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * Reverses the comparison **operator**. For example it turns the **begins with** into **does not begin with**.
   * @return negate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Reverses the comparison **operator**. For example it turns the **begins with** into **does not begin with**.")
  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getNegate() {
    return negate;
  }


  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNegate(Boolean negate) {
    this.negate = negate;
  }


  public ComparisonBasic type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;STRING&#x60; -&gt; StringComparison  * &#x60;INDEXED_NAME&#x60; -&gt; IndexedNameComparison  * &#x60;INDEXED_STRING&#x60; -&gt; IndexedStringComparison  * &#x60;INTEGER&#x60; -&gt; IntegerComparison  * &#x60;SERVICE_TYPE&#x60; -&gt; ServiceTypeComparison  * &#x60;PAAS_TYPE&#x60; -&gt; PaasTypeComparison  * &#x60;CLOUD_TYPE&#x60; -&gt; CloudTypeComparison  * &#x60;AZURE_SKU&#x60; -&gt; AzureSkuComparision  * &#x60;AZURE_COMPUTE_MODE&#x60; -&gt; AzureComputeModeComparison  * &#x60;ENTITY_ID&#x60; -&gt; EntityIdComparison  * &#x60;SIMPLE_TECH&#x60; -&gt; SimpleTechComparison  * &#x60;SIMPLE_HOST_TECH&#x60; -&gt; SimpleHostTechComparison  * &#x60;SERVICE_TOPOLOGY&#x60; -&gt; ServiceTopologyComparison  * &#x60;DATABASE_TOPOLOGY&#x60; -&gt; DatabaseTopologyComparison  * &#x60;OS_TYPE&#x60; -&gt; OsTypeComparison  * &#x60;HYPERVISOR_TYPE&#x60; -&gt; HypervisorTypeComparision  * &#x60;IP_ADDRESS&#x60; -&gt; IpAddressComparison  * &#x60;OS_ARCHITECTURE&#x60; -&gt; OsArchitectureComparison  * &#x60;BITNESS&#x60; -&gt; BitnessComparision  * &#x60;APPLICATION_TYPE&#x60; -&gt; ApplicationTypeComparison  * &#x60;MOBILE_PLATFORM&#x60; -&gt; MobilePlatformComparison  * &#x60;CUSTOM_APPLICATION_TYPE&#x60; -&gt; CustomApplicationTypeComparison  * &#x60;DCRUM_DECODER_TYPE&#x60; -&gt; DcrumDecoderComparison  * &#x60;SYNTHETIC_ENGINE_TYPE&#x60; -&gt; SyntheticEngineTypeComparison  * &#x60;TAG&#x60; -&gt; TagComparison  * &#x60;INDEXED_TAG&#x60; -&gt; IndexedTagComparison  
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the actual set of fields depending on the value. See one of the following objects:   * `STRING` -> StringComparison  * `INDEXED_NAME` -> IndexedNameComparison  * `INDEXED_STRING` -> IndexedStringComparison  * `INTEGER` -> IntegerComparison  * `SERVICE_TYPE` -> ServiceTypeComparison  * `PAAS_TYPE` -> PaasTypeComparison  * `CLOUD_TYPE` -> CloudTypeComparison  * `AZURE_SKU` -> AzureSkuComparision  * `AZURE_COMPUTE_MODE` -> AzureComputeModeComparison  * `ENTITY_ID` -> EntityIdComparison  * `SIMPLE_TECH` -> SimpleTechComparison  * `SIMPLE_HOST_TECH` -> SimpleHostTechComparison  * `SERVICE_TOPOLOGY` -> ServiceTopologyComparison  * `DATABASE_TOPOLOGY` -> DatabaseTopologyComparison  * `OS_TYPE` -> OsTypeComparison  * `HYPERVISOR_TYPE` -> HypervisorTypeComparision  * `IP_ADDRESS` -> IpAddressComparison  * `OS_ARCHITECTURE` -> OsArchitectureComparison  * `BITNESS` -> BitnessComparision  * `APPLICATION_TYPE` -> ApplicationTypeComparison  * `MOBILE_PLATFORM` -> MobilePlatformComparison  * `CUSTOM_APPLICATION_TYPE` -> CustomApplicationTypeComparison  * `DCRUM_DECODER_TYPE` -> DcrumDecoderComparison  * `SYNTHETIC_ENGINE_TYPE` -> SyntheticEngineTypeComparison  * `TAG` -> TagComparison  * `INDEXED_TAG` -> IndexedTagComparison  ")
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


  /**
   * Return true if this ComparisonBasic object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparisonBasic comparisonBasic = (ComparisonBasic) o;
    return Objects.equals(this.operator, comparisonBasic.operator) &&
        Objects.equals(this.value, comparisonBasic.value) &&
        Objects.equals(this.negate, comparisonBasic.negate) &&
        Objects.equals(this.type, comparisonBasic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value, negate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonBasic {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
  mappings.put("ApplicationTypeComparison", ApplicationTypeComparison.class);
  mappings.put("AzureComputeModeComparison", AzureComputeModeComparison.class);
  mappings.put("AzureSkuComparision", AzureSkuComparision.class);
  mappings.put("BitnessComparision", BitnessComparision.class);
  mappings.put("CloudTypeComparison", CloudTypeComparison.class);
  mappings.put("CustomApplicationTypeComparison", CustomApplicationTypeComparison.class);
  mappings.put("DatabaseTopologyComparison", DatabaseTopologyComparison.class);
  mappings.put("DcrumDecoderComparison", DcrumDecoderComparison.class);
  mappings.put("EntityIdComparison", EntityIdComparison.class);
  mappings.put("HypervisorTypeComparision", HypervisorTypeComparision.class);
  mappings.put("IndexedNameComparison", IndexedNameComparison.class);
  mappings.put("IndexedStringComparison", IndexedStringComparison.class);
  mappings.put("IndexedTagComparison", IndexedTagComparison.class);
  mappings.put("IntegerComparison", IntegerComparison.class);
  mappings.put("IpAddressComparison", IpAddressComparison.class);
  mappings.put("MobilePlatformComparison", MobilePlatformComparison.class);
  mappings.put("OsArchitectureComparison", OsArchitectureComparison.class);
  mappings.put("OsTypeComparison", OsTypeComparison.class);
  mappings.put("PaasTypeComparison", PaasTypeComparison.class);
  mappings.put("ServiceTopologyComparison", ServiceTopologyComparison.class);
  mappings.put("ServiceTypeComparison", ServiceTypeComparison.class);
  mappings.put("SimpleHostTechComparison", SimpleHostTechComparison.class);
  mappings.put("SimpleTechComparison", SimpleTechComparison.class);
  mappings.put("StringComparison", StringComparison.class);
  mappings.put("SyntheticEngineTypeComparison", SyntheticEngineTypeComparison.class);
  mappings.put("TagComparison", TagComparison.class);
  mappings.put("ComparisonBasic", ComparisonBasic.class);
  JSON.registerDiscriminator(ComparisonBasic.class, "type", mappings);
}
}

