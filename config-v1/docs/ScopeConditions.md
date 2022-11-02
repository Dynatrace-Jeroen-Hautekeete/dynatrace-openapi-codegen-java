

# ScopeConditions

Conditions for data capturing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceTechnology** | [**ServiceTechnologyEnum**](#ServiceTechnologyEnum) | Only applies to this service technology. |  [optional] |
|**processGroup** | **String** | Only applies to this process group. Note that this can&#39;t be transferred between different clusters or environments. |  [optional] |
|**hostGroup** | **String** | Only applies to this host group. |  [optional] |
|**tagOfProcessGroup** | **String** | Only apply to process groups matching this tag. |  [optional] |



## Enum: ServiceTechnologyEnum

| Name | Value |
|---- | -----|
| ACTIVE_MQ | &quot;ACTIVE_MQ&quot; |
| ACTIVE_MQ_ARTEMIS | &quot;ACTIVE_MQ_ARTEMIS&quot; |
| ADO_NET | &quot;ADO_NET&quot; |
| AIX | &quot;AIX&quot; |
| AKKA | &quot;AKKA&quot; |
| AMAZON_REDSHIFT | &quot;AMAZON_REDSHIFT&quot; |
| AMQP | &quot;AMQP&quot; |
| APACHE_CAMEL | &quot;APACHE_CAMEL&quot; |
| APACHE_CASSANDRA | &quot;APACHE_CASSANDRA&quot; |
| APACHE_COUCH_DB | &quot;APACHE_COUCH_DB&quot; |
| APACHE_DERBY | &quot;APACHE_DERBY&quot; |
| APACHE_HTTP_CLIENT_ASYNC | &quot;APACHE_HTTP_CLIENT_ASYNC&quot; |
| APACHE_HTTP_CLIENT_SYNC | &quot;APACHE_HTTP_CLIENT_SYNC&quot; |
| APACHE_HTTP_SERVER | &quot;APACHE_HTTP_SERVER&quot; |
| APACHE_KAFKA | &quot;APACHE_KAFKA&quot; |
| APACHE_LOG4J | &quot;APACHE_LOG4J&quot; |
| APACHE_SOLR | &quot;APACHE_SOLR&quot; |
| APACHE_STORM | &quot;APACHE_STORM&quot; |
| APACHE_SYNAPSE | &quot;APACHE_SYNAPSE&quot; |
| APACHE_TOMCAT | &quot;APACHE_TOMCAT&quot; |
| APPARMOR | &quot;APPARMOR&quot; |
| APPLICATION_INSIGHTS_SDK | &quot;APPLICATION_INSIGHTS_SDK&quot; |
| ASP_DOTNET | &quot;ASP_DOTNET&quot; |
| ASP_DOTNET_CORE | &quot;ASP_DOTNET_CORE&quot; |
| ASP_DOTNET_CORE_SIGNALR | &quot;ASP_DOTNET_CORE_SIGNALR&quot; |
| ASP_DOTNET_SIGNALR | &quot;ASP_DOTNET_SIGNALR&quot; |
| ASYNC_HTTP_CLIENT | &quot;ASYNC_HTTP_CLIENT&quot; |
| AWS_DYNAMO_DB | &quot;AWS_DYNAMO_DB&quot; |
| AWS_LAMBDA | &quot;AWS_LAMBDA&quot; |
| AWS_RDS | &quot;AWS_RDS&quot; |
| AWS_SERVICE | &quot;AWS_SERVICE&quot; |
| AXIS | &quot;AXIS&quot; |
| AZURE_FUNCTIONS | &quot;AZURE_FUNCTIONS&quot; |
| AZURE_SERVICE_BUS | &quot;AZURE_SERVICE_BUS&quot; |
| AZURE_SERVICE_FABRIC | &quot;AZURE_SERVICE_FABRIC&quot; |
| AZURE_STORAGE | &quot;AZURE_STORAGE&quot; |
| BOSHBPM | &quot;BOSHBPM&quot; |
| CICS_FILE_ACCESS | &quot;CICS_FILE_ACCESS&quot; |
| CITRIX | &quot;CITRIX&quot; |
| CITRIX_COMMON | &quot;CITRIX_COMMON&quot; |
| CITRIX_DESKTOP_DELIVERY_CONTROLLERS | &quot;CITRIX_DESKTOP_DELIVERY_CONTROLLERS&quot; |
| CITRIX_DIRECTOR | &quot;CITRIX_DIRECTOR&quot; |
| CITRIX_LICENSE_SERVER | &quot;CITRIX_LICENSE_SERVER&quot; |
| CITRIX_PROVISIONING_SERVICES | &quot;CITRIX_PROVISIONING_SERVICES&quot; |
| CITRIX_STOREFRONT | &quot;CITRIX_STOREFRONT&quot; |
| CITRIX_VIRTUAL_DELIVERY_AGENT | &quot;CITRIX_VIRTUAL_DELIVERY_AGENT&quot; |
| CITRIX_WORKSPACE_ENVIRONMENT_MANAGEMENT | &quot;CITRIX_WORKSPACE_ENVIRONMENT_MANAGEMENT&quot; |
| CITRIX_XEN | &quot;CITRIX_XEN&quot; |
| CLOUDFOUNDRY | &quot;CLOUDFOUNDRY&quot; |
| CLOUDFOUNDRY_AUCTIONEER | &quot;CLOUDFOUNDRY_AUCTIONEER&quot; |
| CLOUDFOUNDRY_BOSH | &quot;CLOUDFOUNDRY_BOSH&quot; |
| CLOUDFOUNDRY_GOROUTER | &quot;CLOUDFOUNDRY_GOROUTER&quot; |
| COLDFUSION | &quot;COLDFUSION&quot; |
| CONFLUENT_KAFKA_CLIENT | &quot;CONFLUENT_KAFKA_CLIENT&quot; |
| CONTAINERD | &quot;CONTAINERD&quot; |
| CORE_DNS | &quot;CORE_DNS&quot; |
| COUCHBASE | &quot;COUCHBASE&quot; |
| CRIO | &quot;CRIO&quot; |
| CXF | &quot;CXF&quot; |
| DATASTAX | &quot;DATASTAX&quot; |
| DB2 | &quot;DB2&quot; |
| DIEGO_CELL | &quot;DIEGO_CELL&quot; |
| DOCKER | &quot;DOCKER&quot; |
| DOTNET | &quot;DOTNET&quot; |
| DOTNET_REMOTING | &quot;DOTNET_REMOTING&quot; |
| ELASTIC_SEARCH | &quot;ELASTIC_SEARCH&quot; |
| ENVOY | &quot;ENVOY&quot; |
| ERLANG | &quot;ERLANG&quot; |
| ETCD | &quot;ETCD&quot; |
| F5_LTM | &quot;F5_LTM&quot; |
| FSHARP | &quot;FSHARP&quot; |
| GARDEN | &quot;GARDEN&quot; |
| GLASSFISH | &quot;GLASSFISH&quot; |
| GO | &quot;GO&quot; |
| GOOGLE_CLOUD_FUNCTIONS | &quot;GOOGLE_CLOUD_FUNCTIONS&quot; |
| GRAAL_TRUFFLE | &quot;GRAAL_TRUFFLE&quot; |
| GRAPH_QL | &quot;GRAPH_QL&quot; |
| GRPC | &quot;GRPC&quot; |
| GRSECURITY | &quot;GRSECURITY&quot; |
| HADOOP | &quot;HADOOP&quot; |
| HADOOP_HDFS | &quot;HADOOP_HDFS&quot; |
| HADOOP_YARN | &quot;HADOOP_YARN&quot; |
| HAPROXY | &quot;HAPROXY&quot; |
| HEAT | &quot;HEAT&quot; |
| HESSIAN | &quot;HESSIAN&quot; |
| HORNET_Q | &quot;HORNET_Q&quot; |
| IBM_CICS_REGION | &quot;IBM_CICS_REGION&quot; |
| IBM_CICS_TRANSACTION_GATEWAY | &quot;IBM_CICS_TRANSACTION_GATEWAY&quot; |
| IBM_IMS_CONNECT_REGION | &quot;IBM_IMS_CONNECT_REGION&quot; |
| IBM_IMS_CONTROL_REGION | &quot;IBM_IMS_CONTROL_REGION&quot; |
| IBM_IMS_MESSAGE_PROCESSING_REGION | &quot;IBM_IMS_MESSAGE_PROCESSING_REGION&quot; |
| IBM_IMS_SOAP_GATEWAY | &quot;IBM_IMS_SOAP_GATEWAY&quot; |
| IBM_INTEGRATION_BUS | &quot;IBM_INTEGRATION_BUS&quot; |
| IBM_MQ | &quot;IBM_MQ&quot; |
| IBM_MQ_CLIENT | &quot;IBM_MQ_CLIENT&quot; |
| IBM_WEBSHPRERE_APPLICATION_SERVER | &quot;IBM_WEBSHPRERE_APPLICATION_SERVER&quot; |
| IBM_WEBSHPRERE_LIBERTY | &quot;IBM_WEBSHPRERE_LIBERTY&quot; |
| IBM_WEBSPHERE_APPLICATION_SERVER | &quot;IBM_WEBSPHERE_APPLICATION_SERVER&quot; |
| IBM_WEBSPHERE_LIBERTY | &quot;IBM_WEBSPHERE_LIBERTY&quot; |
| IIS | &quot;IIS&quot; |
| IIS_APP_POOL | &quot;IIS_APP_POOL&quot; |
| ISTIO | &quot;ISTIO&quot; |
| JAVA | &quot;JAVA&quot; |
| JAX_WS | &quot;JAX_WS&quot; |
| JBOSS | &quot;JBOSS&quot; |
| JBOSS_EAP | &quot;JBOSS_EAP&quot; |
| JDK_HTTP_SERVER | &quot;JDK_HTTP_SERVER&quot; |
| JERSEY | &quot;JERSEY&quot; |
| JETTY | &quot;JETTY&quot; |
| JRUBY | &quot;JRUBY&quot; |
| JYTHON | &quot;JYTHON&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |
| LIBC | &quot;LIBC&quot; |
| LIBVIRT | &quot;LIBVIRT&quot; |
| LINKERD | &quot;LINKERD&quot; |
| LINUX_SYSTEM | &quot;LINUX_SYSTEM&quot; |
| MARIADB | &quot;MARIADB&quot; |
| MEMCACHED | &quot;MEMCACHED&quot; |
| MICROSOFT_SQL_SERVER | &quot;MICROSOFT_SQL_SERVER&quot; |
| MONGODB | &quot;MONGODB&quot; |
| MSSQL_CLIENT | &quot;MSSQL_CLIENT&quot; |
| MULE_ESB | &quot;MULE_ESB&quot; |
| MYSQL | &quot;MYSQL&quot; |
| MYSQL_CONNECTOR | &quot;MYSQL_CONNECTOR&quot; |
| NETFLIX_SERVO | &quot;NETFLIX_SERVO&quot; |
| NETTY | &quot;NETTY&quot; |
| NGINX | &quot;NGINX&quot; |
| NODE_JS | &quot;NODE_JS&quot; |
| OK_HTTP_CLIENT | &quot;OK_HTTP_CLIENT&quot; |
| ONEAGENT_SDK | &quot;ONEAGENT_SDK&quot; |
| OPENCENSUS | &quot;OPENCENSUS&quot; |
| OPENSHIFT | &quot;OPENSHIFT&quot; |
| OPENSTACK_COMPUTE | &quot;OPENSTACK_COMPUTE&quot; |
| OPENSTACK_CONTROLLER | &quot;OPENSTACK_CONTROLLER&quot; |
| OPENTELEMETRY | &quot;OPENTELEMETRY&quot; |
| OPENTRACING | &quot;OPENTRACING&quot; |
| OPEN_LIBERTY | &quot;OPEN_LIBERTY&quot; |
| ORACLE_DATABASE | &quot;ORACLE_DATABASE&quot; |
| ORACLE_WEBLOGIC | &quot;ORACLE_WEBLOGIC&quot; |
| OWIN | &quot;OWIN&quot; |
| PERL | &quot;PERL&quot; |
| PHP | &quot;PHP&quot; |
| PHP_FPM | &quot;PHP_FPM&quot; |
| PLAY | &quot;PLAY&quot; |
| POSTGRE_SQL | &quot;POSTGRE_SQL&quot; |
| POSTGRE_SQL_DOTNET_DATA_PROVIDER | &quot;POSTGRE_SQL_DOTNET_DATA_PROVIDER&quot; |
| POWER_DNS | &quot;POWER_DNS&quot; |
| PROGRESS | &quot;PROGRESS&quot; |
| PYTHON | &quot;PYTHON&quot; |
| QOS_LOGBACK | &quot;QOS_LOGBACK&quot; |
| RABBIT_MQ | &quot;RABBIT_MQ&quot; |
| REACTOR_CORE | &quot;REACTOR_CORE&quot; |
| REDIS | &quot;REDIS&quot; |
| RESTEASY | &quot;RESTEASY&quot; |
| RESTLET | &quot;RESTLET&quot; |
| RIAK | &quot;RIAK&quot; |
| RSOCKET | &quot;RSOCKET&quot; |
| RUBY | &quot;RUBY&quot; |
| RUNC | &quot;RUNC&quot; |
| RXJAVA | &quot;RXJAVA&quot; |
| SAG_WEBMETHODS_IS | &quot;SAG_WEBMETHODS_IS&quot; |
| SAP | &quot;SAP&quot; |
| SAP_HANADB | &quot;SAP_HANADB&quot; |
| SAP_HYBRIS | &quot;SAP_HYBRIS&quot; |
| SAP_MAXDB | &quot;SAP_MAXDB&quot; |
| SAP_SYBASE | &quot;SAP_SYBASE&quot; |
| SCALA | &quot;SCALA&quot; |
| SELINUX | &quot;SELINUX&quot; |
| SHAREPOINT | &quot;SHAREPOINT&quot; |
| SPARK | &quot;SPARK&quot; |
| SPRING | &quot;SPRING&quot; |
| SQLITE | &quot;SQLITE&quot; |
| THRIFT | &quot;THRIFT&quot; |
| TIBCO | &quot;TIBCO&quot; |
| TIBCO_BUSINESS_WORKS | &quot;TIBCO_BUSINESS_WORKS&quot; |
| TIBCO_EMS | &quot;TIBCO_EMS&quot; |
| UNDERTOW_IO | &quot;UNDERTOW_IO&quot; |
| VARNISH_CACHE | &quot;VARNISH_CACHE&quot; |
| VERTX | &quot;VERTX&quot; |
| VIM2 | &quot;VIM2&quot; |
| VIOS | &quot;VIOS&quot; |
| VIRTUAL_MACHINE_KVM | &quot;VIRTUAL_MACHINE_KVM&quot; |
| VIRTUAL_MACHINE_QEMU | &quot;VIRTUAL_MACHINE_QEMU&quot; |
| WILDFLY | &quot;WILDFLY&quot; |
| WINDOWS_CONTAINERS | &quot;WINDOWS_CONTAINERS&quot; |
| WINDOWS_SYSTEM | &quot;WINDOWS_SYSTEM&quot; |
| WINK | &quot;WINK&quot; |
| ZERO_MQ | &quot;ZERO_MQ&quot; |
| ZOS_CONNECT | &quot;ZOS_CONNECT&quot; |



