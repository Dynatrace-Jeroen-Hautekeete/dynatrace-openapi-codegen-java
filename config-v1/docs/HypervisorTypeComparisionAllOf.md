

# HypervisorTypeComparisionAllOf


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
| AHV | &quot;AHV&quot; |
| AWS_NITRO | &quot;AWS_NITRO&quot; |
| HYPER_V | &quot;HYPER_V&quot; |
| KVM | &quot;KVM&quot; |
| LPAR | &quot;LPAR&quot; |
| QEMU | &quot;QEMU&quot; |
| UNRECOGNIZED | &quot;UNRECOGNIZED&quot; |
| VIRTUAL_BOX | &quot;VIRTUAL_BOX&quot; |
| VMWARE | &quot;VMWARE&quot; |
| WPAR | &quot;WPAR&quot; |
| XEN | &quot;XEN&quot; |



