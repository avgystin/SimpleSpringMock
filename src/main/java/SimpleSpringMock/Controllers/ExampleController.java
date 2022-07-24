package SimpleSpringMock.Controllers;

import SimpleSpringMock.Features.ResponseTimeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class ExampleController {
    @Autowired
    ResponseTimeBean responseTimeBean;
    Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @GetMapping(value = "/exampleGET")
    @ResponseStatus(HttpStatus.OK)
    public Object exampleGet() throws InterruptedException {
        if (responseTimeBean.isDelaySwitch()) {
            Thread.sleep(responseTimeBean.getLongDelayMap().get("exampleGET"));
        } else {
            Thread.sleep(responseTimeBean.getDelayMap().get("exampleGET"));
        }
        return "GET SUCCESS"; // ответ в формате content-type: text/plain;charset=UTF-8
    }

    @PostMapping(value = "/examplePOST", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Object examplePost(@RequestBody Map<String, String> request) throws InterruptedException {
        request.replace("STATUS", "SUCCESS"); // заменяем {"STATUS":"ERROR"} на {"STATUS":"SUCCESS"}
        if (responseTimeBean.isDelaySwitch()) {
            Thread.sleep(responseTimeBean.getLongDelayMap().get("examplePOST"));
        } else {
            Thread.sleep(responseTimeBean.getDelayMap().get("examplePOST"));
        }
        return request; // ответ c корреляцией в формате content-type: application/json
    }

}
