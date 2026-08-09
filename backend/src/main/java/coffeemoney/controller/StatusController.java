package coffeemoney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {
    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of(
                "project", "Where did my Coffee Money Go?",
                "status", "Im trying"
        );
    }

}