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
import com.dynatrace.apis.configv1.model.MethodReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CapturedMethod
 */
@JsonPropertyOrder({
  CapturedMethod.JSON_PROPERTY_METHOD,
  CapturedMethod.JSON_PROPERTY_CAPTURE,
  CapturedMethod.JSON_PROPERTY_ARGUMENT_INDEX,
  CapturedMethod.JSON_PROPERTY_DEEP_OBJECT_ACCESS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class CapturedMethod {
  public static final String JSON_PROPERTY_METHOD = "method";
  private MethodReference method;

  /**
   * What to capture from the method.
   */
  public enum CaptureEnum {
    ARGUMENT("ARGUMENT"),
    
    CLASS_NAME("CLASS_NAME"),
    
    METHOD_NAME("METHOD_NAME"),
    
    OCCURRENCES("OCCURRENCES"),
    
    SIMPLE_CLASS_NAME("SIMPLE_CLASS_NAME"),
    
    THIS("THIS");

    private String value;

    CaptureEnum(String value) {
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
    public static CaptureEnum fromValue(String value) {
      for (CaptureEnum b : CaptureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CAPTURE = "capture";
  private CaptureEnum capture;

  public static final String JSON_PROPERTY_ARGUMENT_INDEX = "argumentIndex";
  private Integer argumentIndex;

  public static final String JSON_PROPERTY_DEEP_OBJECT_ACCESS = "deepObjectAccess";
  private String deepObjectAccess;

  public CapturedMethod() { 
  }

  public CapturedMethod method(MethodReference method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MethodReference getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMethod(MethodReference method) {
    this.method = method;
  }


  public CapturedMethod capture(CaptureEnum capture) {
    this.capture = capture;
    return this;
  }

   /**
   * What to capture from the method.
   * @return capture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "What to capture from the method.")
  @JsonProperty(JSON_PROPERTY_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CaptureEnum getCapture() {
    return capture;
  }


  @JsonProperty(JSON_PROPERTY_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCapture(CaptureEnum capture) {
    this.capture = capture;
  }


  public CapturedMethod argumentIndex(Integer argumentIndex) {
    this.argumentIndex = argumentIndex;
    return this;
  }

   /**
   * The index of the argument to capture. Set &#x60;0&#x60; to capture the return value, &#x60;1&#x60; or higher to capture a mehtod argument.    Required if the **capture** is set to &#x60;ARGUMENT&#x60;.   Not applicable in other cases.
   * minimum: 0
   * @return argumentIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the argument to capture. Set `0` to capture the return value, `1` or higher to capture a mehtod argument.    Required if the **capture** is set to `ARGUMENT`.   Not applicable in other cases.")
  @JsonProperty(JSON_PROPERTY_ARGUMENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getArgumentIndex() {
    return argumentIndex;
  }


  @JsonProperty(JSON_PROPERTY_ARGUMENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArgumentIndex(Integer argumentIndex) {
    this.argumentIndex = argumentIndex;
  }


  public CapturedMethod deepObjectAccess(String deepObjectAccess) {
    this.deepObjectAccess = deepObjectAccess;
    return this;
  }

   /**
   * The getter chain to apply to the captured object. It is required in one of the following cases:   The **capture** is set to &#x60;THIS&#x60;.    The **capture** is set to &#x60;ARGUMENT&#x60;, and the argument is not a primitive, a primitive wrapper class, a string, or an array.    Not applicable in other cases.
   * @return deepObjectAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The getter chain to apply to the captured object. It is required in one of the following cases:   The **capture** is set to `THIS`.    The **capture** is set to `ARGUMENT`, and the argument is not a primitive, a primitive wrapper class, a string, or an array.    Not applicable in other cases.")
  @JsonProperty(JSON_PROPERTY_DEEP_OBJECT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeepObjectAccess() {
    return deepObjectAccess;
  }


  @JsonProperty(JSON_PROPERTY_DEEP_OBJECT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeepObjectAccess(String deepObjectAccess) {
    this.deepObjectAccess = deepObjectAccess;
  }


  /**
   * Return true if this CapturedMethod object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapturedMethod capturedMethod = (CapturedMethod) o;
    return Objects.equals(this.method, capturedMethod.method) &&
        Objects.equals(this.capture, capturedMethod.capture) &&
        Objects.equals(this.argumentIndex, capturedMethod.argumentIndex) &&
        Objects.equals(this.deepObjectAccess, capturedMethod.deepObjectAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, capture, argumentIndex, deepObjectAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapturedMethod {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    argumentIndex: ").append(toIndentedString(argumentIndex)).append("\n");
    sb.append("    deepObjectAccess: ").append(toIndentedString(deepObjectAccess)).append("\n");
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

