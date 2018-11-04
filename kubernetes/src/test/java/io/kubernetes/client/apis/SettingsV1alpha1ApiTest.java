/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
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
import io.kubernetes.client.models.V1alpha1PodPreset;
import io.kubernetes.client.models.V1alpha1PodPresetList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsV1alpha1Api
 */
@Ignore
public class SettingsV1alpha1ApiTest {

    private final SettingsV1alpha1Api api = new SettingsV1alpha1Api();

    
    /**
     * 
     *
     * create a PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedPodPresetTest() throws ApiException {
        String namespace = null;
        V1alpha1PodPreset body = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String dryRun = null;
        V1alpha1PodPreset response = api.createNamespacedPodPreset(namespace, body, includeUninitialized, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedPodPresetTest() throws ApiException {
        String namespace = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedPodPreset(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedPodPresetTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedPodPreset(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
     * list or watch objects of kind PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedPodPresetTest() throws ApiException {
        String namespace = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1alpha1PodPresetList response = api.listNamespacedPodPreset(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPodPresetForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1alpha1PodPresetList response = api.listPodPresetForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedPodPresetTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        V1alpha1PodPreset response = api.patchNamespacedPodPreset(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedPodPresetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1alpha1PodPreset response = api.readNamespacedPodPreset(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PodPreset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedPodPresetTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1alpha1PodPreset body = null;
        String pretty = null;
        String dryRun = null;
        V1alpha1PodPreset response = api.replaceNamespacedPodPreset(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
}
