package guru.springframework.sfgdi.services;

/**
 * @author phillner
 * @created 23.4.2020
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
