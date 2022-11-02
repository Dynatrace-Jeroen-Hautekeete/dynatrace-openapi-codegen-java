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
import com.dynatrace.apis.envv2.model.Releases;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ReleasesApi
 */
@Ignore
public class ReleasesApiTest {

    private final ReleasesApi api = new ReleasesApi();

    
    /**
     * Returns all releases
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReleasesTest() throws ApiException {
        String from = null;
        String to = null;
        String nextPageKey = null;
        Long pageSize = null;
        Boolean demo = null;
        String releasesSelector = null;
        String sort = null;
        Releases response = 
        api.getReleases(from, to, nextPageKey, pageSize, demo, releasesSelector, sort);
        
        // TODO: test validations
    }
    
}
