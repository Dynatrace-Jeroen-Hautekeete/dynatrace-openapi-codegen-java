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


package com.dynatrace.apis.configv1.api;

import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.model.Dashboard;
import com.dynatrace.apis.configv1.model.DashboardList;
import com.dynatrace.apis.configv1.model.DashboardSharing;
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for DashboardsApi
 */
@Ignore
public class DashboardsApiTest {

    private final DashboardsApi api = new DashboardsApi();

    
    /**
     * Creates a dashboard
     *
     * The body must not provide an ID. An ID is assigned automatically by Dynatrace.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDashboardTest() throws ApiException {
        Dashboard dashboard = null;
        EntityShortRepresentation response = 
        api.createDashboard(dashboard);
        
        // TODO: test validations
    }
    
    /**
     * Deletes the specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDashboardTest() throws ApiException {
        String id = null;
        
        api.deleteDashboard(id);
        
        // TODO: test validations
    }
    
    /**
     * Gets the properties of the specified dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardTest() throws ApiException {
        String id = null;
        Dashboard response = 
        api.getDashboard(id);
        
        // TODO: test validations
    }
    
    /**
     * Gets the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardSharingSettingsTest() throws ApiException {
        String id = null;
        DashboardSharing response = 
        api.getDashboardSharingSettings(id);
        
        // TODO: test validations
    }
    
    /**
     * Lists all dashboards of the environment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDashboardStubsListTest() throws ApiException {
        String owner = null;
        List<String> tags = null;
        DashboardList response = 
        api.getDashboardStubsList(owner, tags);
        
        // TODO: test validations
    }
    
    /**
     * Migrate all the Custom Charting tiles to DataExplorer ones | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void migrateDashboardTest() throws ApiException {
        String dashboardId = null;
        
        api.migrateDashboard(dashboardId);
        
        // TODO: test validations
    }
    
    /**
     * Updates the specified dashboard
     *
     * If the dashboard with the specified ID doesn&#39;t exist, a new dashboard is created
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDashboardTest() throws ApiException {
        String id = null;
        Dashboard dashboard = null;
        EntityShortRepresentation response = 
        api.updateDashboard(id, dashboard);
        
        // TODO: test validations
    }
    
    /**
     * Updates the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShareSettingsTest() throws ApiException {
        String id = null;
        DashboardSharing dashboardSharing = null;
        
        api.updateShareSettings(id, dashboardSharing);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#39;POST /dashboards&#39; request
     *
     * The body must not provide an ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDashboardCreationTest() throws ApiException {
        Dashboard dashboard = null;
        
        api.validateDashboardCreation(dashboard);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#39;PUT /dashboards/{id}&#39; request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDashboardUpdateTest() throws ApiException {
        String id = null;
        Dashboard dashboard = null;
        
        api.validateDashboardUpdate(id, dashboard);
        
        // TODO: test validations
    }
    
    /**
     * Validates the payload for the &#39;PUT /dashboards/{id}/shareSettings&#39; request | maturity&#x3D;EARLY_ADOPTER
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateShareSettingsUpdateTest() throws ApiException {
        String id = null;
        DashboardSharing dashboardSharing = null;
        
        api.validateShareSettingsUpdate(id, dashboardSharing);
        
        // TODO: test validations
    }
    
}