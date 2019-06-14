package ch.rohner.ssl.plantronics.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;

@RestController
@RequestMapping("/api/status")
public class StatusApi {

    @GetMapping(produces = { "application/hal+json" })
    @ResponseStatus(HttpStatus.ACCEPTED)
    public HashMap<String, String> getStatus() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "All system are up an running. " + LocalDateTime.now());
        return map;
    }
}
