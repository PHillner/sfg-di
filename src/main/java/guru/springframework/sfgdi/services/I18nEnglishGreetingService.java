package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author phillner
 * @created 23.4.2020
 */
@Profile({"en", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hullo World - EN";
    }
}
