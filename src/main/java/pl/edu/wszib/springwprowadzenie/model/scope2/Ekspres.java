package pl.edu.wszib.springwprowadzenie.model.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
@Component
public class Ekspres {

    private final int numer = new SecureRandom().nextInt() & 100;

    public String kawa() {
        return "Kawa z ekspresu : " + numer;
    }
}
