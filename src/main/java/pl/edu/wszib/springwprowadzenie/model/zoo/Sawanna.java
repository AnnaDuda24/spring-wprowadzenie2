package pl.edu.wszib.springwprowadzenie.model.zoo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class Sawanna implements Wybieg{

    @Override
    public List<Gromada> wybiegDla() {
        return Arrays.asList(Gromada.SSAK);
    }

}
