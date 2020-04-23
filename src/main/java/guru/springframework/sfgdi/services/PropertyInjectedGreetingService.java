package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author phillner
 * @created 23.4.2020
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
