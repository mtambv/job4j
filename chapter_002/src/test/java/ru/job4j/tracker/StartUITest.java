package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
    @Test
    public void whenShowAllItemsThenShowsCorrectly () {
        Tracker tracker = new Tracker();
        Item items[] = tracker.findAll();
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(items, is(new Item[0]));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc", 1046L));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteThenTrackerHasUpdated() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 1046L));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat (tracker.findAll(), is(new Item[0]));
    }

    @Test
    public void whenFindByIdThenShowsCorrectly() {
        Tracker tracker = new Tracker();
        String ls = System.lineSeparator();
        Item add = tracker.add(new Item("test name", "desc", 1046L));
        Input input = new StubInput(new String[]{"4", add.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(out.toString().trim(), is("Меню."+ls+"" +
                "0.  Add new Item"+ls+
                "1. Show all items"+ls+
                "2. Edit item"+ls+
                "3. Delete item"+ls+
                "4. Find item by Id"+ls+
                "5. Find items by name"+ls+
                "6. Exit Program"+ls+
                "------------ Введите id заявки :------------"+ls+
                "Item{id='" + add.getId() + "', name='name by id', decs='desc by id', time=0}"+ls+
                "Меню."+ls+
                "0. Add new Item"+ls+
                "1. Show all items"+ls+
                "2. Edit item"+ls+"" +
                "3. Delete item"+ls+
                "4. Find item by Id"+ls+
                "5. Find items by name"+ls+
                "6. Exit Program"));
    }

    @Test
    public void whenFindByNameThenShowsCorrectly() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 1046L));
        Item[] items = tracker.findByName("test name");
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName(item.getName()), is(items));
    }
}