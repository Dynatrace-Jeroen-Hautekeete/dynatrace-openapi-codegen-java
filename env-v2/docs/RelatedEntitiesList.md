

# RelatedEntitiesList

A list of related entities of the security problem.   A related entity is a monitored entity that is directly or indirectly related to an *affected entity* (for example, it could be a host where an affected process runs).   Each related entity contains a list of corresponding affected entities (for example, an affected process running on this host).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applications** | [**List&lt;RelatedEntity&gt;**](RelatedEntity.md) | A list of related applications. |  [optional] [readonly] |
|**services** | [**List&lt;RelatedService&gt;**](RelatedService.md) | A list of related services. |  [optional] [readonly] |
|**hosts** | [**List&lt;RelatedEntity&gt;**](RelatedEntity.md) | A list of related hosts. |  [optional] [readonly] |
|**databases** | **List&lt;String&gt;** | A list of related databases. |  [optional] [readonly] |
|**kubernetesWorkloads** | [**List&lt;RelatedEntity&gt;**](RelatedEntity.md) | A list of related Kubernetes workloads. |  [optional] [readonly] |
|**kubernetesClusters** | [**List&lt;RelatedEntity&gt;**](RelatedEntity.md) | A list of related Kubernetes clusters. |  [optional] [readonly] |



