package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToDollar(60);
        assertThat(result, is(1.0));
    }

    @Test
    public void when1DollarThen60Rubles() {
        Converter converter = new Converter();
        double result =  converter.dollarToRuble(1);
        assertThat(result, is(60.0));
    }

    @Test
    public void when1EuroThen70Rubles() {
        Converter converter = new Converter();
        double result = converter.euroToRuble(1);
        assertThat(result, is(70.0));
    }
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToEuro(70);
        assertThat(result, is(1.0));
    }
}
