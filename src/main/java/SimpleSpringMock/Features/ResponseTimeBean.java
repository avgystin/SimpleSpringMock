package SimpleSpringMock.Features;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ResponseTimeBean {
    private Map<String, Integer> delayMap;
    private Map<String, Integer> longDelayMap;
    public boolean delaySwitch;

    public Map<String, Integer> getDelayMap() {
        return delayMap;
    }

    public Map<String, Integer> getLongDelayMap() {
        return longDelayMap;
    }

    @Autowired
    public void setDelayMap(Map<String, Integer> delayMap) {
        this.delayMap = delayMap;
    }

    @Autowired
    public void setLongDelayMap(Map<String, Integer> longDelayMap) {
        this.longDelayMap = longDelayMap;
    }

    public boolean isDelaySwitch() {
        return delaySwitch;
    }

    public void setDelaySwitch(boolean delaySwitch) {
        this.delaySwitch = delaySwitch;
    }
}
