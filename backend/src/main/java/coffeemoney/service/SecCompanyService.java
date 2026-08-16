package coffeemoney.service;
import org.springframework.stereotype.Service;

@Service
public class SecCompanyService {
    public String lookupComapny(String company){
        return company;
    }

    //hardcoded Starbucks line
    private static final String STARBUCKS_CIK = "0000829224";

    public String getStarbucksCik() {
        return STARBUCKS_CIK;
    }
}
