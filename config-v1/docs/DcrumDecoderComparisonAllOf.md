

# DcrumDecoderComparisonAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  [optional] |
|**value** | [**ValueEnum**](#ValueEnum) | The value to compare to. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| ALL_OTHER | &quot;ALL_OTHER&quot; |
| CITRIX_APPFLOW | &quot;CITRIX_APPFLOW&quot; |
| CITRIX_ICA | &quot;CITRIX_ICA&quot; |
| CITRIX_ICA_OVER_SSL | &quot;CITRIX_ICA_OVER_SSL&quot; |
| DB2_DRDA | &quot;DB2_DRDA&quot; |
| HTTP | &quot;HTTP&quot; |
| HTTPS | &quot;HTTPS&quot; |
| HTTP_EXPRESS | &quot;HTTP_EXPRESS&quot; |
| INFORMIX | &quot;INFORMIX&quot; |
| MYSQL | &quot;MYSQL&quot; |
| ORACLE | &quot;ORACLE&quot; |
| SAP_GUI | &quot;SAP_GUI&quot; |
| SAP_GUI_OVER_HTTP | &quot;SAP_GUI_OVER_HTTP&quot; |
| SAP_GUI_OVER_HTTPS | &quot;SAP_GUI_OVER_HTTPS&quot; |
| SAP_HANA_DB | &quot;SAP_HANA_DB&quot; |
| SAP_RFC | &quot;SAP_RFC&quot; |
| SSL | &quot;SSL&quot; |
| TDS | &quot;TDS&quot; |



