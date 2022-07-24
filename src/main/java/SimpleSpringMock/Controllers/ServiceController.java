package SimpleSpringMock.Controllers;

import SimpleSpringMock.Features.ResponseTimeConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    ResponseTimeConfiguration responseTimeConfiguration;

    @GetMapping(value = "/setLongDelay")
    @ResponseStatus(HttpStatus.OK)
    public Object setLongDelay(){
        responseTimeConfiguration.setDelaySwitch(true); // установка долгого отклика
        return "LongDelayCase == true"; // ответ в формате content-type: text/plain;charset=UTF-8
    }

    @GetMapping(value = "/resetLongDelay")
    @ResponseStatus(HttpStatus.OK)
    public Object resetLongDelay(){
        responseTimeConfiguration.setDelaySwitch(false); // отмена долгого отклика
        return "LongDelayCase == false"; // ответ в формате content-type: text/plain;charset=UTF-8
    }
}
