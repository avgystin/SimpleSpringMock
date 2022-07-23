package SimpleSpringMock.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping(value = "/exampleGET")
    @ResponseStatus(HttpStatus.OK)
    public Object exampleGet() throws InterruptedException {
        Thread.sleep(1000);
        return "GET SUCCESS";
    }

    @PostMapping(value = "/examplePOST")
    @ResponseStatus(HttpStatus.OK)
    public Object examplePost() throws InterruptedException {
        Thread.sleep(1000);
        return "POST SUCCESS";
    }
}
