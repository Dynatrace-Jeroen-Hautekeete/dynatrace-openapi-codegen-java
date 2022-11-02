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

import com.dynatrace.apis.configv1.model.UserActionNamingPlaceholder;
import com.dynatrace.apis.configv1.model.UserActionNamingRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for UserActionNamingSettings
 */
public class UserActionNamingSettingsTest {
    private final UserActionNamingSettings model = new UserActionNamingSettings();

    /**
     * Model tests for UserActionNamingSettings
     */
    @Test
    public void testUserActionNamingSettings() {
        // TODO: test UserActionNamingSettings
    }

    /**
     * Test the property 'placeholders'
     */
    @Test
    public void placeholdersTest() {
        // TODO: test placeholders
    }

    /**
     * Test the property 'loadActionNamingRules'
     */
    @Test
    public void loadActionNamingRulesTest() {
        // TODO: test loadActionNamingRules
    }

    /**
     * Test the property 'xhrActionNamingRules'
     */
    @Test
    public void xhrActionNamingRulesTest() {
        // TODO: test xhrActionNamingRules
    }

    /**
     * Test the property 'customActionNamingRules'
     */
    @Test
    public void customActionNamingRulesTest() {
        // TODO: test customActionNamingRules
    }

    /**
     * Test the property 'ignoreCase'
     */
    @Test
    public void ignoreCaseTest() {
        // TODO: test ignoreCase
    }

    /**
     * Test the property 'useFirstDetectedLoadAction'
     */
    @Test
    public void useFirstDetectedLoadActionTest() {
        // TODO: test useFirstDetectedLoadAction
    }

    /**
     * Test the property 'splitUserActionsByDomain'
     */
    @Test
    public void splitUserActionsByDomainTest() {
        // TODO: test splitUserActionsByDomain
    }

    /**
     * Test the property 'queryParameterCleanups'
     */
    @Test
    public void queryParameterCleanupsTest() {
        // TODO: test queryParameterCleanups
    }

}
