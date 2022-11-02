# DeploymentApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadAgentInstallerWithVersion**](DeploymentApi.md#downloadAgentInstallerWithVersion) | **GET** /deployment/installer/agent/{osType}/{installerType}/version/{version} | Downloads OneAgent installer of the specified version |
| [**downloadAgentInstallerWithVersionWithHttpInfo**](DeploymentApi.md#downloadAgentInstallerWithVersionWithHttpInfo) | **GET** /deployment/installer/agent/{osType}/{installerType}/version/{version} | Downloads OneAgent installer of the specified version |
| [**downloadAgentOrchestrationSignatureWithVersion**](DeploymentApi.md#downloadAgentOrchestrationSignatureWithVersion) | **GET** /deployment/orchestration/agent/{orchestrationType}/version/{version}/signature | Downloads the requested version matching OneAgent deployment orchestration tarball&#39;s signature |
| [**downloadAgentOrchestrationSignatureWithVersionWithHttpInfo**](DeploymentApi.md#downloadAgentOrchestrationSignatureWithVersionWithHttpInfo) | **GET** /deployment/orchestration/agent/{orchestrationType}/version/{version}/signature | Downloads the requested version matching OneAgent deployment orchestration tarball&#39;s signature |
| [**downloadAgentOrchestrationWithVersion**](DeploymentApi.md#downloadAgentOrchestrationWithVersion) | **GET** /deployment/orchestration/agent/{orchestrationType}/version/{version} | Downloads the requested version matching OneAgent deployment orchestration tarball |
| [**downloadAgentOrchestrationWithVersionWithHttpInfo**](DeploymentApi.md#downloadAgentOrchestrationWithVersionWithHttpInfo) | **GET** /deployment/orchestration/agent/{orchestrationType}/version/{version} | Downloads the requested version matching OneAgent deployment orchestration tarball |
| [**downloadBoshReleaseWithVersion**](DeploymentApi.md#downloadBoshReleaseWithVersion) | **GET** /deployment/boshrelease/agent/{osType}/version/{version} | Downloads BOSH release tarballs of the specified version, OneAgent included |
| [**downloadBoshReleaseWithVersionWithHttpInfo**](DeploymentApi.md#downloadBoshReleaseWithVersionWithHttpInfo) | **GET** /deployment/boshrelease/agent/{osType}/version/{version} | Downloads BOSH release tarballs of the specified version, OneAgent included |
| [**downloadGatewayInstallerWithVersion**](DeploymentApi.md#downloadGatewayInstallerWithVersion) | **GET** /deployment/installer/gateway/{osType}/version/{version} | Downloads the ActiveGate installer of the specified version |
| [**downloadGatewayInstallerWithVersionWithHttpInfo**](DeploymentApi.md#downloadGatewayInstallerWithVersionWithHttpInfo) | **GET** /deployment/installer/gateway/{osType}/version/{version} | Downloads the ActiveGate installer of the specified version |
| [**downloadLatestAgentInstaller**](DeploymentApi.md#downloadLatestAgentInstaller) | **GET** /deployment/installer/agent/{osType}/{installerType}/latest | Downloads the latest OneAgent installer |
| [**downloadLatestAgentInstallerWithHttpInfo**](DeploymentApi.md#downloadLatestAgentInstallerWithHttpInfo) | **GET** /deployment/installer/agent/{osType}/{installerType}/latest | Downloads the latest OneAgent installer |
| [**downloadLatestAgentOrchestration**](DeploymentApi.md#downloadLatestAgentOrchestration) | **GET** /deployment/orchestration/agent/{orchestrationType}/latest | Downloads the latest OneAgent deployment orchestration tarball |
| [**downloadLatestAgentOrchestrationWithHttpInfo**](DeploymentApi.md#downloadLatestAgentOrchestrationWithHttpInfo) | **GET** /deployment/orchestration/agent/{orchestrationType}/latest | Downloads the latest OneAgent deployment orchestration tarball |
| [**downloadLatestAgentOrchestrationSignature**](DeploymentApi.md#downloadLatestAgentOrchestrationSignature) | **GET** /deployment/orchestration/agent/{orchestrationType}/latest/signature | Downloads the latest OneAgent deployment orchestration tarball&#39;s signature |
| [**downloadLatestAgentOrchestrationSignatureWithHttpInfo**](DeploymentApi.md#downloadLatestAgentOrchestrationSignatureWithHttpInfo) | **GET** /deployment/orchestration/agent/{orchestrationType}/latest/signature | Downloads the latest OneAgent deployment orchestration tarball&#39;s signature |
| [**downloadLatestGatewayInstaller**](DeploymentApi.md#downloadLatestGatewayInstaller) | **GET** /deployment/installer/gateway/{osType}/latest | Downloads the configured standard ActiveGate installer of the latest version for the specified OS |
| [**downloadLatestGatewayInstallerWithHttpInfo**](DeploymentApi.md#downloadLatestGatewayInstallerWithHttpInfo) | **GET** /deployment/installer/gateway/{osType}/latest | Downloads the configured standard ActiveGate installer of the latest version for the specified OS |
| [**getActiveGateInstallerAvailableVersions**](DeploymentApi.md#getActiveGateInstallerAvailableVersions) | **GET** /deployment/installer/gateway/versions/{osType} | Lists all available versions of ActiveGate installer |
| [**getActiveGateInstallerAvailableVersionsWithHttpInfo**](DeploymentApi.md#getActiveGateInstallerAvailableVersionsWithHttpInfo) | **GET** /deployment/installer/gateway/versions/{osType} | Lists all available versions of ActiveGate installer |
| [**getActiveGateInstallerConnectionInfo**](DeploymentApi.md#getActiveGateInstallerConnectionInfo) | **GET** /deployment/installer/gateway/connectioninfo | Gets the connectivity information for Environment ActiveGate |
| [**getActiveGateInstallerConnectionInfoWithHttpInfo**](DeploymentApi.md#getActiveGateInstallerConnectionInfoWithHttpInfo) | **GET** /deployment/installer/gateway/connectioninfo | Gets the connectivity information for Environment ActiveGate |
| [**getAgentInstallerAvailableVersions**](DeploymentApi.md#getAgentInstallerAvailableVersions) | **GET** /deployment/installer/agent/versions/{osType}/{installerType} | Lists all available versions of OneAgent installer |
| [**getAgentInstallerAvailableVersionsWithHttpInfo**](DeploymentApi.md#getAgentInstallerAvailableVersionsWithHttpInfo) | **GET** /deployment/installer/agent/versions/{osType}/{installerType} | Lists all available versions of OneAgent installer |
| [**getAgentInstallerConnectionInfo**](DeploymentApi.md#getAgentInstallerConnectionInfo) | **GET** /deployment/installer/agent/connectioninfo | Gets the connectivity information for OneAgent |
| [**getAgentInstallerConnectionInfoWithHttpInfo**](DeploymentApi.md#getAgentInstallerConnectionInfoWithHttpInfo) | **GET** /deployment/installer/agent/connectioninfo | Gets the connectivity information for OneAgent |
| [**getAgentInstallerConnectionInfoEndpoints**](DeploymentApi.md#getAgentInstallerConnectionInfoEndpoints) | **GET** /deployment/installer/agent/connectioninfo/endpoints | Gets the list of the ActiveGate-Endpoints to be used for Agents ordered by networkzone-priorities. |
| [**getAgentInstallerConnectionInfoEndpointsWithHttpInfo**](DeploymentApi.md#getAgentInstallerConnectionInfoEndpointsWithHttpInfo) | **GET** /deployment/installer/agent/connectioninfo/endpoints | Gets the list of the ActiveGate-Endpoints to be used for Agents ordered by networkzone-priorities. |
| [**getAgentInstallerMetaInfo**](DeploymentApi.md#getAgentInstallerMetaInfo) | **GET** /deployment/installer/agent/{osType}/{installerType}/latest/metainfo | Gets the latest available version of a OneAgent installer |
| [**getAgentInstallerMetaInfoWithHttpInfo**](DeploymentApi.md#getAgentInstallerMetaInfoWithHttpInfo) | **GET** /deployment/installer/agent/{osType}/{installerType}/latest/metainfo | Gets the latest available version of a OneAgent installer |
| [**getAgentInstallerWithVersionChecksum**](DeploymentApi.md#getAgentInstallerWithVersionChecksum) | **GET** /deployment/installer/agent/{osType}/{installerType}/version/{version}/checksum | Gets the checksum of the specified OneAgent installer |
| [**getAgentInstallerWithVersionChecksumWithHttpInfo**](DeploymentApi.md#getAgentInstallerWithVersionChecksumWithHttpInfo) | **GET** /deployment/installer/agent/{osType}/{installerType}/version/{version}/checksum | Gets the checksum of the specified OneAgent installer |
| [**getAgentProcessModuleConfig**](DeploymentApi.md#getAgentProcessModuleConfig) | **GET** /deployment/installer/agent/processmoduleconfig | Gets the latest process module config | maturity&#x3D;EARLY_ADOPTER |
| [**getAgentProcessModuleConfigWithHttpInfo**](DeploymentApi.md#getAgentProcessModuleConfigWithHttpInfo) | **GET** /deployment/installer/agent/processmoduleconfig | Gets the latest process module config | maturity&#x3D;EARLY_ADOPTER |
| [**getBoshReleaseAvailableVersions**](DeploymentApi.md#getBoshReleaseAvailableVersions) | **GET** /deployment/boshrelease/versions/{osType} | Gets the list of available OneAgent versions for BOSH release tarballs |
| [**getBoshReleaseAvailableVersionsWithHttpInfo**](DeploymentApi.md#getBoshReleaseAvailableVersionsWithHttpInfo) | **GET** /deployment/boshrelease/versions/{osType} | Gets the list of available OneAgent versions for BOSH release tarballs |
| [**getBoshReleaseChecksum**](DeploymentApi.md#getBoshReleaseChecksum) | **GET** /deployment/boshrelease/agent/{osType}/version/{version}/checksum | Gets the checksum of the specified BOSH release tarball |
| [**getBoshReleaseChecksumWithHttpInfo**](DeploymentApi.md#getBoshReleaseChecksumWithHttpInfo) | **GET** /deployment/boshrelease/agent/{osType}/version/{version}/checksum | Gets the checksum of the specified BOSH release tarball |
| [**getLatestLambdaBuildUnits**](DeploymentApi.md#getLatestLambdaBuildUnits) | **GET** /deployment/lambda/agent/latest | Get the latest version names of the OneAgent for AWS Lambda |
| [**getLatestLambdaBuildUnitsWithHttpInfo**](DeploymentApi.md#getLatestLambdaBuildUnitsWithHttpInfo) | **GET** /deployment/lambda/agent/latest | Get the latest version names of the OneAgent for AWS Lambda |



## downloadAgentInstallerWithVersion

> void downloadAgentInstallerWithVersion(osType, installerType, version, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone)

Downloads OneAgent installer of the specified version

For the &#x60;paas&#x60; or &#x60;paas-sh&#x60; installer types you can get a configuring installer, by passing additional parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String version = "version_example"; // String | The required version of the OneAgent in `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        Set<String> include = Arrays.asList("All"); // Set<String> | The code modules to be included to the installer. You can specify several modules in the following format: `include=java&include=dotnet`.   Only applicable to the `paas` and `paas-sh` installer types.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    Only applicable to the `paas` and `paas-sh` installer types.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            apiInstance.downloadAgentInstallerWithVersion(osType, installerType, version, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadAgentInstallerWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **version** | **String**| The required version of the OneAgent in &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call. | |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |
| **include** | [**Set&lt;String&gt;**](String.md)| The code modules to be included to the installer. You can specify several modules in the following format: &#x60;include&#x3D;java&amp;include&#x3D;dotnet&#x60;.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [enum: all, java, apache, nginx, nodejs, dotnet, php, go, sdk] |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadAgentInstallerWithVersionWithHttpInfo

> ApiResponse<Void> downloadAgentInstallerWithVersion downloadAgentInstallerWithVersionWithHttpInfo(osType, installerType, version, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone)

Downloads OneAgent installer of the specified version

For the &#x60;paas&#x60; or &#x60;paas-sh&#x60; installer types you can get a configuring installer, by passing additional parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String version = "version_example"; // String | The required version of the OneAgent in `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        Set<String> include = Arrays.asList("All"); // Set<String> | The code modules to be included to the installer. You can specify several modules in the following format: `include=java&include=dotnet`.   Only applicable to the `paas` and `paas-sh` installer types.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    Only applicable to the `paas` and `paas-sh` installer types.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            ApiResponse<Void> response = apiInstance.downloadAgentInstallerWithVersionWithHttpInfo(osType, installerType, version, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadAgentInstallerWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **version** | **String**| The required version of the OneAgent in &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call. | |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |
| **include** | [**Set&lt;String&gt;**](String.md)| The code modules to be included to the installer. You can specify several modules in the following format: &#x60;include&#x3D;java&amp;include&#x3D;dotnet&#x60;.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [enum: all, java, apache, nginx, nodejs, dotnet, php, go, sdk] |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## downloadAgentOrchestrationSignatureWithVersion

> void downloadAgentOrchestrationSignatureWithVersion(orchestrationType, version)

Downloads the requested version matching OneAgent deployment orchestration tarball&#39;s signature

Downloading the requested version matching deployment orchestration tarball&#39;s signature matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        String version = "version_example"; // String | The requested version of the OneAgent deployment orchestration tarball in `0.1.0.20200925-120822` format.
        try {
            apiInstance.downloadAgentOrchestrationSignatureWithVersion(orchestrationType, version);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadAgentOrchestrationSignatureWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |
| **version** | **String**| The requested version of the OneAgent deployment orchestration tarball in &#x60;0.1.0.20200925-120822&#x60; format. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadAgentOrchestrationSignatureWithVersionWithHttpInfo

> ApiResponse<Void> downloadAgentOrchestrationSignatureWithVersion downloadAgentOrchestrationSignatureWithVersionWithHttpInfo(orchestrationType, version)

Downloads the requested version matching OneAgent deployment orchestration tarball&#39;s signature

Downloading the requested version matching deployment orchestration tarball&#39;s signature matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        String version = "version_example"; // String | The requested version of the OneAgent deployment orchestration tarball in `0.1.0.20200925-120822` format.
        try {
            ApiResponse<Void> response = apiInstance.downloadAgentOrchestrationSignatureWithVersionWithHttpInfo(orchestrationType, version);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadAgentOrchestrationSignatureWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |
| **version** | **String**| The requested version of the OneAgent deployment orchestration tarball in &#x60;0.1.0.20200925-120822&#x60; format. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## downloadAgentOrchestrationWithVersion

> void downloadAgentOrchestrationWithVersion(orchestrationType, version)

Downloads the requested version matching OneAgent deployment orchestration tarball

Downloading the requested version matching deployment orchestration tarball matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        String version = "version_example"; // String | The requested version of the OneAgent orchestration deployment tarball in `0.1.0.20200925-120822` format.
        try {
            apiInstance.downloadAgentOrchestrationWithVersion(orchestrationType, version);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadAgentOrchestrationWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |
| **version** | **String**| The requested version of the OneAgent orchestration deployment tarball in &#x60;0.1.0.20200925-120822&#x60; format. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadAgentOrchestrationWithVersionWithHttpInfo

> ApiResponse<Void> downloadAgentOrchestrationWithVersion downloadAgentOrchestrationWithVersionWithHttpInfo(orchestrationType, version)

Downloads the requested version matching OneAgent deployment orchestration tarball

Downloading the requested version matching deployment orchestration tarball matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        String version = "version_example"; // String | The requested version of the OneAgent orchestration deployment tarball in `0.1.0.20200925-120822` format.
        try {
            ApiResponse<Void> response = apiInstance.downloadAgentOrchestrationWithVersionWithHttpInfo(orchestrationType, version);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadAgentOrchestrationWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |
| **version** | **String**| The requested version of the OneAgent orchestration deployment tarball in &#x60;0.1.0.20200925-120822&#x60; format. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## downloadBoshReleaseWithVersion

> void downloadBoshReleaseWithVersion(osType, version, skipMetadata, networkZone)

Downloads BOSH release tarballs of the specified version, OneAgent included

For SaaS, the call is executed on an Environment ActiveGate. Be sure to use the base of an ActiveGate, **not** the environment.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String version = "version_example"; // String | The required version of the OneAgent in the `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    If not set, `false` is used.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            apiInstance.downloadBoshReleaseWithVersion(osType, version, skipMetadata, networkZone);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadBoshReleaseWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **version** | **String**| The required version of the OneAgent in the &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call. | |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    If not set, &#x60;false&#x60; is used. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the BOSH release tarball file. |  -  |

## downloadBoshReleaseWithVersionWithHttpInfo

> ApiResponse<Void> downloadBoshReleaseWithVersion downloadBoshReleaseWithVersionWithHttpInfo(osType, version, skipMetadata, networkZone)

Downloads BOSH release tarballs of the specified version, OneAgent included

For SaaS, the call is executed on an Environment ActiveGate. Be sure to use the base of an ActiveGate, **not** the environment.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String version = "version_example"; // String | The required version of the OneAgent in the `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    If not set, `false` is used.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            ApiResponse<Void> response = apiInstance.downloadBoshReleaseWithVersionWithHttpInfo(osType, version, skipMetadata, networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadBoshReleaseWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **version** | **String**| The required version of the OneAgent in the &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call. | |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    If not set, &#x60;false&#x60; is used. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the BOSH release tarball file. |  -  |


## downloadGatewayInstallerWithVersion

> void downloadGatewayInstallerWithVersion(osType, version, ifNoneMatch, networkZone, arch)

Downloads the ActiveGate installer of the specified version

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String version = "version_example"; // String | The required version of the ActiveGate installer, in `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of ActiveGate**](https://dt-url.net/kh43rha) call.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Defaults to `amd64`.  * `amd64`: amd64 architecture. * `s390`: S/390 architecture, only supported for Linux.   
        try {
            apiInstance.downloadGatewayInstallerWithVersion(osType, version, ifNoneMatch, networkZone, arch);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadGatewayInstallerWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **version** | **String**| The required version of the ActiveGate installer, in &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of ActiveGate**](https://dt-url.net/kh43rha) call. | |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **networkZone** | **String**| The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247. | [optional] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Defaults to &#x60;amd64&#x60;.  * &#x60;amd64&#x60;: amd64 architecture. * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.    | [optional] [default to all] [enum: all, amd64, s390] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadGatewayInstallerWithVersionWithHttpInfo

> ApiResponse<Void> downloadGatewayInstallerWithVersion downloadGatewayInstallerWithVersionWithHttpInfo(osType, version, ifNoneMatch, networkZone, arch)

Downloads the ActiveGate installer of the specified version

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String version = "version_example"; // String | The required version of the ActiveGate installer, in `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of ActiveGate**](https://dt-url.net/kh43rha) call.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Defaults to `amd64`.  * `amd64`: amd64 architecture. * `s390`: S/390 architecture, only supported for Linux.   
        try {
            ApiResponse<Void> response = apiInstance.downloadGatewayInstallerWithVersionWithHttpInfo(osType, version, ifNoneMatch, networkZone, arch);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadGatewayInstallerWithVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **version** | **String**| The required version of the ActiveGate installer, in &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of ActiveGate**](https://dt-url.net/kh43rha) call. | |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **networkZone** | **String**| The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247. | [optional] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Defaults to &#x60;amd64&#x60;.  * &#x60;amd64&#x60;: amd64 architecture. * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.    | [optional] [default to all] [enum: all, amd64, s390] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## downloadLatestAgentInstaller

> void downloadLatestAgentInstaller(osType, installerType, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone)

Downloads the latest OneAgent installer

For the &#x60;paas&#x60; or &#x60;paas-sh&#x60; installer types you can get a configuring installer, by passing additional parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        Set<String> include = Arrays.asList("All"); // Set<String> | The code modules to be included to the installer. You can specify several modules in the following format: `include=java&include=dotnet`.   Only applicable to the `paas` and `paas-sh` installer types.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    Only applicable to the `paas` and `paas-sh` installer types.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            apiInstance.downloadLatestAgentInstaller(osType, installerType, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestAgentInstaller");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |
| **include** | [**Set&lt;String&gt;**](String.md)| The code modules to be included to the installer. You can specify several modules in the following format: &#x60;include&#x3D;java&amp;include&#x3D;dotnet&#x60;.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [enum: all, java, apache, nginx, nodejs, dotnet, php, go, sdk] |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadLatestAgentInstallerWithHttpInfo

> ApiResponse<Void> downloadLatestAgentInstaller downloadLatestAgentInstallerWithHttpInfo(osType, installerType, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone)

Downloads the latest OneAgent installer

For the &#x60;paas&#x60; or &#x60;paas-sh&#x60; installer types you can get a configuring installer, by passing additional parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        Set<String> include = Arrays.asList("All"); // Set<String> | The code modules to be included to the installer. You can specify several modules in the following format: `include=java&include=dotnet`.   Only applicable to the `paas` and `paas-sh` installer types.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    Only applicable to the `paas` and `paas-sh` installer types.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            ApiResponse<Void> response = apiInstance.downloadLatestAgentInstallerWithHttpInfo(osType, installerType, ifNoneMatch, flavor, arch, bitness, include, skipMetadata, networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestAgentInstaller");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |
| **include** | [**Set&lt;String&gt;**](String.md)| The code modules to be included to the installer. You can specify several modules in the following format: &#x60;include&#x3D;java&amp;include&#x3D;dotnet&#x60;.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [enum: all, java, apache, nginx, nodejs, dotnet, php, go, sdk] |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## downloadLatestAgentOrchestration

> void downloadLatestAgentOrchestration(orchestrationType)

Downloads the latest OneAgent deployment orchestration tarball

Downloading the latest available deployment orchestration script tarball matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        try {
            apiInstance.downloadLatestAgentOrchestration(orchestrationType);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestAgentOrchestration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadLatestAgentOrchestrationWithHttpInfo

> ApiResponse<Void> downloadLatestAgentOrchestration downloadLatestAgentOrchestrationWithHttpInfo(orchestrationType)

Downloads the latest OneAgent deployment orchestration tarball

Downloading the latest available deployment orchestration script tarball matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        try {
            ApiResponse<Void> response = apiInstance.downloadLatestAgentOrchestrationWithHttpInfo(orchestrationType);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestAgentOrchestration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## downloadLatestAgentOrchestrationSignature

> void downloadLatestAgentOrchestrationSignature(orchestrationType)

Downloads the latest OneAgent deployment orchestration tarball&#39;s signature

Downloading the latest available deployment orchestration tarball&#39;s sigature matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        try {
            apiInstance.downloadLatestAgentOrchestrationSignature(orchestrationType);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestAgentOrchestrationSignature");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadLatestAgentOrchestrationSignatureWithHttpInfo

> ApiResponse<Void> downloadLatestAgentOrchestrationSignature downloadLatestAgentOrchestrationSignatureWithHttpInfo(orchestrationType)

Downloads the latest OneAgent deployment orchestration tarball&#39;s signature

Downloading the latest available deployment orchestration tarball&#39;s sigature matching the requested Orchestration Type (ansible, puppet).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String orchestrationType = "ansible"; // String | The Orchestration Type of the orchestration deployment script.
        try {
            ApiResponse<Void> response = apiInstance.downloadLatestAgentOrchestrationSignatureWithHttpInfo(orchestrationType);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestAgentOrchestrationSignature");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orchestrationType** | **String**| The Orchestration Type of the orchestration deployment script. | [enum: ansible, puppet] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## downloadLatestGatewayInstaller

> void downloadLatestGatewayInstaller(osType, ifNoneMatch, networkZone, arch)

Downloads the configured standard ActiveGate installer of the latest version for the specified OS

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Defaults to `amd64`.  * `amd64`: amd64 architecture. * `s390`: S/390 architecture, only supported for Linux.   
        try {
            apiInstance.downloadLatestGatewayInstaller(osType, ifNoneMatch, networkZone, arch);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestGatewayInstaller");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **networkZone** | **String**| The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247. | [optional] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Defaults to &#x60;amd64&#x60;.  * &#x60;amd64&#x60;: amd64 architecture. * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.    | [optional] [default to all] [enum: all, amd64, s390] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |

## downloadLatestGatewayInstallerWithHttpInfo

> ApiResponse<Void> downloadLatestGatewayInstaller downloadLatestGatewayInstallerWithHttpInfo(osType, ifNoneMatch, networkZone, arch)

Downloads the configured standard ActiveGate installer of the latest version for the specified OS

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Defaults to `amd64`.  * `amd64`: amd64 architecture. * `s390`: S/390 architecture, only supported for Linux.   
        try {
            ApiResponse<Void> response = apiInstance.downloadLatestGatewayInstallerWithHttpInfo(osType, ifNoneMatch, networkZone, arch);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#downloadLatestGatewayInstaller");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **networkZone** | **String**| The network zone you want the result to be configured with. Requires at least ActiveGate version 1.247. | [optional] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Defaults to &#x60;amd64&#x60;.  * &#x60;amd64&#x60;: amd64 architecture. * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.    | [optional] [default to all] [enum: all, amd64, s390] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest version of the installer. The response does not contain a payload. |  -  |


## getActiveGateInstallerAvailableVersions

> ActiveGateInstallerVersions getActiveGateInstallerAvailableVersions(osType, arch)

Lists all available versions of ActiveGate installer

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Defaults to `amd64`.  * `amd64`: amd64 architecture. * `s390`: S/390 architecture, only supported for Linux.   
        try {
            ActiveGateInstallerVersions result = apiInstance.getActiveGateInstallerAvailableVersions(osType, arch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getActiveGateInstallerAvailableVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Defaults to &#x60;amd64&#x60;.  * &#x60;amd64&#x60;: amd64 architecture. * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.    | [optional] [default to all] [enum: all, amd64, s390] |

### Return type

[**ActiveGateInstallerVersions**](ActiveGateInstallerVersions.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the available versions. |  -  |
| **404** | Not found. See the response body for details. |  -  |

## getActiveGateInstallerAvailableVersionsWithHttpInfo

> ApiResponse<ActiveGateInstallerVersions> getActiveGateInstallerAvailableVersions getActiveGateInstallerAvailableVersionsWithHttpInfo(osType, arch)

Lists all available versions of ActiveGate installer

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Defaults to `amd64`.  * `amd64`: amd64 architecture. * `s390`: S/390 architecture, only supported for Linux.   
        try {
            ApiResponse<ActiveGateInstallerVersions> response = apiInstance.getActiveGateInstallerAvailableVersionsWithHttpInfo(osType, arch);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getActiveGateInstallerAvailableVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Defaults to &#x60;amd64&#x60;.  * &#x60;amd64&#x60;: amd64 architecture. * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.    | [optional] [default to all] [enum: all, amd64, s390] |

### Return type

ApiResponse<[**ActiveGateInstallerVersions**](ActiveGateInstallerVersions.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the available versions. |  -  |
| **404** | Not found. See the response body for details. |  -  |


## getActiveGateInstallerConnectionInfo

> ActiveGateConnectionInfo getActiveGateInstallerConnectionInfo(networkZone)

Gets the connectivity information for Environment ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            ActiveGateConnectionInfo result = apiInstance.getActiveGateInstallerConnectionInfo(networkZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getActiveGateInstallerConnectionInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type

[**ActiveGateConnectionInfo**](ActiveGateConnectionInfo.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getActiveGateInstallerConnectionInfoWithHttpInfo

> ApiResponse<ActiveGateConnectionInfo> getActiveGateInstallerConnectionInfo getActiveGateInstallerConnectionInfoWithHttpInfo(networkZone)

Gets the connectivity information for Environment ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            ApiResponse<ActiveGateConnectionInfo> response = apiInstance.getActiveGateInstallerConnectionInfoWithHttpInfo(networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getActiveGateInstallerConnectionInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type

ApiResponse<[**ActiveGateConnectionInfo**](ActiveGateConnectionInfo.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAgentInstallerAvailableVersions

> AgentInstallerVersions getAgentInstallerAvailableVersions(osType, installerType, flavor, arch)

Lists all available versions of OneAgent installer

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        try {
            AgentInstallerVersions result = apiInstance.getAgentInstallerAvailableVersions(osType, installerType, flavor, arch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerAvailableVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |

### Return type

[**AgentInstallerVersions**](AgentInstallerVersions.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the available versions. |  -  |

## getAgentInstallerAvailableVersionsWithHttpInfo

> ApiResponse<AgentInstallerVersions> getAgentInstallerAvailableVersions getAgentInstallerAvailableVersionsWithHttpInfo(osType, installerType, flavor, arch)

Lists all available versions of OneAgent installer

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        try {
            ApiResponse<AgentInstallerVersions> response = apiInstance.getAgentInstallerAvailableVersionsWithHttpInfo(osType, installerType, flavor, arch);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerAvailableVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |

### Return type

ApiResponse<[**AgentInstallerVersions**](AgentInstallerVersions.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the available versions. |  -  |


## getAgentInstallerConnectionInfo

> ConnectionInfo getAgentInstallerConnectionInfo(networkZone, version)

Gets the connectivity information for OneAgent

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        String version = "version_example"; // String | The version of the OneAgent for which you're requesting connectivity information, in the `1.221` format.   Set this parameter to get the best format of endpoint list for optimal performance.
        try {
            ConnectionInfo result = apiInstance.getAgentInstallerConnectionInfo(networkZone, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerConnectionInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |
| **version** | **String**| The version of the OneAgent for which you&#39;re requesting connectivity information, in the &#x60;1.221&#x60; format.   Set this parameter to get the best format of endpoint list for optimal performance. | [optional] |

### Return type

[**ConnectionInfo**](ConnectionInfo.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAgentInstallerConnectionInfoWithHttpInfo

> ApiResponse<ConnectionInfo> getAgentInstallerConnectionInfo getAgentInstallerConnectionInfoWithHttpInfo(networkZone, version)

Gets the connectivity information for OneAgent

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        String version = "version_example"; // String | The version of the OneAgent for which you're requesting connectivity information, in the `1.221` format.   Set this parameter to get the best format of endpoint list for optimal performance.
        try {
            ApiResponse<ConnectionInfo> response = apiInstance.getAgentInstallerConnectionInfoWithHttpInfo(networkZone, version);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerConnectionInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |
| **version** | **String**| The version of the OneAgent for which you&#39;re requesting connectivity information, in the &#x60;1.221&#x60; format.   Set this parameter to get the best format of endpoint list for optimal performance. | [optional] |

### Return type

ApiResponse<[**ConnectionInfo**](ConnectionInfo.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAgentInstallerConnectionInfoEndpoints

> void getAgentInstallerConnectionInfoEndpoints(networkZone)

Gets the list of the ActiveGate-Endpoints to be used for Agents ordered by networkzone-priorities.

Highest priority first, separated by a semicolon.If no network zone provided the default zone is used. Responds with 404 if network zone is not known.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String networkZone = "networkZone_example"; // String | 
        try {
            apiInstance.getAgentInstallerConnectionInfoEndpoints(networkZone);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerConnectionInfoEndpoints");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkZone** | **String**|  | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAgentInstallerConnectionInfoEndpointsWithHttpInfo

> ApiResponse<Void> getAgentInstallerConnectionInfoEndpoints getAgentInstallerConnectionInfoEndpointsWithHttpInfo(networkZone)

Gets the list of the ActiveGate-Endpoints to be used for Agents ordered by networkzone-priorities.

Highest priority first, separated by a semicolon.If no network zone provided the default zone is used. Responds with 404 if network zone is not known.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String networkZone = "networkZone_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.getAgentInstallerConnectionInfoEndpointsWithHttpInfo(networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerConnectionInfoEndpoints");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkZone** | **String**|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAgentInstallerMetaInfo

> InstallerMetaInfoDto getAgentInstallerMetaInfo(osType, installerType, flavor, arch, bitness)

Gets the latest available version of a OneAgent installer

If a [standard version](https://dt-url.net/ml03yye) is configured, then this is the downloaded version.   Non-required parameters are only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        try {
            InstallerMetaInfoDto result = apiInstance.getAgentInstallerMetaInfo(osType, installerType, flavor, arch, bitness);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerMetaInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |

### Return type

[**InstallerMetaInfoDto**](InstallerMetaInfoDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAgentInstallerMetaInfoWithHttpInfo

> ApiResponse<InstallerMetaInfoDto> getAgentInstallerMetaInfo getAgentInstallerMetaInfoWithHttpInfo(osType, installerType, flavor, arch, bitness)

Gets the latest available version of a OneAgent installer

If a [standard version](https://dt-url.net/ml03yye) is configured, then this is the downloaded version.   Non-required parameters are only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "default"; // String | The type of the installer:   * `default`: Self-extracting installer for manual installation. Downloads an `.exe` file for Windows or an `.sh` file for Unix.  * `default-unattended`: Self-extracting installer for unattended installation. Windows only. Downloads a `.zip` archive, containing the `.msi` installer and the batch file. This option is deprecated with OneAgent version 1.173  * `paas`: Code modules installer. Downloads a `*.zip` archive, containing the `manifest.json` file with meta information or a `.jar` file for z/OS.  * `paas-sh`: Code modules installer. Downloads a self-extracting shell script with the embedded `tar.gz` archive.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        try {
            ApiResponse<InstallerMetaInfoDto> response = apiInstance.getAgentInstallerMetaInfoWithHttpInfo(osType, installerType, flavor, arch, bitness);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerMetaInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer:   * &#x60;default&#x60;: Self-extracting installer for manual installation. Downloads an &#x60;.exe&#x60; file for Windows or an &#x60;.sh&#x60; file for Unix.  * &#x60;default-unattended&#x60;: Self-extracting installer for unattended installation. Windows only. Downloads a &#x60;.zip&#x60; archive, containing the &#x60;.msi&#x60; installer and the batch file. This option is deprecated with OneAgent version 1.173  * &#x60;paas&#x60;: Code modules installer. Downloads a &#x60;*.zip&#x60; archive, containing the &#x60;manifest.json&#x60; file with meta information or a &#x60;.jar&#x60; file for z/OS.  * &#x60;paas-sh&#x60;: Code modules installer. Downloads a self-extracting shell script with the embedded &#x60;tar.gz&#x60; archive. | [enum: default, default-unattended, paas, paas-sh] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |

### Return type

ApiResponse<[**InstallerMetaInfoDto**](InstallerMetaInfoDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAgentInstallerWithVersionChecksum

> OneAgentInstallerChecksum getAgentInstallerWithVersionChecksum(osType, installerType, version, skipMetadata, ifNoneMatch, flavor, arch, bitness, include, networkZone)

Gets the checksum of the specified OneAgent installer

The checksum is the sha256 hash of the installer file.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "paas"; // String | The type of the installer.
        String version = "version_example"; // String | The required version of the OneAgent in `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call.
        Boolean skipMetadata = true; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    Only applicable to the `paas` and `paas-sh` installer types.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        Set<String> include = Arrays.asList("All"); // Set<String> | The code modules to be included to the installer. You can specify several modules in the following format: `include=java&include=dotnet`.   Only applicable to the `paas` and `paas-sh` installer types.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            OneAgentInstallerChecksum result = apiInstance.getAgentInstallerWithVersionChecksum(osType, installerType, version, skipMetadata, ifNoneMatch, flavor, arch, bitness, include, networkZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerWithVersionChecksum");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer. | [enum: paas] |
| **version** | **String**| The required version of the OneAgent in &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call. | |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [default to true] |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |
| **include** | [**Set&lt;String&gt;**](String.md)| The code modules to be included to the installer. You can specify several modules in the following format: &#x60;include&#x3D;java&amp;include&#x3D;dotnet&#x60;.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [enum: all, java, apache, nginx, nodejs, dotnet, php, go, sdk] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type

[**OneAgentInstallerChecksum**](OneAgentInstallerChecksum.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest OneAgent installed. |  -  |

## getAgentInstallerWithVersionChecksumWithHttpInfo

> ApiResponse<OneAgentInstallerChecksum> getAgentInstallerWithVersionChecksum getAgentInstallerWithVersionChecksumWithHttpInfo(osType, installerType, version, skipMetadata, ifNoneMatch, flavor, arch, bitness, include, networkZone)

Gets the checksum of the specified OneAgent installer

The checksum is the sha256 hash of the installer file.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String installerType = "paas"; // String | The type of the installer.
        String version = "version_example"; // String | The required version of the OneAgent in `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call.
        Boolean skipMetadata = true; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    Only applicable to the `paas` and `paas-sh` installer types.
        String ifNoneMatch = "ifNoneMatch_example"; // String | The ETag of the previous request. Do not download if it matches the ETag of the installer.
        String flavor = "default"; // String | The flavor of your Linux distribution:   * `musl` for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * 'multidistro` for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the `paas` and `paas-sh` installer types.
        String arch = "all"; // String | The architecture of your OS:   * `all`: Use this value for AIX and z/OS. Defaults to `x86` for other OS types.  * `x86`: x86 architecture. * `ppc`: PowerPC architecture, only supported for AIX and Linux. * `ppcle`: PowerPC Little Endian architecture, only supported for Linux. * `sparc`: Sparc architecture, only supported for Solaris.   * `arm`: ARM architecture, only supported for Linux.   * `s390`: S/390 architecture, only supported for Linux.   Only applicable to the `paas` and `paas-sh` installer types.
        String bitness = "32"; // String | The bitness of your OS. Must be supported by the OS.    Only applicable to the `paas` and `paas-sh` installer types.
        Set<String> include = Arrays.asList("All"); // Set<String> | The code modules to be included to the installer. You can specify several modules in the following format: `include=java&include=dotnet`.   Only applicable to the `paas` and `paas-sh` installer types.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            ApiResponse<OneAgentInstallerChecksum> response = apiInstance.getAgentInstallerWithVersionChecksumWithHttpInfo(osType, installerType, version, skipMetadata, ifNoneMatch, flavor, arch, bitness, include, networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentInstallerWithVersionChecksum");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix, aix, solaris, zos] |
| **installerType** | **String**| The type of the installer. | [enum: paas] |
| **version** | **String**| The required version of the OneAgent in &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of OneAgent**](https://dt-url.net/fo23rb5) call. | |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [default to true] |
| **ifNoneMatch** | **String**| The ETag of the previous request. Do not download if it matches the ETag of the installer. | [optional] |
| **flavor** | **String**| The flavor of your Linux distribution:   * &#x60;musl&#x60; for Linux distributions, which are using the musl C standard library, for example Alpine Linux.  * &#39;multidistro&#x60; for all Linux distributions which are using musl C and glibc standard library.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to default] [enum: default, multidistro, musl] |
| **arch** | **String**| The architecture of your OS:   * &#x60;all&#x60;: Use this value for AIX and z/OS. Defaults to &#x60;x86&#x60; for other OS types.  * &#x60;x86&#x60;: x86 architecture. * &#x60;ppc&#x60;: PowerPC architecture, only supported for AIX and Linux. * &#x60;ppcle&#x60;: PowerPC Little Endian architecture, only supported for Linux. * &#x60;sparc&#x60;: Sparc architecture, only supported for Solaris.   * &#x60;arm&#x60;: ARM architecture, only supported for Linux.   * &#x60;s390&#x60;: S/390 architecture, only supported for Linux.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: all, arm, ppc, ppcle, s390, sparc, x86] |
| **bitness** | **String**| The bitness of your OS. Must be supported by the OS.    Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [default to all] [enum: 32, 64, all] |
| **include** | [**Set&lt;String&gt;**](String.md)| The code modules to be included to the installer. You can specify several modules in the following format: &#x60;include&#x3D;java&amp;include&#x3D;dotnet&#x60;.   Only applicable to the &#x60;paas&#x60; and &#x60;paas-sh&#x60; installer types. | [optional] [enum: all, java, apache, nginx, nodejs, dotnet, php, go, sdk] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type

ApiResponse<[**OneAgentInstallerChecksum**](OneAgentInstallerChecksum.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the installer file. |  -  |
| **304** | Not modified. You already have the latest OneAgent installed. |  -  |


## getAgentProcessModuleConfig

> AgentProcessModuleConfigResponse getAgentProcessModuleConfig(revision)

Gets the latest process module config | maturity&#x3D;EARLY_ADOPTER

Returns the latest process module config. Passing a previously gotten revision will first do a revision check, and return a 304 response if no changes were detected.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        Long revision = 56L; // Long | The previously received revision to compare against.
        try {
            AgentProcessModuleConfigResponse result = apiInstance.getAgentProcessModuleConfig(revision);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentProcessModuleConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **revision** | **Long**| The previously received revision to compare against. | [optional] |

### Return type

[**AgentProcessModuleConfigResponse**](AgentProcessModuleConfigResponse.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **304** | Not modified. |  -  |

## getAgentProcessModuleConfigWithHttpInfo

> ApiResponse<AgentProcessModuleConfigResponse> getAgentProcessModuleConfig getAgentProcessModuleConfigWithHttpInfo(revision)

Gets the latest process module config | maturity&#x3D;EARLY_ADOPTER

Returns the latest process module config. Passing a previously gotten revision will first do a revision check, and return a 304 response if no changes were detected.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        Long revision = 56L; // Long | The previously received revision to compare against.
        try {
            ApiResponse<AgentProcessModuleConfigResponse> response = apiInstance.getAgentProcessModuleConfigWithHttpInfo(revision);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getAgentProcessModuleConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **revision** | **Long**| The previously received revision to compare against. | [optional] |

### Return type

ApiResponse<[**AgentProcessModuleConfigResponse**](AgentProcessModuleConfigResponse.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **304** | Not modified. |  -  |


## getBoshReleaseAvailableVersions

> BoshReleaseAvailableVersions getBoshReleaseAvailableVersions(osType)

Gets the list of available OneAgent versions for BOSH release tarballs

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        try {
            BoshReleaseAvailableVersions result = apiInstance.getBoshReleaseAvailableVersions(osType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getBoshReleaseAvailableVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |

### Return type

[**BoshReleaseAvailableVersions**](BoshReleaseAvailableVersions.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getBoshReleaseAvailableVersionsWithHttpInfo

> ApiResponse<BoshReleaseAvailableVersions> getBoshReleaseAvailableVersions getBoshReleaseAvailableVersionsWithHttpInfo(osType)

Gets the list of available OneAgent versions for BOSH release tarballs

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        try {
            ApiResponse<BoshReleaseAvailableVersions> response = apiInstance.getBoshReleaseAvailableVersionsWithHttpInfo(osType);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getBoshReleaseAvailableVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |

### Return type

ApiResponse<[**BoshReleaseAvailableVersions**](BoshReleaseAvailableVersions.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getBoshReleaseChecksum

> BoshReleaseChecksum getBoshReleaseChecksum(osType, version, skipMetadata, networkZone)

Gets the checksum of the specified BOSH release tarball

The checksum is the sha256 hash of the installer file.   Result is not stable if **skipMetadata** is set to &#x60;false&#x60;.  For SaaS only works on environment ActiveGates version 1.176 or higher

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String version = "version_example"; // String | The required version of the OneAgent in the `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    If not set, `false` is used.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            BoshReleaseChecksum result = apiInstance.getBoshReleaseChecksum(osType, version, skipMetadata, networkZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getBoshReleaseChecksum");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **version** | **String**| The required version of the OneAgent in the &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call. | |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    If not set, &#x60;false&#x60; is used. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type

[**BoshReleaseChecksum**](BoshReleaseChecksum.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getBoshReleaseChecksumWithHttpInfo

> ApiResponse<BoshReleaseChecksum> getBoshReleaseChecksum getBoshReleaseChecksumWithHttpInfo(osType, version, skipMetadata, networkZone)

Gets the checksum of the specified BOSH release tarball

The checksum is the sha256 hash of the installer file.   Result is not stable if **skipMetadata** is set to &#x60;false&#x60;.  For SaaS only works on environment ActiveGates version 1.176 or higher

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        String osType = "windows"; // String | The operating system of the installer.
        String version = "version_example"; // String | The required version of the OneAgent in the `1.155.275.20181112-084458` format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call.
        Boolean skipMetadata = false; // Boolean | Set `true` to omit the OneAgent connectivity information from the installer.    If not set, `false` is used.
        String networkZone = "networkZone_example"; // String | The network zone you want the result to be configured with.
        try {
            ApiResponse<BoshReleaseChecksum> response = apiInstance.getBoshReleaseChecksumWithHttpInfo(osType, version, skipMetadata, networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getBoshReleaseChecksum");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **osType** | **String**| The operating system of the installer. | [enum: windows, unix] |
| **version** | **String**| The required version of the OneAgent in the &#x60;1.155.275.20181112-084458&#x60; format.   You can retrieve the list of available versions with the [**GET available versions of BOSH tarballs**](https://dt-url.net/j703kdn) call. | |
| **skipMetadata** | **Boolean**| Set &#x60;true&#x60; to omit the OneAgent connectivity information from the installer.    If not set, &#x60;false&#x60; is used. | [optional] [default to false] |
| **networkZone** | **String**| The network zone you want the result to be configured with. | [optional] |

### Return type

ApiResponse<[**BoshReleaseChecksum**](BoshReleaseChecksum.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getLatestLambdaBuildUnits

> LatestLambdaLayerNames getLatestLambdaBuildUnits()

Get the latest version names of the OneAgent for AWS Lambda

Get the latest version names of the OneAgent for the Java, Node.js, and Python AWS Lambda runtime.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        try {
            LatestLambdaLayerNames result = apiInstance.getLatestLambdaBuildUnits();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getLatestLambdaBuildUnits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**LatestLambdaLayerNames**](LatestLambdaLayerNames.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the available versions. |  -  |

## getLatestLambdaBuildUnitsWithHttpInfo

> ApiResponse<LatestLambdaLayerNames> getLatestLambdaBuildUnits getLatestLambdaBuildUnitsWithHttpInfo()

Get the latest version names of the OneAgent for AWS Lambda

Get the latest version names of the OneAgent for the Java, Node.js, and Python AWS Lambda runtime.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.DeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DeploymentApi apiInstance = new DeploymentApi(defaultClient);
        try {
            ApiResponse<LatestLambdaLayerNames> response = apiInstance.getLatestLambdaBuildUnitsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeploymentApi#getLatestLambdaBuildUnits");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**LatestLambdaLayerNames**](LatestLambdaLayerNames.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The payload contains the available versions. |  -  |

