package SimpleSpringMock.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class ExampleController {
    Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @GetMapping(value = "/exampleGET")
    @ResponseStatus(HttpStatus.OK)
    public Object exampleGet() throws InterruptedException {
        Thread.sleep(1000);
        return "GET SUCCESS"; // ответ в формате content-type: text/plain;charset=UTF-8
    }

    @PostMapping(value = "/examplePOST")
    @ResponseStatus(HttpStatus.OK)
    public Object examplePost() throws InterruptedException {
        Thread.sleep(1000);
        return "POST SUCCESS"; // ответ в формате content-type: text/plain;charset=UTF-8
    }

}
