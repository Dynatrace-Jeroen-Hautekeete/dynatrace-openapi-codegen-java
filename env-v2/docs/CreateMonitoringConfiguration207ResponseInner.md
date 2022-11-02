

# CreateMonitoringConfiguration207ResponseInner

## anyOf schemas
* [ErrorEnvelope](ErrorEnvelope.md)
* [MonitoringConfigurationResponse](MonitoringConfigurationResponse.md)

## Example
```java
// Import classes:
import com.dynatrace.apis.envv2.model.CreateMonitoringConfiguration207ResponseInner;
import com.dynatrace.apis.envv2.model.ErrorEnvelope;
import com.dynatrace.apis.envv2.model.MonitoringConfigurationResponse;

public class Example {
    public static void main(String[] args) {
        CreateMonitoringConfiguration207ResponseInner exampleCreateMonitoringConfiguration207ResponseInner = new CreateMonitoringConfiguration207ResponseInner();

        // create a new ErrorEnvelope
        ErrorEnvelope exampleErrorEnvelope = new ErrorEnvelope();
        // set CreateMonitoringConfiguration207ResponseInner to ErrorEnvelope
        exampleCreateMonitoringConfiguration207ResponseInner.setActualInstance(exampleErrorEnvelope);
        // to get back the ErrorEnvelope set earlier
        ErrorEnvelope testErrorEnvelope = (ErrorEnvelope) exampleCreateMonitoringConfiguration207ResponseInner.getActualInstance();

        // create a new MonitoringConfigurationResponse
        MonitoringConfigurationResponse exampleMonitoringConfigurationResponse = new MonitoringConfigurationResponse();
        // set CreateMonitoringConfiguration207ResponseInner to MonitoringConfigurationResponse
        exampleCreateMonitoringConfiguration207ResponseInner.setActualInstance(exampleMonitoringConfigurationResponse);
        // to get back the MonitoringConfigurationResponse set earlier
        MonitoringConfigurationResponse testMonitoringConfigurationResponse = (MonitoringConfigurationResponse) exampleCreateMonitoringConfiguration207ResponseInner.getActualInstance();
    }
}
```


