

# OsArchitectureComparison

Comparison for `OS_ARCHITECTURE` attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  |
|**value** | [**ValueEnum**](#ValueEnum) | The value to compare to. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| ARM | &quot;ARM&quot; |
| IA64 | &quot;IA64&quot; |
| PARISC | &quot;PARISC&quot; |
| PPC | &quot;PPC&quot; |
| PPCLE | &quot;PPCLE&quot; |
| S390 | &quot;S390&quot; |
| SPARC | &quot;SPARC&quot; |
| X86 | &quot;X86&quot; |
| ZOS | &quot;ZOS&quot; |



