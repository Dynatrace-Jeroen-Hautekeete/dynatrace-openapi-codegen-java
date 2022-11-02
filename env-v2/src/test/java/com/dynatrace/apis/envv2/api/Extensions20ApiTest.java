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


package com.dynatrace.apis.envv2.api;

import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.model.CreateMonitoringConfiguration207ResponseInner;
import com.dynatrace.apis.envv2.model.ErrorEnvelope;
import com.dynatrace.apis.envv2.model.Extension;
import com.dynatrace.apis.envv2.model.ExtensionEnvironmentConfigurationVersion;
import com.dynatrace.apis.envv2.model.ExtensionEventsList;
import com.dynatrace.apis.envv2.model.ExtensionList;
import com.dynatrace.apis.envv2.model.ExtensionMonitoringConfiguration;
import com.dynatrace.apis.envv2.model.ExtensionMonitoringConfigurationsList;
import com.dynatrace.apis.envv2.model.ExtensionStatusDto;
import com.dynatrace.apis.envv2.model.ExtensionUploadResponseDto;
import java.io.File;
import com.dynatrace.apis.envv2.model.MonitoringConfigurationDto;
import com.dynatrace.apis.envv2.model.MonitoringConfigurationResponse;
import com.dynatrace.apis.envv2.model.MonitoringConfigurationUpdateDto;
import com.dynatrace.apis.envv2.model.SchemaDefinitionRestDto;
import com.dynatrace.apis.envv2.model.SchemaFiles;
import com.dynatrace.apis.envv2.model.SchemasList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for Extensions20Api
 */
@Ignore
public class Extensions20ApiTest {

    private final Extensions20Api api = new Extensions20Api();

    
    /**
     * Activates the environment configuration from the specified version of the extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateExtensionEnvironmentConfigurationTest() throws ApiException {
        String extensionName = null;
        ExtensionEnvironmentConfigurationVersion extensionEnvironmentConfigurationVersion = null;
        ExtensionEnvironmentConfigurationVersion response = 
        api.activateExtensionEnvironmentConfiguration(extensionName, extensionEnvironmentConfigurationVersion);
        
        // TODO: test validations
    }
    
    /**
     * Creates new monitoring configuration for the specified extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMonitoringConfigurationTest() throws ApiException {
        String extensionName = null;
        List<MonitoringConfigurationDto> monitoringConfigurationDto = null;
        List<MonitoringConfigurationResponse> response = 
        api.createMonitoringConfiguration(extensionName, monitoringConfigurationDto);
        
        // TODO: test validations
    }
    
    /**
     * Deactivates the environment configuration of the specified extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEnvironmentConfigurationTest() throws ApiException {
        String extensionName = null;
        ExtensionEnvironmentConfigurationVersion response = 
        api.deleteEnvironmentConfiguration(extensionName);
        
        // TODO: test validations
    }
    
    /**
     * Gets the configuration schema of the specified version of the extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extensionConfigurationSchemaTest() throws ApiException {
        String extensionName = null;
        String extensionVersion = null;
        SchemaDefinitionRestDto response = 
        api.extensionConfigurationSchema(extensionName, extensionVersion);
        
        // TODO: test validations
    }
    
    /**
     * Gets details of the specified version of the extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extensionDetailsTest() throws ApiException {
        String extensionName = null;
        String extensionVersion = null;
        String accept = null;
        Extension response = 
        api.extensionDetails(extensionName, extensionVersion, accept);
        
        // TODO: test validations
    }
    
    /**
     * Lists all the monitoring configurations of the specified extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extensionMonitoringConfigurationsTest() throws ApiException {
        String extensionName = null;
        String nextPageKey = null;
        Long pageSize = null;
        String version = null;
        Boolean active = null;
        ExtensionMonitoringConfigurationsList response = 
        api.extensionMonitoringConfigurations(extensionName, nextPageKey, pageSize, version, active);
        
        // TODO: test validations
    }
    
    /**
     * Gets the active environment configuration version of the specified extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveEnvironmentConfigurationTest() throws ApiException {
        String extensionName = null;
        ExtensionEnvironmentConfigurationVersion response = 
        api.getActiveEnvironmentConfiguration(extensionName);
        
        // TODO: test validations
    }
    
    /**
     * List of the latest extension environment configuration events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentConfigurationEventsTest() throws ApiException {
        String extensionName = null;
        String from = null;
        String to = null;
        String content = null;
        String status = null;
        ExtensionEventsList response = 
        api.getEnvironmentConfigurationEvents(extensionName, from, to, content, status);
        
        // TODO: test validations
    }
    
    /**
     * Gets the list of the events linked to specific monitoring configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExtensionMonitoringConfigurationEventsTest() throws ApiException {
        String extensionName = null;
        String configurationId = null;
        String from = null;
        String to = null;
        String dtEntityHost = null;
        String dtActiveGateId = null;
        String dtExtensionDs = null;
        String content = null;
        String status = null;
        ExtensionEventsList response = 
        api.getExtensionMonitoringConfigurationEvents(extensionName, configurationId, from, to, dtEntityHost, dtActiveGateId, dtExtensionDs, content, status);
        
        // TODO: test validations
    }
    
    /**
     * Gets the most recent status of the execution of given monitoring configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExtensionMonitoringConfigurationStatusTest() throws ApiException {
        String extensionName = null;
        String configurationId = null;
        ExtensionStatusDto response = 
        api.getExtensionMonitoringConfigurationStatus(extensionName, configurationId);
        
        // TODO: test validations
    }
    
    /**
     * Gets the extension 2.0 schema file in the specified version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchemaFileTest() throws ApiException {
        String schemaVersion = null;
        String fileName = null;
        Object response = 
        api.getSchemaFile(schemaVersion, fileName);
        
        // TODO: test validations
    }
    
    /**
     * Lists all versions of the extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExtensionVersionsTest() throws ApiException {
        String extensionName = null;
        String nextPageKey = null;
        Long pageSize = null;
        ExtensionList response = 
        api.listExtensionVersions(extensionName, nextPageKey, pageSize);
        
        // TODO: test validations
    }
    
    /**
     * Lists all the extensions 2.0 available in your environment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExtensionsTest() throws ApiException {
        String nextPageKey = null;
        Long pageSize = null;
        String name = null;
        ExtensionList response = 
        api.listExtensions(nextPageKey, pageSize, name);
        
        // TODO: test validations
    }
    
    /**
     * Lists all the files available for the specified extension 2.0 schema version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSchemaFilesTest() throws ApiException {
        String schemaVersion = null;
        String accept = null;
        SchemaFiles response = 
        api.listSchemaFiles(schemaVersion, accept);
        
        // TODO: test validations
    }
    
    /**
     * Lists all the extension 2.0 schemas versions available in your environment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSchemasTest() throws ApiException {
        SchemasList response = 
        api.listSchemas();
        
        // TODO: test validations
    }
    
    /**
     * Gets the details of the specified monitoring configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void monitoringConfigurationDetailsTest() throws ApiException {
        String extensionName = null;
        String configurationId = null;
        ExtensionMonitoringConfiguration response = 
        api.monitoringConfigurationDetails(extensionName, configurationId);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified version of the extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeExtensionTest() throws ApiException {
        String extensionName = null;
        String extensionVersion = null;
        Extension response = 
        api.removeExtension(extensionName, extensionVersion);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified monitoring configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeMonitoringConfigurationTest() throws ApiException {
        String extensionName = null;
        String configurationId = null;
        
        api.removeMonitoringConfiguration(extensionName, configurationId);
        
        // TODO: test validations
    }
    
    /**
     * Updates the active environment configuration version of the extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateExtensionEnvironmentConfigurationTest() throws ApiException {
        String extensionName = null;
        ExtensionEnvironmentConfigurationVersion extensionEnvironmentConfigurationVersion = null;
        ExtensionEnvironmentConfigurationVersion response = 
        api.updateExtensionEnvironmentConfiguration(extensionName, extensionEnvironmentConfigurationVersion);
        
        // TODO: test validations
    }
    
    /**
     * Updates the specified monitoring configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMonitoringConfigurationTest() throws ApiException {
        String extensionName = null;
        String configurationId = null;
        MonitoringConfigurationUpdateDto monitoringConfigurationUpdateDto = null;
        MonitoringConfigurationResponse response = 
        api.updateMonitoringConfiguration(extensionName, configurationId, monitoringConfigurationUpdateDto);
        
        // TODO: test validations
    }
    
    /**
     * Uploads or verifies a new extension 2.0
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadExtensionTest() throws ApiException {
        File _file = null;
        Boolean validateOnly = null;
        ExtensionUploadResponseDto response = 
        api.uploadExtension(_file, validateOnly);
        
        // TODO: test validations
    }
    
}