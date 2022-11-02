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
import com.dynatrace.apis.envv2.model.ErrorEnvelope;
import com.dynatrace.apis.envv2.model.ExtensionReleaseNotesDto;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for HubCapabilitiesApi
 */
@Ignore
public class HubCapabilitiesApiTest {

    private final HubCapabilitiesApi api = new HubCapabilitiesApi();

    
    /**
     * Sets or updates the release notes of the specified extension release | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReleaseNotesTest() throws ApiException {
        String extensionFQN = null;
        String extensionVersion = null;
        ExtensionReleaseNotesDto extensionReleaseNotesDto = null;
        
        api.updateReleaseNotes(extensionFQN, extensionVersion, extensionReleaseNotesDto);
        
        // TODO: test validations
    }
    
    /**
     * Create/Replace metadata for an extension that does not have Dynatrace distributed metadata. | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadMetadataForExtensionTest() throws ApiException {
        String extensionFQN = null;
        File logo = null;
        String name = null;
        String description = null;
        
        api.uploadMetadataForExtension(extensionFQN, logo, name, description);
        
        // TODO: test validations
    }
    
}