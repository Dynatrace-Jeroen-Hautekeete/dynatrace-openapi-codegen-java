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


package com.dynatrace.apis.envv1.model;

import com.dynatrace.apis.envv1.model.MaintenanceWindowSchedule;
import com.dynatrace.apis.envv1.model.MaintenanceWindowScope;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for MaintenanceWindow
 */
public class MaintenanceWindowTest {
    private final MaintenanceWindow model = new MaintenanceWindow();

    /**
     * Model tests for MaintenanceWindow
     */
    @Test
    public void testMaintenanceWindow() {
        // TODO: test MaintenanceWindow
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'suppressAlerts'
     */
    @Test
    public void suppressAlertsTest() {
        // TODO: test suppressAlerts
    }

    /**
     * Test the property 'suppressProblems'
     */
    @Test
    public void suppressProblemsTest() {
        // TODO: test suppressProblems
    }

    /**
     * Test the property 'scope'
     */
    @Test
    public void scopeTest() {
        // TODO: test scope
    }

    /**
     * Test the property 'schedule'
     */
    @Test
    public void scheduleTest() {
        // TODO: test schedule
    }

}
