package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }




    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new ArrayList<String>(Arrays.asList("invalid", "1")))
        );
        input.ask("Enter", new ArrayList<>(Arrays.asList(1)));
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Please enter valid data again.%n")
                )
        );
    }

    /**
     * Тест на ввод пользователем неверного числа.
     */
    @Test
    public void whenInvalidInputNum() {
        ValidateInput input = new ValidateInput(
                new StubInput(new ArrayList<>(Arrays.asList("66", "1")))
        );
        input.ask("Enter", new ArrayList<>(Arrays.asList(1)));
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Please select number from menu.%n")
                )
        );
    }


}