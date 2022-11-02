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
import com.dynatrace.apis.configv1.model.MethodRule;
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
 * DetectionRule
 */
@JsonPropertyOrder({
  DetectionRule.JSON_PROPERTY_ID,
  DetectionRule.JSON_PROPERTY_ENABLED,
  DetectionRule.JSON_PROPERTY_FILE_NAME,
  DetectionRule.JSON_PROPERTY_FILE_NAME_MATCHER,
  DetectionRule.JSON_PROPERTY_CLASS_NAME,
  DetectionRule.JSON_PROPERTY_MATCHER,
  DetectionRule.JSON_PROPERTY_METHOD_RULES,
  DetectionRule.JSON_PROPERTY_ANNOTATIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class DetectionRule {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  /**
   * Matcher applying to the file name. Default value is &#x60;ENDS_WITH&#x60; (if applicable).
   */
  public enum FileNameMatcherEnum {
    ENDS_WITH("ENDS_WITH"),
    
    EQUALS("EQUALS"),
    
    STARTS_WITH("STARTS_WITH");

    private String value;

    FileNameMatcherEnum(String value) {
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
    public static FileNameMatcherEnum fromValue(String value) {
      for (FileNameMatcherEnum b : FileNameMatcherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FILE_NAME_MATCHER = "fileNameMatcher";
  private FileNameMatcherEnum fileNameMatcher;

  public static final String JSON_PROPERTY_CLASS_NAME = "className";
  private String className;

  /**
   * Matcher applying to the class name. &#x60;STARTS_WITH&#x60; can only be used if there is at least one annotation defined. Default value is &#x60;EQUALS&#x60;.
   */
  public enum MatcherEnum {
    ENDS_WITH("ENDS_WITH"),
    
    EQUALS("EQUALS"),
    
    STARTS_WITH("STARTS_WITH");

    private String value;

    MatcherEnum(String value) {
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
    public static MatcherEnum fromValue(String value) {
      for (MatcherEnum b : MatcherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MATCHER = "matcher";
  private MatcherEnum matcher;

  public static final String JSON_PROPERTY_METHOD_RULES = "methodRules";
  private List<MethodRule> methodRules = new ArrayList<>();

  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<String> annotations = null;

  public DetectionRule() { 
  }

  public DetectionRule id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the detection rule.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the detection rule.")
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


  public DetectionRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Rule enabled/disabled.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Rule enabled/disabled.")
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


  public DetectionRule fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The PHP file containing the class or methods to instrument.   Required for PHP custom service.    Not applicable to Java and .NET.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PHP file containing the class or methods to instrument.   Required for PHP custom service.    Not applicable to Java and .NET.")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public DetectionRule fileNameMatcher(FileNameMatcherEnum fileNameMatcher) {
    this.fileNameMatcher = fileNameMatcher;
    return this;
  }

   /**
   * Matcher applying to the file name. Default value is &#x60;ENDS_WITH&#x60; (if applicable).
   * @return fileNameMatcher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Matcher applying to the file name. Default value is `ENDS_WITH` (if applicable).")
  @JsonProperty(JSON_PROPERTY_FILE_NAME_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileNameMatcherEnum getFileNameMatcher() {
    return fileNameMatcher;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileNameMatcher(FileNameMatcherEnum fileNameMatcher) {
    this.fileNameMatcher = fileNameMatcher;
  }


  public DetectionRule className(String className) {
    this.className = className;
    return this;
  }

   /**
   * The fully qualified class or interface to instrument.   Required for Java and .NET custom services.    Not applicable to PHP.
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fully qualified class or interface to instrument.   Required for Java and .NET custom services.    Not applicable to PHP.")
  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClassName() {
    return className;
  }


  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassName(String className) {
    this.className = className;
  }


  public DetectionRule matcher(MatcherEnum matcher) {
    this.matcher = matcher;
    return this;
  }

   /**
   * Matcher applying to the class name. &#x60;STARTS_WITH&#x60; can only be used if there is at least one annotation defined. Default value is &#x60;EQUALS&#x60;.
   * @return matcher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Matcher applying to the class name. `STARTS_WITH` can only be used if there is at least one annotation defined. Default value is `EQUALS`.")
  @JsonProperty(JSON_PROPERTY_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MatcherEnum getMatcher() {
    return matcher;
  }


  @JsonProperty(JSON_PROPERTY_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatcher(MatcherEnum matcher) {
    this.matcher = matcher;
  }


  public DetectionRule methodRules(List<MethodRule> methodRules) {
    this.methodRules = methodRules;
    return this;
  }

  public DetectionRule addMethodRulesItem(MethodRule methodRulesItem) {
    this.methodRules.add(methodRulesItem);
    return this;
  }

   /**
   * List of methods to instrument.
   * @return methodRules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of methods to instrument.")
  @JsonProperty(JSON_PROPERTY_METHOD_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MethodRule> getMethodRules() {
    return methodRules;
  }


  @JsonProperty(JSON_PROPERTY_METHOD_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMethodRules(List<MethodRule> methodRules) {
    this.methodRules = methodRules;
  }


  public DetectionRule annotations(List<String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public DetectionRule addAnnotationsItem(String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Additional annotations filter of the rule.   Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented.   Not applicable to PHP.
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional annotations filter of the rule.   Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented.   Not applicable to PHP.")
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAnnotations() {
    return annotations;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotations(List<String> annotations) {
    this.annotations = annotations;
  }


  /**
   * Return true if this DetectionRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectionRule detectionRule = (DetectionRule) o;
    return Objects.equals(this.id, detectionRule.id) &&
        Objects.equals(this.enabled, detectionRule.enabled) &&
        Objects.equals(this.fileName, detectionRule.fileName) &&
        Objects.equals(this.fileNameMatcher, detectionRule.fileNameMatcher) &&
        Objects.equals(this.className, detectionRule.className) &&
        Objects.equals(this.matcher, detectionRule.matcher) &&
        Objects.equals(this.methodRules, detectionRule.methodRules) &&
        Objects.equals(this.annotations, detectionRule.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, fileName, fileNameMatcher, className, matcher, methodRules, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectionRule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileNameMatcher: ").append(toIndentedString(fileNameMatcher)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    matcher: ").append(toIndentedString(matcher)).append("\n");
    sb.append("    methodRules: ").append(toIndentedString(methodRules)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
