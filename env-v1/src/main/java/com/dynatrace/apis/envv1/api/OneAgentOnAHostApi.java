/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/xc03k3c).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.dynatrace.apis.envv1.api;

import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Pair;

import com.dynatrace.apis.envv1.model.HostsListPage;
import java.util.Set;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class OneAgentOnAHostApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public OneAgentOnAHostApi() {
    this(new ApiClient());
  }

  public OneAgentOnAHostApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Gets the list of hosts with OneAgent deployment information for each host
   * You can narrow down the output by specifying filtering parameters for the request.   The response is limited to 500 items. Use the **nextPageKey** cursor to obtain subsequent results.
   * @param includeDetails Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. (optional, default to true)
   * @param startTimestamp The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used. (optional)
   * @param endTimestamp The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 7 months (214 days). (optional)
   * @param relativeTime The relative timeframe, back from now.   If you need to specify relative timeframe that is not presented in the list of possible values, specify the **startTimestamp** (up to 214 days back from now) and leave **endTimestamp** and **relativeTime** empty. (optional)
   * @param tag Filters the resulting set of hosts by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The host has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. (optional
   * @param entity Filters result to the specified hosts only.    To specify several hosts use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. (optional
   * @param managementZoneId Only return hosts that are part of the specified management zone.   Specify the management zone ID here. (optional)
   * @param managementZone Only return hosts that are part of the specified management zone.   Specify the management zone name here.   If the **managementZoneId** parameter is set, this parameter is ignored. (optional)
   * @param networkZoneId Filters the resulting set of hosts by the specified network zone.    Specify the Dynatrace entity ID of the required network zone. You can fetch the list of available network zones with the [GET all network zones](https://dt-url.net/u4o3r7z) call. (optional)
   * @param hostGroupId Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace entity ID of the required host group. (optional)
   * @param hostGroupName Filters the resulting set of hosts by the specified host group.    Specify the name of the required host group. (optional)
   * @param osType Filters the resulting set of hosts by the OS type. (optional)
   * @param cloudType Filters the resulting set of hosts by the cloud type. (optional)
   * @param autoInjection Filters the resulting set of hosts by the auto-injection status. (optional)
   * @param availabilityState Filters the resulting set of hosts by the availability state of OneAgent.   * &#x60;MONITORED&#x60;: Hosts where OneAgent is enabled and active. * &#x60;UNMONITORED&#x60;: Hosts where OneAgent is disabled and inactive. * &#x60;CRASHED&#x60;: Hosts where OneAgent has returned a crash status code. * &#x60;LOST&#x60;: Hosts where it is impossible to establish connection with OneAgent. * &#x60;PRE_MONITORED&#x60;: Hosts where OneAgent is being initialized for monitoring. * &#x60;SHUTDOWN&#x60;: Hosts where OneAgent is shutting down in a controlled process. * &#x60;UNEXPECTED_SHUTDOWN&#x60;: Hosts where OneAgent is shutting down in an uncontrolled process. * &#x60;UNKNOWN&#x60;: Hosts where the state of OneAgent is unknown. (optional)
   * @param detailedAvailabilityState Filters the resulting set of hosts by the detailed availability state of OneAgent.   * &#x60;UNKNOWN&#x60;: Hosts where the state of OneAgent is unknown. * &#x60;PRE_MONITORED&#x60;: Hosts where OneAgent is being initialized for monitoring. * &#x60;CRASHED_UNKNOWN&#x60;: Hosts where OneAgent has crashed for unknown reason. * &#x60;CRASHED_FAILURE&#x60;: Hosts where OneAgent has returned a crash status code. * &#x60;LOST_UNKNOWN&#x60;: Hosts where it is impossible to establish connection with OneAgent for unknown reason. * &#x60;LOST_CONNECTION&#x60;: Hosts where OneAgent has been recognized to be inactive. * &#x60;LOST_AGENT_UPGRADE_FAILED&#x60;: Hosts where OneAgent has a potential update problem due to inactivity after update. * &#x60;SHUTDOWN_UNKNOWN_UNEXPECTED&#x60;: Hosts where OneAgent is shutting down in an uncontrolled process. * &#x60;SHUTDOWN_UNKNOWN&#x60;: Hosts where OneAgent has shutdown for unknown reason. * &#x60;SHUTDOWN_GRACEFUL&#x60;: Hosts where OneAgent has shutdown because of host shutdown. * &#x60;SHUTDOWN_STOPPED&#x60;: Hosts where OneAgent has shutdown because the host has stopped. * &#x60;SHUTDOWN_AGENT_LOST&#x60;: Hosts where PaaS module has been recognized to be inactive. * &#x60;SHUTDOWN_SPOT_INSTANCE&#x60;: Hosts where OneAgent shutdown was triggered by the AWS Spot Instance interruption. * &#x60;UNMONITORED_UNKNOWN&#x60;: Hosts where OneAgent is disabled and inactive for unknown reason. * &#x60;UNMONITORED_TERMINATED&#x60;: Hosts where OneAgent has terminated. * &#x60;UNMONITORED_DISABLED&#x60;: Hosts where OneAgent has been disabled in configuration. * &#x60;UNMONITORED_AGENT_STOPPED&#x60;: Hosts where OneAgent is stopped. * &#x60;UNMONITORED_AGENT_RESTART_TRIGGERED&#x60;: Hosts where OneAgent is being restarted. * &#x60;UNMONITORED_AGENT_UNINSTALLED&#x60;: Hosts where OneAgent is uninstalled. * &#x60;UNMONITORED_AGENT_DISABLED&#x60;: Hosts where OneAgent reported that it was disabled. * &#x60;UNMONITORED_AGENT_UPGRADE_FAILED&#x60;: Hosts where OneAgent has a potential update problem. * &#x60;UNMONITORED_ID_CHANGED&#x60;: Hosts where OneAgent has potentially changed ID during update. * &#x60;UNMONITORED_AGENT_LOST&#x60;: Hosts where OneAgent has been recognized to be unavailable due to server communication issues. * &#x60;UNMONITORED_AGENT_UNREGISTERED&#x60;: Hosts where a code module has been recognized to be unavailable because of shutdown. * &#x60;UNMONITORED_AGENT_VERSION_REJECTED&#x60;: Hosts where OneAgent was rejected because the version does not meet the minimum agent version requirement. * &#x60;MONITORED&#x60;: Hosts where OneAgent is enabled and active. * &#x60;MONITORED_ENABLED&#x60;: Hosts where OneAgent has been enabled in configuration. * &#x60;MONITORED_AGENT_REGISTERED&#x60;: Hosts where the new OneAgent has been recognized. * &#x60;MONITORED_AGENT_UPGRADE_STARTED&#x60;: Hosts where OneAgent has shutdown due to an update. * &#x60;MONITORED_AGENT_ENABLED&#x60;: Hosts where OneAgent reported that it was enabled. * &#x60;MONITORED_AGENT_VERSION_ACCEPTED&#x60;: Hosts where OneAgent was accepted because the version meets the minimum agent version requirement. (optional)
   * @param monitoringType Filters the resulting set of hosts by monitoring mode of OneAgent deployed on the host. (optional)
   * @param agentVersionIs Filters the resulting set of hosts to those that have a certain OneAgent version deployed on the host.   Specify the comparison operator here. (optional)
   * @param agentVersionNumber Filters the resulting set of hosts to those that have a certain OneAgent version deployed on the host.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format, for example &#x60;1.182.0&#x60;. You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call. (optional)
   * @param autoUpdateSetting Filters the resulting set of hosts by the actual state of the auto-update setting of deployed OneAgents. (optional)
   * @param updateStatus Filters the resulting set of hosts by the update status of OneAgent deployed on the host. (optional)
   * @param faultyVersion Filters the resulting set of hosts to those that run OneAgent version that is marked as faulty. (optional)
   * @param activeGateId Filters the resulting set of hosts to those that are currently connected to the ActiveGate with the specified ID.   Use **DIRECT_COMMUNICATION** keyword to find the hosts not connected to any ActiveGate. (optional)
   * @param technologyModuleType Filters the resulting set of hosts to those that run the specified OneAgent code module.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param technologyModuleVersionIs Filters the resulting set of hosts to those that have a certain code module version deployed on the host.   Specify the comparison operator here.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param technologyModuleVersionNumber Filters the resulting set of hosts to those that have a certain code module version deployed on the host.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format, for example &#x60;1.182.0&#x60;. You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param technologyModuleFaultyVersion Filters the resulting set of hosts to those that run the code module version that is marked as faulty.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param pluginName Filters the resulting set of hosts to those that run the plugin with the specified name.   The **CONTAINS** operator is applied to the specified value.   If several plugin filters are specified, the plugin has to match **all** the filters. (optional)
   * @param pluginVersionIs Filters the resulting set of hosts to those that have a certain plugin version deployed on the host.   Specify the comparison operator here.   If several plugin filters are specified, the plugin has to match **all** the filters. (optional)
   * @param pluginVersionNumber Filters the resulting set of hosts to those that have a certain plugin version deployed on the host.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format, for example &#x60;1.182.0&#x60;. You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call.   &#x60;&lt;minor&gt;&#x60; and &#x60;&lt;revision&gt;&#x60; parts of the version number are optional.   If several plugin filters are specified, the plugin has to match **all** the filters. (optional)
   * @param pluginState Filters the resulting set of hosts to those that run the plugin with the specified state. (optional)
   * @param nextPageKey The cursor for the next page of results, if results do not fit on one page. You can find the cursor value on the current page of the response, in the **nextPageKey** field.   To obtain subsequent pages, you must specify this cursor value in your query, and keep all other query parameters as they were in the original request.   If you don&#39;t specify the cursor, the first page will always be returned. (optional)
   * @return HostsListPage
   * @throws ApiException if fails to make API call
   */
  public HostsListPage getHostsWithSpecificAgents(Boolean includeDetails, Long startTimestamp, Long endTimestamp, String relativeTime, Set<String> tag, Set<String> entity, Long managementZoneId, String managementZone, String networkZoneId, String hostGroupId, String hostGroupName, String osType, String cloudType, String autoInjection, String availabilityState, String detailedAvailabilityState, String monitoringType, String agentVersionIs, String agentVersionNumber, String autoUpdateSetting, String updateStatus, Boolean faultyVersion, String activeGateId, String technologyModuleType, String technologyModuleVersionIs, String technologyModuleVersionNumber, Boolean technologyModuleFaultyVersion, String pluginName, String pluginVersionIs, String pluginVersionNumber, String pluginState, String nextPageKey) throws ApiException {
    ApiResponse<HostsListPage> localVarResponse = getHostsWithSpecificAgentsWithHttpInfo(includeDetails, startTimestamp, endTimestamp, relativeTime, tag, entity, managementZoneId, managementZone, networkZoneId, hostGroupId, hostGroupName, osType, cloudType, autoInjection, availabilityState, detailedAvailabilityState, monitoringType, agentVersionIs, agentVersionNumber, autoUpdateSetting, updateStatus, faultyVersion, activeGateId, technologyModuleType, technologyModuleVersionIs, technologyModuleVersionNumber, technologyModuleFaultyVersion, pluginName, pluginVersionIs, pluginVersionNumber, pluginState, nextPageKey);
    return localVarResponse.getData();
  }

  /**
   * Gets the list of hosts with OneAgent deployment information for each host
   * You can narrow down the output by specifying filtering parameters for the request.   The response is limited to 500 items. Use the **nextPageKey** cursor to obtain subsequent results.
   * @param includeDetails Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. (optional, default to true)
   * @param startTimestamp The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used. (optional)
   * @param endTimestamp The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 7 months (214 days). (optional)
   * @param relativeTime The relative timeframe, back from now.   If you need to specify relative timeframe that is not presented in the list of possible values, specify the **startTimestamp** (up to 214 days back from now) and leave **endTimestamp** and **relativeTime** empty. (optional)
   * @param tag Filters the resulting set of hosts by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The host has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. (optional
   * @param entity Filters result to the specified hosts only.    To specify several hosts use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. (optional
   * @param managementZoneId Only return hosts that are part of the specified management zone.   Specify the management zone ID here. (optional)
   * @param managementZone Only return hosts that are part of the specified management zone.   Specify the management zone name here.   If the **managementZoneId** parameter is set, this parameter is ignored. (optional)
   * @param networkZoneId Filters the resulting set of hosts by the specified network zone.    Specify the Dynatrace entity ID of the required network zone. You can fetch the list of available network zones with the [GET all network zones](https://dt-url.net/u4o3r7z) call. (optional)
   * @param hostGroupId Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace entity ID of the required host group. (optional)
   * @param hostGroupName Filters the resulting set of hosts by the specified host group.    Specify the name of the required host group. (optional)
   * @param osType Filters the resulting set of hosts by the OS type. (optional)
   * @param cloudType Filters the resulting set of hosts by the cloud type. (optional)
   * @param autoInjection Filters the resulting set of hosts by the auto-injection status. (optional)
   * @param availabilityState Filters the resulting set of hosts by the availability state of OneAgent.   * &#x60;MONITORED&#x60;: Hosts where OneAgent is enabled and active. * &#x60;UNMONITORED&#x60;: Hosts where OneAgent is disabled and inactive. * &#x60;CRASHED&#x60;: Hosts where OneAgent has returned a crash status code. * &#x60;LOST&#x60;: Hosts where it is impossible to establish connection with OneAgent. * &#x60;PRE_MONITORED&#x60;: Hosts where OneAgent is being initialized for monitoring. * &#x60;SHUTDOWN&#x60;: Hosts where OneAgent is shutting down in a controlled process. * &#x60;UNEXPECTED_SHUTDOWN&#x60;: Hosts where OneAgent is shutting down in an uncontrolled process. * &#x60;UNKNOWN&#x60;: Hosts where the state of OneAgent is unknown. (optional)
   * @param detailedAvailabilityState Filters the resulting set of hosts by the detailed availability state of OneAgent.   * &#x60;UNKNOWN&#x60;: Hosts where the state of OneAgent is unknown. * &#x60;PRE_MONITORED&#x60;: Hosts where OneAgent is being initialized for monitoring. * &#x60;CRASHED_UNKNOWN&#x60;: Hosts where OneAgent has crashed for unknown reason. * &#x60;CRASHED_FAILURE&#x60;: Hosts where OneAgent has returned a crash status code. * &#x60;LOST_UNKNOWN&#x60;: Hosts where it is impossible to establish connection with OneAgent for unknown reason. * &#x60;LOST_CONNECTION&#x60;: Hosts where OneAgent has been recognized to be inactive. * &#x60;LOST_AGENT_UPGRADE_FAILED&#x60;: Hosts where OneAgent has a potential update problem due to inactivity after update. * &#x60;SHUTDOWN_UNKNOWN_UNEXPECTED&#x60;: Hosts where OneAgent is shutting down in an uncontrolled process. * &#x60;SHUTDOWN_UNKNOWN&#x60;: Hosts where OneAgent has shutdown for unknown reason. * &#x60;SHUTDOWN_GRACEFUL&#x60;: Hosts where OneAgent has shutdown because of host shutdown. * &#x60;SHUTDOWN_STOPPED&#x60;: Hosts where OneAgent has shutdown because the host has stopped. * &#x60;SHUTDOWN_AGENT_LOST&#x60;: Hosts where PaaS module has been recognized to be inactive. * &#x60;SHUTDOWN_SPOT_INSTANCE&#x60;: Hosts where OneAgent shutdown was triggered by the AWS Spot Instance interruption. * &#x60;UNMONITORED_UNKNOWN&#x60;: Hosts where OneAgent is disabled and inactive for unknown reason. * &#x60;UNMONITORED_TERMINATED&#x60;: Hosts where OneAgent has terminated. * &#x60;UNMONITORED_DISABLED&#x60;: Hosts where OneAgent has been disabled in configuration. * &#x60;UNMONITORED_AGENT_STOPPED&#x60;: Hosts where OneAgent is stopped. * &#x60;UNMONITORED_AGENT_RESTART_TRIGGERED&#x60;: Hosts where OneAgent is being restarted. * &#x60;UNMONITORED_AGENT_UNINSTALLED&#x60;: Hosts where OneAgent is uninstalled. * &#x60;UNMONITORED_AGENT_DISABLED&#x60;: Hosts where OneAgent reported that it was disabled. * &#x60;UNMONITORED_AGENT_UPGRADE_FAILED&#x60;: Hosts where OneAgent has a potential update problem. * &#x60;UNMONITORED_ID_CHANGED&#x60;: Hosts where OneAgent has potentially changed ID during update. * &#x60;UNMONITORED_AGENT_LOST&#x60;: Hosts where OneAgent has been recognized to be unavailable due to server communication issues. * &#x60;UNMONITORED_AGENT_UNREGISTERED&#x60;: Hosts where a code module has been recognized to be unavailable because of shutdown. * &#x60;UNMONITORED_AGENT_VERSION_REJECTED&#x60;: Hosts where OneAgent was rejected because the version does not meet the minimum agent version requirement. * &#x60;MONITORED&#x60;: Hosts where OneAgent is enabled and active. * &#x60;MONITORED_ENABLED&#x60;: Hosts where OneAgent has been enabled in configuration. * &#x60;MONITORED_AGENT_REGISTERED&#x60;: Hosts where the new OneAgent has been recognized. * &#x60;MONITORED_AGENT_UPGRADE_STARTED&#x60;: Hosts where OneAgent has shutdown due to an update. * &#x60;MONITORED_AGENT_ENABLED&#x60;: Hosts where OneAgent reported that it was enabled. * &#x60;MONITORED_AGENT_VERSION_ACCEPTED&#x60;: Hosts where OneAgent was accepted because the version meets the minimum agent version requirement. (optional)
   * @param monitoringType Filters the resulting set of hosts by monitoring mode of OneAgent deployed on the host. (optional)
   * @param agentVersionIs Filters the resulting set of hosts to those that have a certain OneAgent version deployed on the host.   Specify the comparison operator here. (optional)
   * @param agentVersionNumber Filters the resulting set of hosts to those that have a certain OneAgent version deployed on the host.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format, for example &#x60;1.182.0&#x60;. You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call. (optional)
   * @param autoUpdateSetting Filters the resulting set of hosts by the actual state of the auto-update setting of deployed OneAgents. (optional)
   * @param updateStatus Filters the resulting set of hosts by the update status of OneAgent deployed on the host. (optional)
   * @param faultyVersion Filters the resulting set of hosts to those that run OneAgent version that is marked as faulty. (optional)
   * @param activeGateId Filters the resulting set of hosts to those that are currently connected to the ActiveGate with the specified ID.   Use **DIRECT_COMMUNICATION** keyword to find the hosts not connected to any ActiveGate. (optional)
   * @param technologyModuleType Filters the resulting set of hosts to those that run the specified OneAgent code module.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param technologyModuleVersionIs Filters the resulting set of hosts to those that have a certain code module version deployed on the host.   Specify the comparison operator here.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param technologyModuleVersionNumber Filters the resulting set of hosts to those that have a certain code module version deployed on the host.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format, for example &#x60;1.182.0&#x60;. You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param technologyModuleFaultyVersion Filters the resulting set of hosts to those that run the code module version that is marked as faulty.   If several code module filters are specified, the code module has to match **all** the filters. (optional)
   * @param pluginName Filters the resulting set of hosts to those that run the plugin with the specified name.   The **CONTAINS** operator is applied to the specified value.   If several plugin filters are specified, the plugin has to match **all** the filters. (optional)
   * @param pluginVersionIs Filters the resulting set of hosts to those that have a certain plugin version deployed on the host.   Specify the comparison operator here.   If several plugin filters are specified, the plugin has to match **all** the filters. (optional)
   * @param pluginVersionNumber Filters the resulting set of hosts to those that have a certain plugin version deployed on the host.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format, for example &#x60;1.182.0&#x60;. You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call.   &#x60;&lt;minor&gt;&#x60; and &#x60;&lt;revision&gt;&#x60; parts of the version number are optional.   If several plugin filters are specified, the plugin has to match **all** the filters. (optional)
   * @param pluginState Filters the resulting set of hosts to those that run the plugin with the specified state. (optional)
   * @param nextPageKey The cursor for the next page of results, if results do not fit on one page. You can find the cursor value on the current page of the response, in the **nextPageKey** field.   To obtain subsequent pages, you must specify this cursor value in your query, and keep all other query parameters as they were in the original request.   If you don&#39;t specify the cursor, the first page will always be returned. (optional)
   * @return ApiResponse&lt;HostsListPage&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<HostsListPage> getHostsWithSpecificAgentsWithHttpInfo(Boolean includeDetails, Long startTimestamp, Long endTimestamp, String relativeTime, Set<String> tag, Set<String> entity, Long managementZoneId, String managementZone, String networkZoneId, String hostGroupId, String hostGroupName, String osType, String cloudType, String autoInjection, String availabilityState, String detailedAvailabilityState, String monitoringType, String agentVersionIs, String agentVersionNumber, String autoUpdateSetting, String updateStatus, Boolean faultyVersion, String activeGateId, String technologyModuleType, String technologyModuleVersionIs, String technologyModuleVersionNumber, Boolean technologyModuleFaultyVersion, String pluginName, String pluginVersionIs, String pluginVersionNumber, String pluginState, String nextPageKey) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getHostsWithSpecificAgentsRequestBuilder(includeDetails, startTimestamp, endTimestamp, relativeTime, tag, entity, managementZoneId, managementZone, networkZoneId, hostGroupId, hostGroupName, osType, cloudType, autoInjection, availabilityState, detailedAvailabilityState, monitoringType, agentVersionIs, agentVersionNumber, autoUpdateSetting, updateStatus, faultyVersion, activeGateId, technologyModuleType, technologyModuleVersionIs, technologyModuleVersionNumber, technologyModuleFaultyVersion, pluginName, pluginVersionIs, pluginVersionNumber, pluginState, nextPageKey);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getHostsWithSpecificAgents", localVarResponse);
        }
        return new ApiResponse<HostsListPage>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<HostsListPage>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getHostsWithSpecificAgentsRequestBuilder(Boolean includeDetails, Long startTimestamp, Long endTimestamp, String relativeTime, Set<String> tag, Set<String> entity, Long managementZoneId, String managementZone, String networkZoneId, String hostGroupId, String hostGroupName, String osType, String cloudType, String autoInjection, String availabilityState, String detailedAvailabilityState, String monitoringType, String agentVersionIs, String agentVersionNumber, String autoUpdateSetting, String updateStatus, Boolean faultyVersion, String activeGateId, String technologyModuleType, String technologyModuleVersionIs, String technologyModuleVersionNumber, Boolean technologyModuleFaultyVersion, String pluginName, String pluginVersionIs, String pluginVersionNumber, String pluginState, String nextPageKey) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/oneagents";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("includeDetails", includeDetails));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("startTimestamp", startTimestamp));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("endTimestamp", endTimestamp));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("relativeTime", relativeTime));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "tag", tag));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "entity", entity));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("managementZoneId", managementZoneId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("managementZone", managementZone));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("networkZoneId", networkZoneId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("hostGroupId", hostGroupId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("hostGroupName", hostGroupName));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("osType", osType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cloudType", cloudType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("autoInjection", autoInjection));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("availabilityState", availabilityState));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("detailedAvailabilityState", detailedAvailabilityState));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("monitoringType", monitoringType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("agentVersionIs", agentVersionIs));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("agentVersionNumber", agentVersionNumber));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("autoUpdateSetting", autoUpdateSetting));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("updateStatus", updateStatus));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("faultyVersion", faultyVersion));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("activeGateId", activeGateId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("technologyModuleType", technologyModuleType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("technologyModuleVersionIs", technologyModuleVersionIs));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("technologyModuleVersionNumber", technologyModuleVersionNumber));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("technologyModuleFaultyVersion", technologyModuleFaultyVersion));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pluginName", pluginName));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pluginVersionIs", pluginVersionIs));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pluginVersionNumber", pluginVersionNumber));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pluginState", pluginState));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("nextPageKey", nextPageKey));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
