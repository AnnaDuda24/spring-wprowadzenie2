package pl.edu.wszib.springwprowadzenie.model.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Ciastko {

    private boolean zjedzone = false;

    public void zjedz() {
        zjedzone = true;
    }

    public boolean isZjedzone() {
        return zjedzone;
    }
}
