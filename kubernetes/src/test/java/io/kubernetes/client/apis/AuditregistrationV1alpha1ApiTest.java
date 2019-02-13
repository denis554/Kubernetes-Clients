/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V1alpha1AuditSink;
import io.kubernetes.client.models.V1alpha1AuditSinkList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditregistrationV1alpha1Api
 */
@Ignore
public class AuditregistrationV1alpha1ApiTest {

    private final AuditregistrationV1alpha1Api api = new AuditregistrationV1alpha1Api();

    
    /**
     * 
     *
     * create an AuditSink
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAuditSinkTest() throws ApiException {
        V1alpha1AuditSink body = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String dryRun = null;
        V1alpha1AuditSink response = api.createAuditSink(body, includeUninitialized, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an AuditSink
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAuditSinkTest() throws ApiException {
        String name = null;
        String pretty = null;
        V1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteAuditSink(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of AuditSink
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionAuditSinkTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionAuditSink(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind AuditSink
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAuditSinkTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1alpha1AuditSinkList response = api.listAuditSink(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified AuditSink
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAuditSinkTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        V1alpha1AuditSink response = api.patchAuditSink(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified AuditSink
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAuditSinkTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1alpha1AuditSink response = api.readAuditSink(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified AuditSink
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAuditSinkTest() throws ApiException {
        String name = null;
        V1alpha1AuditSink body = null;
        String pretty = null;
        String dryRun = null;
        V1alpha1AuditSink response = api.replaceAuditSink(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
}
