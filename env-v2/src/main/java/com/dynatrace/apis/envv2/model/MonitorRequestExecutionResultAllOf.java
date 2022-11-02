/*
 * Dynatrace Environment API
 *  Documentation of the Dynatrace Environment API v2. Resources here generally supersede those in v1. Migration of resources from v1 is in progress.   If you miss a resource, consider using the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/2u23k1k) .  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv2.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.dynatrace.apis.envv2.model.MonitorRequestHeader;
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
 * MonitorRequestExecutionResultAllOf
 */
@JsonPropertyOrder({
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_REQUEST_ID,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_REQUEST_NAME,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_SEQUENCE_NUMBER,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_START_TIMESTAMP,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_ENGINE_ID,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_PUBLIC_LOCATION,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_URL,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_METHOD,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_REQUEST_BODY,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_REQUEST_HEADERS,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_RESPONSE_STATUS_CODE,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_RESPONSE_BODY,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_RESPONSE_SIZE,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_RESPONSE_BODY_SIZE_LIMIT_EXCEEDED,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_RESPONSE_HEADERS,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_RESOLVED_IPS,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_HEALTH_STATUS_CODE,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_HEALTH_STATUS,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_RESPONSE_MESSAGE,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_PEER_CERTIFICATE_EXPIRY_DATE,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_PEER_CERTIFICATE_DETAILS,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_TOTAL_TIME,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_HOST_NAME_RESOLUTION_TIME,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_TCP_CONNECT_TIME,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_TLS_HANDSHAKE_TIME,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_TIME_TO_FIRST_BYTE,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_REDIRECTION_TIME,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_WAITING_TIME,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_REDIRECTS_COUNT,
  MonitorRequestExecutionResultAllOf.JSON_PROPERTY_FAILURE_MESSAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class MonitorRequestExecutionResultAllOf {
  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_REQUEST_NAME = "requestName";
  private String requestName;

  public static final String JSON_PROPERTY_SEQUENCE_NUMBER = "sequenceNumber";
  private Integer sequenceNumber;

  public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
  private Long startTimestamp;

  public static final String JSON_PROPERTY_ENGINE_ID = "engineId";
  private Long engineId;

  public static final String JSON_PROPERTY_PUBLIC_LOCATION = "publicLocation";
  private Boolean publicLocation;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_REQUEST_BODY = "requestBody";
  private String requestBody;

  public static final String JSON_PROPERTY_REQUEST_HEADERS = "requestHeaders";
  private List<MonitorRequestHeader> requestHeaders = null;

  public static final String JSON_PROPERTY_RESPONSE_STATUS_CODE = "responseStatusCode";
  private Integer responseStatusCode;

  public static final String JSON_PROPERTY_RESPONSE_BODY = "responseBody";
  private String responseBody;

  public static final String JSON_PROPERTY_RESPONSE_SIZE = "responseSize";
  private Long responseSize;

  public static final String JSON_PROPERTY_RESPONSE_BODY_SIZE_LIMIT_EXCEEDED = "responseBodySizeLimitExceeded";
  private Boolean responseBodySizeLimitExceeded;

  public static final String JSON_PROPERTY_RESPONSE_HEADERS = "responseHeaders";
  private List<MonitorRequestHeader> responseHeaders = null;

  public static final String JSON_PROPERTY_RESOLVED_IPS = "resolvedIps";
  private List<String> resolvedIps = null;

  public static final String JSON_PROPERTY_HEALTH_STATUS_CODE = "healthStatusCode";
  private Integer healthStatusCode;

  public static final String JSON_PROPERTY_HEALTH_STATUS = "healthStatus";
  private String healthStatus;

  public static final String JSON_PROPERTY_RESPONSE_MESSAGE = "responseMessage";
  private String responseMessage;

  public static final String JSON_PROPERTY_PEER_CERTIFICATE_EXPIRY_DATE = "peerCertificateExpiryDate";
  private Long peerCertificateExpiryDate;

  public static final String JSON_PROPERTY_PEER_CERTIFICATE_DETAILS = "peerCertificateDetails";
  private String peerCertificateDetails;

  public static final String JSON_PROPERTY_TOTAL_TIME = "totalTime";
  private Long totalTime;

  public static final String JSON_PROPERTY_HOST_NAME_RESOLUTION_TIME = "hostNameResolutionTime";
  private Long hostNameResolutionTime;

  public static final String JSON_PROPERTY_TCP_CONNECT_TIME = "tcpConnectTime";
  private Long tcpConnectTime;

  public static final String JSON_PROPERTY_TLS_HANDSHAKE_TIME = "tlsHandshakeTime";
  private Long tlsHandshakeTime;

  public static final String JSON_PROPERTY_TIME_TO_FIRST_BYTE = "timeToFirstByte";
  private Long timeToFirstByte;

  public static final String JSON_PROPERTY_REDIRECTION_TIME = "redirectionTime";
  private Long redirectionTime;

  public static final String JSON_PROPERTY_WAITING_TIME = "waitingTime";
  private Long waitingTime;

  public static final String JSON_PROPERTY_REDIRECTS_COUNT = "redirectsCount";
  private Integer redirectsCount;

  public static final String JSON_PROPERTY_FAILURE_MESSAGE = "failureMessage";
  private String failureMessage;

  public MonitorRequestExecutionResultAllOf() { 
  }

  public MonitorRequestExecutionResultAllOf requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Request id.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request id.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public MonitorRequestExecutionResultAllOf requestName(String requestName) {
    this.requestName = requestName;
    return this;
  }

   /**
   * Request name.
   * @return requestName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request name.")
  @JsonProperty(JSON_PROPERTY_REQUEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestName() {
    return requestName;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestName(String requestName) {
    this.requestName = requestName;
  }


  public MonitorRequestExecutionResultAllOf sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Request&#39;s sequence number.
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's sequence number.")
  @JsonProperty(JSON_PROPERTY_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSequenceNumber() {
    return sequenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public MonitorRequestExecutionResultAllOf startTimestamp(Long startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

   /**
   * Request start timestamp.
   * @return startTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request start timestamp.")
  @JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartTimestamp() {
    return startTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTimestamp(Long startTimestamp) {
    this.startTimestamp = startTimestamp;
  }


  public MonitorRequestExecutionResultAllOf engineId(Long engineId) {
    this.engineId = engineId;
    return this;
  }

   /**
   * VUC&#39;s id on which monitor&#39;s request was executed.
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VUC's id on which monitor's request was executed.")
  @JsonProperty(JSON_PROPERTY_ENGINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEngineId() {
    return engineId;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineId(Long engineId) {
    this.engineId = engineId;
  }


  public MonitorRequestExecutionResultAllOf publicLocation(Boolean publicLocation) {
    this.publicLocation = publicLocation;
    return this;
  }

   /**
   * Flag informs whether request was executed on public location.
   * @return publicLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag informs whether request was executed on public location.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublicLocation() {
    return publicLocation;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicLocation(Boolean publicLocation) {
    this.publicLocation = publicLocation;
  }


  public MonitorRequestExecutionResultAllOf url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Request URL address.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request URL address.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public MonitorRequestExecutionResultAllOf method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Request method type.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request method type.")
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(String method) {
    this.method = method;
  }


  public MonitorRequestExecutionResultAllOf requestBody(String requestBody) {
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Request&#39;s request body.
   * @return requestBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's request body.")
  @JsonProperty(JSON_PROPERTY_REQUEST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestBody() {
    return requestBody;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestBody(String requestBody) {
    this.requestBody = requestBody;
  }


  public MonitorRequestExecutionResultAllOf requestHeaders(List<MonitorRequestHeader> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public MonitorRequestExecutionResultAllOf addRequestHeadersItem(MonitorRequestHeader requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new ArrayList<>();
    }
    this.requestHeaders.add(requestHeadersItem);
    return this;
  }

   /**
   * A list of request&#39;s headers
   * @return requestHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of request's headers")
  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MonitorRequestHeader> getRequestHeaders() {
    return requestHeaders;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestHeaders(List<MonitorRequestHeader> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }


  public MonitorRequestExecutionResultAllOf responseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * Request&#39;s response status code.
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's response status code.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public MonitorRequestExecutionResultAllOf responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Request&#39;s response body.
   * @return responseBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's response body.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResponseBody() {
    return responseBody;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }


  public MonitorRequestExecutionResultAllOf responseSize(Long responseSize) {
    this.responseSize = responseSize;
    return this;
  }

   /**
   * Request&#39;s response size in bytes.
   * @return responseSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's response size in bytes.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResponseSize() {
    return responseSize;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseSize(Long responseSize) {
    this.responseSize = responseSize;
  }


  public MonitorRequestExecutionResultAllOf responseBodySizeLimitExceeded(Boolean responseBodySizeLimitExceeded) {
    this.responseBodySizeLimitExceeded = responseBodySizeLimitExceeded;
    return this;
  }

   /**
   * A flag indicating that the response payload size limit of 10MB has been exceeded.
   * @return responseBodySizeLimitExceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating that the response payload size limit of 10MB has been exceeded.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY_SIZE_LIMIT_EXCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResponseBodySizeLimitExceeded() {
    return responseBodySizeLimitExceeded;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY_SIZE_LIMIT_EXCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseBodySizeLimitExceeded(Boolean responseBodySizeLimitExceeded) {
    this.responseBodySizeLimitExceeded = responseBodySizeLimitExceeded;
  }


  public MonitorRequestExecutionResultAllOf responseHeaders(List<MonitorRequestHeader> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public MonitorRequestExecutionResultAllOf addResponseHeadersItem(MonitorRequestHeader responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new ArrayList<>();
    }
    this.responseHeaders.add(responseHeadersItem);
    return this;
  }

   /**
   * A list of request&#39;s response headers
   * @return responseHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of request's response headers")
  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MonitorRequestHeader> getResponseHeaders() {
    return responseHeaders;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseHeaders(List<MonitorRequestHeader> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }


  public MonitorRequestExecutionResultAllOf resolvedIps(List<String> resolvedIps) {
    this.resolvedIps = resolvedIps;
    return this;
  }

  public MonitorRequestExecutionResultAllOf addResolvedIpsItem(String resolvedIpsItem) {
    if (this.resolvedIps == null) {
      this.resolvedIps = new ArrayList<>();
    }
    this.resolvedIps.add(resolvedIpsItem);
    return this;
  }

   /**
   * Request&#39;s resolved ips.&#39;
   * @return resolvedIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's resolved ips.'")
  @JsonProperty(JSON_PROPERTY_RESOLVED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getResolvedIps() {
    return resolvedIps;
  }


  @JsonProperty(JSON_PROPERTY_RESOLVED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolvedIps(List<String> resolvedIps) {
    this.resolvedIps = resolvedIps;
  }


  public MonitorRequestExecutionResultAllOf healthStatusCode(Integer healthStatusCode) {
    this.healthStatusCode = healthStatusCode;
    return this;
  }

   /**
   * Request&#39;s health status code.
   * @return healthStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's health status code.")
  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHealthStatusCode() {
    return healthStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthStatusCode(Integer healthStatusCode) {
    this.healthStatusCode = healthStatusCode;
  }


  public MonitorRequestExecutionResultAllOf healthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

   /**
   * Request&#39;s health status.
   * @return healthStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's health status.")
  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHealthStatus() {
    return healthStatus;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
  }


  public MonitorRequestExecutionResultAllOf responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Request&#39;s response message.&#39;
   * @return responseMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's response message.'")
  @JsonProperty(JSON_PROPERTY_RESPONSE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResponseMessage() {
    return responseMessage;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }


  public MonitorRequestExecutionResultAllOf peerCertificateExpiryDate(Long peerCertificateExpiryDate) {
    this.peerCertificateExpiryDate = peerCertificateExpiryDate;
    return this;
  }

   /**
   * An expiry date of the first SSL certificate from the certificate chain.
   * @return peerCertificateExpiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An expiry date of the first SSL certificate from the certificate chain.")
  @JsonProperty(JSON_PROPERTY_PEER_CERTIFICATE_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPeerCertificateExpiryDate() {
    return peerCertificateExpiryDate;
  }


  @JsonProperty(JSON_PROPERTY_PEER_CERTIFICATE_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeerCertificateExpiryDate(Long peerCertificateExpiryDate) {
    this.peerCertificateExpiryDate = peerCertificateExpiryDate;
  }


  public MonitorRequestExecutionResultAllOf peerCertificateDetails(String peerCertificateDetails) {
    this.peerCertificateDetails = peerCertificateDetails;
    return this;
  }

   /**
   * Request&#39;s certificate details.
   * @return peerCertificateDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's certificate details.")
  @JsonProperty(JSON_PROPERTY_PEER_CERTIFICATE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeerCertificateDetails() {
    return peerCertificateDetails;
  }


  @JsonProperty(JSON_PROPERTY_PEER_CERTIFICATE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeerCertificateDetails(String peerCertificateDetails) {
    this.peerCertificateDetails = peerCertificateDetails;
  }


  public MonitorRequestExecutionResultAllOf totalTime(Long totalTime) {
    this.totalTime = totalTime;
    return this;
  }

   /**
   * A total request time measured in ms.
   * @return totalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A total request time measured in ms.")
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalTime() {
    return totalTime;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalTime(Long totalTime) {
    this.totalTime = totalTime;
  }


  public MonitorRequestExecutionResultAllOf hostNameResolutionTime(Long hostNameResolutionTime) {
    this.hostNameResolutionTime = hostNameResolutionTime;
    return this;
  }

   /**
   * A hostname resolution time measured in ms.
   * @return hostNameResolutionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A hostname resolution time measured in ms.")
  @JsonProperty(JSON_PROPERTY_HOST_NAME_RESOLUTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHostNameResolutionTime() {
    return hostNameResolutionTime;
  }


  @JsonProperty(JSON_PROPERTY_HOST_NAME_RESOLUTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostNameResolutionTime(Long hostNameResolutionTime) {
    this.hostNameResolutionTime = hostNameResolutionTime;
  }


  public MonitorRequestExecutionResultAllOf tcpConnectTime(Long tcpConnectTime) {
    this.tcpConnectTime = tcpConnectTime;
    return this;
  }

   /**
   * A TCP connect time measured in ms.
   * @return tcpConnectTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A TCP connect time measured in ms.")
  @JsonProperty(JSON_PROPERTY_TCP_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTcpConnectTime() {
    return tcpConnectTime;
  }


  @JsonProperty(JSON_PROPERTY_TCP_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTcpConnectTime(Long tcpConnectTime) {
    this.tcpConnectTime = tcpConnectTime;
  }


  public MonitorRequestExecutionResultAllOf tlsHandshakeTime(Long tlsHandshakeTime) {
    this.tlsHandshakeTime = tlsHandshakeTime;
    return this;
  }

   /**
   * A TLS handshake time measured in ms.
   * @return tlsHandshakeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A TLS handshake time measured in ms.")
  @JsonProperty(JSON_PROPERTY_TLS_HANDSHAKE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTlsHandshakeTime() {
    return tlsHandshakeTime;
  }


  @JsonProperty(JSON_PROPERTY_TLS_HANDSHAKE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTlsHandshakeTime(Long tlsHandshakeTime) {
    this.tlsHandshakeTime = tlsHandshakeTime;
  }


  public MonitorRequestExecutionResultAllOf timeToFirstByte(Long timeToFirstByte) {
    this.timeToFirstByte = timeToFirstByte;
    return this;
  }

   /**
   * A time to first byte measured in ms.
   * @return timeToFirstByte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A time to first byte measured in ms.")
  @JsonProperty(JSON_PROPERTY_TIME_TO_FIRST_BYTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimeToFirstByte() {
    return timeToFirstByte;
  }


  @JsonProperty(JSON_PROPERTY_TIME_TO_FIRST_BYTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeToFirstByte(Long timeToFirstByte) {
    this.timeToFirstByte = timeToFirstByte;
  }


  public MonitorRequestExecutionResultAllOf redirectionTime(Long redirectionTime) {
    this.redirectionTime = redirectionTime;
    return this;
  }

   /**
   * Total number of milliseconds spent on handling all redirect requests, measured in ms.
   * @return redirectionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of milliseconds spent on handling all redirect requests, measured in ms.")
  @JsonProperty(JSON_PROPERTY_REDIRECTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRedirectionTime() {
    return redirectionTime;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectionTime(Long redirectionTime) {
    this.redirectionTime = redirectionTime;
  }


  public MonitorRequestExecutionResultAllOf waitingTime(Long waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

   /**
   * Waiting time (time to first byte - (DNS lookup time + TCP connect time + TLS handshake time), measured in ms.
   * @return waitingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Waiting time (time to first byte - (DNS lookup time + TCP connect time + TLS handshake time), measured in ms.")
  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWaitingTime() {
    return waitingTime;
  }


  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitingTime(Long waitingTime) {
    this.waitingTime = waitingTime;
  }


  public MonitorRequestExecutionResultAllOf redirectsCount(Integer redirectsCount) {
    this.redirectsCount = redirectsCount;
    return this;
  }

   /**
   * Number of request&#39;s redirects.
   * @return redirectsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of request's redirects.")
  @JsonProperty(JSON_PROPERTY_REDIRECTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRedirectsCount() {
    return redirectsCount;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECTS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectsCount(Integer redirectsCount) {
    this.redirectsCount = redirectsCount;
  }


  public MonitorRequestExecutionResultAllOf failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Request&#39;s failure message.
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request's failure message.")
  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureMessage() {
    return failureMessage;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  /**
   * Return true if this MonitorRequestExecutionResult_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorRequestExecutionResultAllOf monitorRequestExecutionResultAllOf = (MonitorRequestExecutionResultAllOf) o;
    return Objects.equals(this.requestId, monitorRequestExecutionResultAllOf.requestId) &&
        Objects.equals(this.requestName, monitorRequestExecutionResultAllOf.requestName) &&
        Objects.equals(this.sequenceNumber, monitorRequestExecutionResultAllOf.sequenceNumber) &&
        Objects.equals(this.startTimestamp, monitorRequestExecutionResultAllOf.startTimestamp) &&
        Objects.equals(this.engineId, monitorRequestExecutionResultAllOf.engineId) &&
        Objects.equals(this.publicLocation, monitorRequestExecutionResultAllOf.publicLocation) &&
        Objects.equals(this.url, monitorRequestExecutionResultAllOf.url) &&
        Objects.equals(this.method, monitorRequestExecutionResultAllOf.method) &&
        Objects.equals(this.requestBody, monitorRequestExecutionResultAllOf.requestBody) &&
        Objects.equals(this.requestHeaders, monitorRequestExecutionResultAllOf.requestHeaders) &&
        Objects.equals(this.responseStatusCode, monitorRequestExecutionResultAllOf.responseStatusCode) &&
        Objects.equals(this.responseBody, monitorRequestExecutionResultAllOf.responseBody) &&
        Objects.equals(this.responseSize, monitorRequestExecutionResultAllOf.responseSize) &&
        Objects.equals(this.responseBodySizeLimitExceeded, monitorRequestExecutionResultAllOf.responseBodySizeLimitExceeded) &&
        Objects.equals(this.responseHeaders, monitorRequestExecutionResultAllOf.responseHeaders) &&
        Objects.equals(this.resolvedIps, monitorRequestExecutionResultAllOf.resolvedIps) &&
        Objects.equals(this.healthStatusCode, monitorRequestExecutionResultAllOf.healthStatusCode) &&
        Objects.equals(this.healthStatus, monitorRequestExecutionResultAllOf.healthStatus) &&
        Objects.equals(this.responseMessage, monitorRequestExecutionResultAllOf.responseMessage) &&
        Objects.equals(this.peerCertificateExpiryDate, monitorRequestExecutionResultAllOf.peerCertificateExpiryDate) &&
        Objects.equals(this.peerCertificateDetails, monitorRequestExecutionResultAllOf.peerCertificateDetails) &&
        Objects.equals(this.totalTime, monitorRequestExecutionResultAllOf.totalTime) &&
        Objects.equals(this.hostNameResolutionTime, monitorRequestExecutionResultAllOf.hostNameResolutionTime) &&
        Objects.equals(this.tcpConnectTime, monitorRequestExecutionResultAllOf.tcpConnectTime) &&
        Objects.equals(this.tlsHandshakeTime, monitorRequestExecutionResultAllOf.tlsHandshakeTime) &&
        Objects.equals(this.timeToFirstByte, monitorRequestExecutionResultAllOf.timeToFirstByte) &&
        Objects.equals(this.redirectionTime, monitorRequestExecutionResultAllOf.redirectionTime) &&
        Objects.equals(this.waitingTime, monitorRequestExecutionResultAllOf.waitingTime) &&
        Objects.equals(this.redirectsCount, monitorRequestExecutionResultAllOf.redirectsCount) &&
        Objects.equals(this.failureMessage, monitorRequestExecutionResultAllOf.failureMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, requestName, sequenceNumber, startTimestamp, engineId, publicLocation, url, method, requestBody, requestHeaders, responseStatusCode, responseBody, responseSize, responseBodySizeLimitExceeded, responseHeaders, resolvedIps, healthStatusCode, healthStatus, responseMessage, peerCertificateExpiryDate, peerCertificateDetails, totalTime, hostNameResolutionTime, tcpConnectTime, tlsHandshakeTime, timeToFirstByte, redirectionTime, waitingTime, redirectsCount, failureMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorRequestExecutionResultAllOf {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requestName: ").append(toIndentedString(requestName)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    publicLocation: ").append(toIndentedString(publicLocation)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
    sb.append("    responseBodySizeLimitExceeded: ").append(toIndentedString(responseBodySizeLimitExceeded)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    resolvedIps: ").append(toIndentedString(resolvedIps)).append("\n");
    sb.append("    healthStatusCode: ").append(toIndentedString(healthStatusCode)).append("\n");
    sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    peerCertificateExpiryDate: ").append(toIndentedString(peerCertificateExpiryDate)).append("\n");
    sb.append("    peerCertificateDetails: ").append(toIndentedString(peerCertificateDetails)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    hostNameResolutionTime: ").append(toIndentedString(hostNameResolutionTime)).append("\n");
    sb.append("    tcpConnectTime: ").append(toIndentedString(tcpConnectTime)).append("\n");
    sb.append("    tlsHandshakeTime: ").append(toIndentedString(tlsHandshakeTime)).append("\n");
    sb.append("    timeToFirstByte: ").append(toIndentedString(timeToFirstByte)).append("\n");
    sb.append("    redirectionTime: ").append(toIndentedString(redirectionTime)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    redirectsCount: ").append(toIndentedString(redirectsCount)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
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
