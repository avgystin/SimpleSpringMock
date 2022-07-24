package SimpleSpringMock.Features;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigurationBeans {
    @Bean
    public ResponseTimeConfiguration getResponseTimeConfiguration() {
        return new ResponseTimeConfiguration();
    }

    @Bean
    public Map<String, Integer> delayMap() {
        Map<String, Integer> delayMap = new HashMap<>();
        delayMap.put("exampleGET", 200);
        delayMap.put("examplePOST", 400);
        return delayMap;
    }

    @Bean
    public Map<String, Integer> longDelayMap() {
        Map<String, Integer> longDelayMap = new HashMap<>();
        longDelayMap.put("exampleGET", 400);
        longDelayMap.put("examplePOST", 800);
        return longDelayMap;
    }
}
