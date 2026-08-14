package coffeemoney.controller;

import coffeemoney.service.SecCompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CompanyController {

    //Calling Service
    private final SecCompanyService secCompanyService;

    //initializing service
    public CompanyController(SecCompanyService secCompanyService){
        this.secCompanyService = secCompanyService;
    }
    //path varies with company as each company is supplied as path variable
    @GetMapping("/api/companies/{company}")
    public Map<String, String> getCompany(@PathVariable String company) {
        return Map.of(
                "company", company,
                "status", "lookup not implemented yet");

    }
}
