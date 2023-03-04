package pl.edu.wszib.springwprowadzenie.model.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Komputer {

    private boolean zajety = false;

    public String pracuj() {
        if (zajety) {
            return "Zajety";
        } else {
            zajety = true;
            return "Pracuje";
        }
    }

}
