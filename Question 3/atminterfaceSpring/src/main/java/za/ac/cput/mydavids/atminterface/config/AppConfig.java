package za.ac.cput.mydavids.atminterface.config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.mydavids.atminterface.ATMService;
import za.ac.cput.mydavids.atminterface.Impl.ATMServiceImpl;

/**
 * Created by student on 2015/02/19.
 */
public class AppConfig {

    @Bean(name="atm")
    public ATMService getService(){
        return new ATMServiceImpl(150);
    }

}
