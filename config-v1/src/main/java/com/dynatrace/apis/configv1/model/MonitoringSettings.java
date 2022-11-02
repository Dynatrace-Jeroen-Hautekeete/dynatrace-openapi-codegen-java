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
import com.dynatrace.apis.configv1.model.AdvancedJavaScriptTagSettings;
import com.dynatrace.apis.configv1.model.ContentCapture;
import com.dynatrace.apis.configv1.model.JavaScriptFrameworkSupport;
import com.dynatrace.apis.configv1.model.JavaScriptInjectionRules;
import com.dynatrace.apis.configv1.model.WebApplicationConfigBrowserRestrictionSettings;
import com.dynatrace.apis.configv1.model.WebApplicationConfigIpAddressRestrictionSettings;
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
 * Real user monitoring settings.
 */
@ApiModel(description = "Real user monitoring settings.")
@JsonPropertyOrder({
  MonitoringSettings.JSON_PROPERTY_FETCH_REQUESTS,
  MonitoringSettings.JSON_PROPERTY_XML_HTTP_REQUEST,
  MonitoringSettings.JSON_PROPERTY_JAVA_SCRIPT_FRAMEWORK_SUPPORT,
  MonitoringSettings.JSON_PROPERTY_CONTENT_CAPTURE,
  MonitoringSettings.JSON_PROPERTY_EXCLUDE_XHR_REGEX,
  MonitoringSettings.JSON_PROPERTY_CORRELATION_HEADER_INCLUSION_REGEX,
  MonitoringSettings.JSON_PROPERTY_INJECTION_MODE,
  MonitoringSettings.JSON_PROPERTY_ADD_CROSS_ORIGIN_ANONYMOUS_ATTRIBUTE,
  MonitoringSettings.JSON_PROPERTY_SCRIPT_TAG_CACHE_DURATION_IN_HOURS,
  MonitoringSettings.JSON_PROPERTY_LIBRARY_FILE_LOCATION,
  MonitoringSettings.JSON_PROPERTY_MONITORING_DATA_PATH,
  MonitoringSettings.JSON_PROPERTY_CUSTOM_CONFIGURATION_PROPERTIES,
  MonitoringSettings.JSON_PROPERTY_SERVER_REQUEST_PATH_ID,
  MonitoringSettings.JSON_PROPERTY_SECURE_COOKIE_ATTRIBUTE,
  MonitoringSettings.JSON_PROPERTY_COOKIE_PLACEMENT_DOMAIN,
  MonitoringSettings.JSON_PROPERTY_CACHE_CONTROL_HEADER_OPTIMIZATIONS,
  MonitoringSettings.JSON_PROPERTY_ADVANCED_JAVA_SCRIPT_TAG_SETTINGS,
  MonitoringSettings.JSON_PROPERTY_BROWSER_RESTRICTION_SETTINGS,
  MonitoringSettings.JSON_PROPERTY_IP_ADDRESS_RESTRICTION_SETTINGS,
  MonitoringSettings.JSON_PROPERTY_JAVA_SCRIPT_INJECTION_RULES,
  MonitoringSettings.JSON_PROPERTY_ANGULAR_PACKAGE_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class MonitoringSettings {
  public static final String JSON_PROPERTY_FETCH_REQUESTS = "fetchRequests";
  private Boolean fetchRequests;

  public static final String JSON_PROPERTY_XML_HTTP_REQUEST = "xmlHttpRequest";
  private Boolean xmlHttpRequest;

  public static final String JSON_PROPERTY_JAVA_SCRIPT_FRAMEWORK_SUPPORT = "javaScriptFrameworkSupport";
  private JavaScriptFrameworkSupport javaScriptFrameworkSupport;

  public static final String JSON_PROPERTY_CONTENT_CAPTURE = "contentCapture";
  private ContentCapture contentCapture;

  public static final String JSON_PROPERTY_EXCLUDE_XHR_REGEX = "excludeXhrRegex";
  private String excludeXhrRegex;

  public static final String JSON_PROPERTY_CORRELATION_HEADER_INCLUSION_REGEX = "correlationHeaderInclusionRegex";
  private String correlationHeaderInclusionRegex;

  /**
   * JavaScript injection mode.
   */
  public enum InjectionModeEnum {
    CODE_SNIPPET("CODE_SNIPPET"),
    
    CODE_SNIPPET_ASYNC("CODE_SNIPPET_ASYNC"),
    
    INLINE_CODE("INLINE_CODE"),
    
    JAVASCRIPT_TAG("JAVASCRIPT_TAG");

    private String value;

    InjectionModeEnum(String value) {
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
    public static InjectionModeEnum fromValue(String value) {
      for (InjectionModeEnum b : InjectionModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INJECTION_MODE = "injectionMode";
  private InjectionModeEnum injectionMode;

  public static final String JSON_PROPERTY_ADD_CROSS_ORIGIN_ANONYMOUS_ATTRIBUTE = "addCrossOriginAnonymousAttribute";
  private Boolean addCrossOriginAnonymousAttribute;

  public static final String JSON_PROPERTY_SCRIPT_TAG_CACHE_DURATION_IN_HOURS = "scriptTagCacheDurationInHours";
  private Integer scriptTagCacheDurationInHours;

  public static final String JSON_PROPERTY_LIBRARY_FILE_LOCATION = "libraryFileLocation";
  private String libraryFileLocation;

  public static final String JSON_PROPERTY_MONITORING_DATA_PATH = "monitoringDataPath";
  private String monitoringDataPath;

  public static final String JSON_PROPERTY_CUSTOM_CONFIGURATION_PROPERTIES = "customConfigurationProperties";
  private String customConfigurationProperties;

  public static final String JSON_PROPERTY_SERVER_REQUEST_PATH_ID = "serverRequestPathId";
  private String serverRequestPathId;

  public static final String JSON_PROPERTY_SECURE_COOKIE_ATTRIBUTE = "secureCookieAttribute";
  private Boolean secureCookieAttribute;

  public static final String JSON_PROPERTY_COOKIE_PLACEMENT_DOMAIN = "cookiePlacementDomain";
  private String cookiePlacementDomain;

  public static final String JSON_PROPERTY_CACHE_CONTROL_HEADER_OPTIMIZATIONS = "cacheControlHeaderOptimizations";
  private Boolean cacheControlHeaderOptimizations;

  public static final String JSON_PROPERTY_ADVANCED_JAVA_SCRIPT_TAG_SETTINGS = "advancedJavaScriptTagSettings";
  private AdvancedJavaScriptTagSettings advancedJavaScriptTagSettings;

  public static final String JSON_PROPERTY_BROWSER_RESTRICTION_SETTINGS = "browserRestrictionSettings";
  private WebApplicationConfigBrowserRestrictionSettings browserRestrictionSettings;

  public static final String JSON_PROPERTY_IP_ADDRESS_RESTRICTION_SETTINGS = "ipAddressRestrictionSettings";
  private WebApplicationConfigIpAddressRestrictionSettings ipAddressRestrictionSettings;

  public static final String JSON_PROPERTY_JAVA_SCRIPT_INJECTION_RULES = "javaScriptInjectionRules";
  private List<JavaScriptInjectionRules> javaScriptInjectionRules = null;

  public static final String JSON_PROPERTY_ANGULAR_PACKAGE_NAME = "angularPackageName";
  private String angularPackageName;

  public MonitoringSettings() { 
  }

  public MonitoringSettings fetchRequests(Boolean fetchRequests) {
    this.fetchRequests = fetchRequests;
    return this;
  }

   /**
   * &#x60;fetch()&#x60; request capture enabled/disabled.
   * @return fetchRequests
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`fetch()` request capture enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_FETCH_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFetchRequests() {
    return fetchRequests;
  }


  @JsonProperty(JSON_PROPERTY_FETCH_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFetchRequests(Boolean fetchRequests) {
    this.fetchRequests = fetchRequests;
  }


  public MonitoringSettings xmlHttpRequest(Boolean xmlHttpRequest) {
    this.xmlHttpRequest = xmlHttpRequest;
    return this;
  }

   /**
   * &#x60;XmlHttpRequest&#x60; support enabled/disabled.
   * @return xmlHttpRequest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`XmlHttpRequest` support enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_XML_HTTP_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getXmlHttpRequest() {
    return xmlHttpRequest;
  }


  @JsonProperty(JSON_PROPERTY_XML_HTTP_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setXmlHttpRequest(Boolean xmlHttpRequest) {
    this.xmlHttpRequest = xmlHttpRequest;
  }


  public MonitoringSettings javaScriptFrameworkSupport(JavaScriptFrameworkSupport javaScriptFrameworkSupport) {
    this.javaScriptFrameworkSupport = javaScriptFrameworkSupport;
    return this;
  }

   /**
   * Get javaScriptFrameworkSupport
   * @return javaScriptFrameworkSupport
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_FRAMEWORK_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JavaScriptFrameworkSupport getJavaScriptFrameworkSupport() {
    return javaScriptFrameworkSupport;
  }


  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_FRAMEWORK_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJavaScriptFrameworkSupport(JavaScriptFrameworkSupport javaScriptFrameworkSupport) {
    this.javaScriptFrameworkSupport = javaScriptFrameworkSupport;
  }


  public MonitoringSettings contentCapture(ContentCapture contentCapture) {
    this.contentCapture = contentCapture;
    return this;
  }

   /**
   * Get contentCapture
   * @return contentCapture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContentCapture getContentCapture() {
    return contentCapture;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentCapture(ContentCapture contentCapture) {
    this.contentCapture = contentCapture;
  }


  public MonitoringSettings excludeXhrRegex(String excludeXhrRegex) {
    this.excludeXhrRegex = excludeXhrRegex;
    return this;
  }

   /**
   * You can exclude some actions from becoming XHR actions.  Put a regular expression, matching all the required URLs, here.  If noting specified the feature is disabled.
   * @return excludeXhrRegex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "You can exclude some actions from becoming XHR actions.  Put a regular expression, matching all the required URLs, here.  If noting specified the feature is disabled.")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_XHR_REGEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExcludeXhrRegex() {
    return excludeXhrRegex;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_XHR_REGEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExcludeXhrRegex(String excludeXhrRegex) {
    this.excludeXhrRegex = excludeXhrRegex;
  }


  public MonitoringSettings correlationHeaderInclusionRegex(String correlationHeaderInclusionRegex) {
    this.correlationHeaderInclusionRegex = correlationHeaderInclusionRegex;
    return this;
  }

   /**
   * To enable RUM for XHR calls to AWS Lambda, define a regular expression matching these calls, Dynatrace can then automatically add a custom header (x-dtc) to each such request to the respective endpoints in AWS.  Important: These endpoints must accept the x-dtc header, or the requests will fail. 
   * @return correlationHeaderInclusionRegex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To enable RUM for XHR calls to AWS Lambda, define a regular expression matching these calls, Dynatrace can then automatically add a custom header (x-dtc) to each such request to the respective endpoints in AWS.  Important: These endpoints must accept the x-dtc header, or the requests will fail. ")
  @JsonProperty(JSON_PROPERTY_CORRELATION_HEADER_INCLUSION_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCorrelationHeaderInclusionRegex() {
    return correlationHeaderInclusionRegex;
  }


  @JsonProperty(JSON_PROPERTY_CORRELATION_HEADER_INCLUSION_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorrelationHeaderInclusionRegex(String correlationHeaderInclusionRegex) {
    this.correlationHeaderInclusionRegex = correlationHeaderInclusionRegex;
  }


  public MonitoringSettings injectionMode(InjectionModeEnum injectionMode) {
    this.injectionMode = injectionMode;
    return this;
  }

   /**
   * JavaScript injection mode.
   * @return injectionMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "JavaScript injection mode.")
  @JsonProperty(JSON_PROPERTY_INJECTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InjectionModeEnum getInjectionMode() {
    return injectionMode;
  }


  @JsonProperty(JSON_PROPERTY_INJECTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInjectionMode(InjectionModeEnum injectionMode) {
    this.injectionMode = injectionMode;
  }


  public MonitoringSettings addCrossOriginAnonymousAttribute(Boolean addCrossOriginAnonymousAttribute) {
    this.addCrossOriginAnonymousAttribute = addCrossOriginAnonymousAttribute;
    return this;
  }

   /**
   * Add the cross origin &#x3D; anonymous attribute to capture JavaScript error messages and W3C resource timings.
   * @return addCrossOriginAnonymousAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add the cross origin = anonymous attribute to capture JavaScript error messages and W3C resource timings.")
  @JsonProperty(JSON_PROPERTY_ADD_CROSS_ORIGIN_ANONYMOUS_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddCrossOriginAnonymousAttribute() {
    return addCrossOriginAnonymousAttribute;
  }


  @JsonProperty(JSON_PROPERTY_ADD_CROSS_ORIGIN_ANONYMOUS_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddCrossOriginAnonymousAttribute(Boolean addCrossOriginAnonymousAttribute) {
    this.addCrossOriginAnonymousAttribute = addCrossOriginAnonymousAttribute;
  }


  public MonitoringSettings scriptTagCacheDurationInHours(Integer scriptTagCacheDurationInHours) {
    this.scriptTagCacheDurationInHours = scriptTagCacheDurationInHours;
    return this;
  }

   /**
   * Time duration for the cache settings.
   * @return scriptTagCacheDurationInHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time duration for the cache settings.")
  @JsonProperty(JSON_PROPERTY_SCRIPT_TAG_CACHE_DURATION_IN_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScriptTagCacheDurationInHours() {
    return scriptTagCacheDurationInHours;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT_TAG_CACHE_DURATION_IN_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScriptTagCacheDurationInHours(Integer scriptTagCacheDurationInHours) {
    this.scriptTagCacheDurationInHours = scriptTagCacheDurationInHours;
  }


  public MonitoringSettings libraryFileLocation(String libraryFileLocation) {
    this.libraryFileLocation = libraryFileLocation;
    return this;
  }

   /**
   * The location of your application’s custom JavaScript library file.    If nothing specified the root directory of your web server is used.    **Required** for auto-injected applications, not supported by agentless applications.
   * @return libraryFileLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location of your application’s custom JavaScript library file.    If nothing specified the root directory of your web server is used.    **Required** for auto-injected applications, not supported by agentless applications.")
  @JsonProperty(JSON_PROPERTY_LIBRARY_FILE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLibraryFileLocation() {
    return libraryFileLocation;
  }


  @JsonProperty(JSON_PROPERTY_LIBRARY_FILE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLibraryFileLocation(String libraryFileLocation) {
    this.libraryFileLocation = libraryFileLocation;
  }


  public MonitoringSettings monitoringDataPath(String monitoringDataPath) {
    this.monitoringDataPath = monitoringDataPath;
    return this;
  }

   /**
   * The location to send monitoring data from the JavaScript tag.   Specify either a relative or an absolute URL. If you use an absolute URL, data will be sent using CORS.    **Required** for auto-injected applications, optional for agentless applications.
   * @return monitoringDataPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location to send monitoring data from the JavaScript tag.   Specify either a relative or an absolute URL. If you use an absolute URL, data will be sent using CORS.    **Required** for auto-injected applications, optional for agentless applications.")
  @JsonProperty(JSON_PROPERTY_MONITORING_DATA_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitoringDataPath() {
    return monitoringDataPath;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING_DATA_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitoringDataPath(String monitoringDataPath) {
    this.monitoringDataPath = monitoringDataPath;
  }


  public MonitoringSettings customConfigurationProperties(String customConfigurationProperties) {
    this.customConfigurationProperties = customConfigurationProperties;
    return this;
  }

   /**
   * Additional JavaScript tag properties that are specific to your application. To do this, type key&#x3D;value pairs separated using a (|) symbol.
   * @return customConfigurationProperties
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Additional JavaScript tag properties that are specific to your application. To do this, type key=value pairs separated using a (|) symbol.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_CONFIGURATION_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomConfigurationProperties() {
    return customConfigurationProperties;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_CONFIGURATION_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomConfigurationProperties(String customConfigurationProperties) {
    this.customConfigurationProperties = customConfigurationProperties;
  }


  public MonitoringSettings serverRequestPathId(String serverRequestPathId) {
    this.serverRequestPathId = serverRequestPathId;
    return this;
  }

   /**
   * Path to identify the server’s request ID.
   * @return serverRequestPathId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Path to identify the server’s request ID.")
  @JsonProperty(JSON_PROPERTY_SERVER_REQUEST_PATH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServerRequestPathId() {
    return serverRequestPathId;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_REQUEST_PATH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerRequestPathId(String serverRequestPathId) {
    this.serverRequestPathId = serverRequestPathId;
  }


  public MonitoringSettings secureCookieAttribute(Boolean secureCookieAttribute) {
    this.secureCookieAttribute = secureCookieAttribute;
    return this;
  }

   /**
   * Secure attribute usage for Dynatrace cookies enabled/disabled.
   * @return secureCookieAttribute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Secure attribute usage for Dynatrace cookies enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_SECURE_COOKIE_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSecureCookieAttribute() {
    return secureCookieAttribute;
  }


  @JsonProperty(JSON_PROPERTY_SECURE_COOKIE_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecureCookieAttribute(Boolean secureCookieAttribute) {
    this.secureCookieAttribute = secureCookieAttribute;
  }


  public MonitoringSettings cookiePlacementDomain(String cookiePlacementDomain) {
    this.cookiePlacementDomain = cookiePlacementDomain;
    return this;
  }

   /**
   * Domain for cookie placement.
   * @return cookiePlacementDomain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Domain for cookie placement.")
  @JsonProperty(JSON_PROPERTY_COOKIE_PLACEMENT_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCookiePlacementDomain() {
    return cookiePlacementDomain;
  }


  @JsonProperty(JSON_PROPERTY_COOKIE_PLACEMENT_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCookiePlacementDomain(String cookiePlacementDomain) {
    this.cookiePlacementDomain = cookiePlacementDomain;
  }


  public MonitoringSettings cacheControlHeaderOptimizations(Boolean cacheControlHeaderOptimizations) {
    this.cacheControlHeaderOptimizations = cacheControlHeaderOptimizations;
    return this;
  }

   /**
   * Optimize the value of cache control headers for use with Dynatrace real user monitoring enabled/disabled.
   * @return cacheControlHeaderOptimizations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Optimize the value of cache control headers for use with Dynatrace real user monitoring enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_CACHE_CONTROL_HEADER_OPTIMIZATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCacheControlHeaderOptimizations() {
    return cacheControlHeaderOptimizations;
  }


  @JsonProperty(JSON_PROPERTY_CACHE_CONTROL_HEADER_OPTIMIZATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCacheControlHeaderOptimizations(Boolean cacheControlHeaderOptimizations) {
    this.cacheControlHeaderOptimizations = cacheControlHeaderOptimizations;
  }


  public MonitoringSettings advancedJavaScriptTagSettings(AdvancedJavaScriptTagSettings advancedJavaScriptTagSettings) {
    this.advancedJavaScriptTagSettings = advancedJavaScriptTagSettings;
    return this;
  }

   /**
   * Get advancedJavaScriptTagSettings
   * @return advancedJavaScriptTagSettings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADVANCED_JAVA_SCRIPT_TAG_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AdvancedJavaScriptTagSettings getAdvancedJavaScriptTagSettings() {
    return advancedJavaScriptTagSettings;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCED_JAVA_SCRIPT_TAG_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdvancedJavaScriptTagSettings(AdvancedJavaScriptTagSettings advancedJavaScriptTagSettings) {
    this.advancedJavaScriptTagSettings = advancedJavaScriptTagSettings;
  }


  public MonitoringSettings browserRestrictionSettings(WebApplicationConfigBrowserRestrictionSettings browserRestrictionSettings) {
    this.browserRestrictionSettings = browserRestrictionSettings;
    return this;
  }

   /**
   * Get browserRestrictionSettings
   * @return browserRestrictionSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BROWSER_RESTRICTION_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebApplicationConfigBrowserRestrictionSettings getBrowserRestrictionSettings() {
    return browserRestrictionSettings;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_RESTRICTION_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowserRestrictionSettings(WebApplicationConfigBrowserRestrictionSettings browserRestrictionSettings) {
    this.browserRestrictionSettings = browserRestrictionSettings;
  }


  public MonitoringSettings ipAddressRestrictionSettings(WebApplicationConfigIpAddressRestrictionSettings ipAddressRestrictionSettings) {
    this.ipAddressRestrictionSettings = ipAddressRestrictionSettings;
    return this;
  }

   /**
   * Get ipAddressRestrictionSettings
   * @return ipAddressRestrictionSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_RESTRICTION_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebApplicationConfigIpAddressRestrictionSettings getIpAddressRestrictionSettings() {
    return ipAddressRestrictionSettings;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_RESTRICTION_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddressRestrictionSettings(WebApplicationConfigIpAddressRestrictionSettings ipAddressRestrictionSettings) {
    this.ipAddressRestrictionSettings = ipAddressRestrictionSettings;
  }


  public MonitoringSettings javaScriptInjectionRules(List<JavaScriptInjectionRules> javaScriptInjectionRules) {
    this.javaScriptInjectionRules = javaScriptInjectionRules;
    return this;
  }

  public MonitoringSettings addJavaScriptInjectionRulesItem(JavaScriptInjectionRules javaScriptInjectionRulesItem) {
    if (this.javaScriptInjectionRules == null) {
      this.javaScriptInjectionRules = new ArrayList<>();
    }
    this.javaScriptInjectionRules.add(javaScriptInjectionRulesItem);
    return this;
  }

   /**
   * Java script injection rules.
   * @return javaScriptInjectionRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Java script injection rules.")
  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_INJECTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<JavaScriptInjectionRules> getJavaScriptInjectionRules() {
    return javaScriptInjectionRules;
  }


  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_INJECTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJavaScriptInjectionRules(List<JavaScriptInjectionRules> javaScriptInjectionRules) {
    this.javaScriptInjectionRules = javaScriptInjectionRules;
  }


  public MonitoringSettings angularPackageName(String angularPackageName) {
    this.angularPackageName = angularPackageName;
    return this;
  }

   /**
   * The name of the angular package.
   * @return angularPackageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the angular package.")
  @JsonProperty(JSON_PROPERTY_ANGULAR_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAngularPackageName() {
    return angularPackageName;
  }


  @JsonProperty(JSON_PROPERTY_ANGULAR_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAngularPackageName(String angularPackageName) {
    this.angularPackageName = angularPackageName;
  }


  /**
   * Return true if this MonitoringSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringSettings monitoringSettings = (MonitoringSettings) o;
    return Objects.equals(this.fetchRequests, monitoringSettings.fetchRequests) &&
        Objects.equals(this.xmlHttpRequest, monitoringSettings.xmlHttpRequest) &&
        Objects.equals(this.javaScriptFrameworkSupport, monitoringSettings.javaScriptFrameworkSupport) &&
        Objects.equals(this.contentCapture, monitoringSettings.contentCapture) &&
        Objects.equals(this.excludeXhrRegex, monitoringSettings.excludeXhrRegex) &&
        Objects.equals(this.correlationHeaderInclusionRegex, monitoringSettings.correlationHeaderInclusionRegex) &&
        Objects.equals(this.injectionMode, monitoringSettings.injectionMode) &&
        Objects.equals(this.addCrossOriginAnonymousAttribute, monitoringSettings.addCrossOriginAnonymousAttribute) &&
        Objects.equals(this.scriptTagCacheDurationInHours, monitoringSettings.scriptTagCacheDurationInHours) &&
        Objects.equals(this.libraryFileLocation, monitoringSettings.libraryFileLocation) &&
        Objects.equals(this.monitoringDataPath, monitoringSettings.monitoringDataPath) &&
        Objects.equals(this.customConfigurationProperties, monitoringSettings.customConfigurationProperties) &&
        Objects.equals(this.serverRequestPathId, monitoringSettings.serverRequestPathId) &&
        Objects.equals(this.secureCookieAttribute, monitoringSettings.secureCookieAttribute) &&
        Objects.equals(this.cookiePlacementDomain, monitoringSettings.cookiePlacementDomain) &&
        Objects.equals(this.cacheControlHeaderOptimizations, monitoringSettings.cacheControlHeaderOptimizations) &&
        Objects.equals(this.advancedJavaScriptTagSettings, monitoringSettings.advancedJavaScriptTagSettings) &&
        Objects.equals(this.browserRestrictionSettings, monitoringSettings.browserRestrictionSettings) &&
        Objects.equals(this.ipAddressRestrictionSettings, monitoringSettings.ipAddressRestrictionSettings) &&
        Objects.equals(this.javaScriptInjectionRules, monitoringSettings.javaScriptInjectionRules) &&
        Objects.equals(this.angularPackageName, monitoringSettings.angularPackageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fetchRequests, xmlHttpRequest, javaScriptFrameworkSupport, contentCapture, excludeXhrRegex, correlationHeaderInclusionRegex, injectionMode, addCrossOriginAnonymousAttribute, scriptTagCacheDurationInHours, libraryFileLocation, monitoringDataPath, customConfigurationProperties, serverRequestPathId, secureCookieAttribute, cookiePlacementDomain, cacheControlHeaderOptimizations, advancedJavaScriptTagSettings, browserRestrictionSettings, ipAddressRestrictionSettings, javaScriptInjectionRules, angularPackageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringSettings {\n");
    sb.append("    fetchRequests: ").append(toIndentedString(fetchRequests)).append("\n");
    sb.append("    xmlHttpRequest: ").append(toIndentedString(xmlHttpRequest)).append("\n");
    sb.append("    javaScriptFrameworkSupport: ").append(toIndentedString(javaScriptFrameworkSupport)).append("\n");
    sb.append("    contentCapture: ").append(toIndentedString(contentCapture)).append("\n");
    sb.append("    excludeXhrRegex: ").append(toIndentedString(excludeXhrRegex)).append("\n");
    sb.append("    correlationHeaderInclusionRegex: ").append(toIndentedString(correlationHeaderInclusionRegex)).append("\n");
    sb.append("    injectionMode: ").append(toIndentedString(injectionMode)).append("\n");
    sb.append("    addCrossOriginAnonymousAttribute: ").append(toIndentedString(addCrossOriginAnonymousAttribute)).append("\n");
    sb.append("    scriptTagCacheDurationInHours: ").append(toIndentedString(scriptTagCacheDurationInHours)).append("\n");
    sb.append("    libraryFileLocation: ").append(toIndentedString(libraryFileLocation)).append("\n");
    sb.append("    monitoringDataPath: ").append(toIndentedString(monitoringDataPath)).append("\n");
    sb.append("    customConfigurationProperties: ").append(toIndentedString(customConfigurationProperties)).append("\n");
    sb.append("    serverRequestPathId: ").append(toIndentedString(serverRequestPathId)).append("\n");
    sb.append("    secureCookieAttribute: ").append(toIndentedString(secureCookieAttribute)).append("\n");
    sb.append("    cookiePlacementDomain: ").append(toIndentedString(cookiePlacementDomain)).append("\n");
    sb.append("    cacheControlHeaderOptimizations: ").append(toIndentedString(cacheControlHeaderOptimizations)).append("\n");
    sb.append("    advancedJavaScriptTagSettings: ").append(toIndentedString(advancedJavaScriptTagSettings)).append("\n");
    sb.append("    browserRestrictionSettings: ").append(toIndentedString(browserRestrictionSettings)).append("\n");
    sb.append("    ipAddressRestrictionSettings: ").append(toIndentedString(ipAddressRestrictionSettings)).append("\n");
    sb.append("    javaScriptInjectionRules: ").append(toIndentedString(javaScriptInjectionRules)).append("\n");
    sb.append("    angularPackageName: ").append(toIndentedString(angularPackageName)).append("\n");
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
