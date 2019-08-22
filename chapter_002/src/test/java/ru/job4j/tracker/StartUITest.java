package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
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
        boolean deleted = tracker.delete("test name");
        Input input = new StubInput(new String[]{"3"});
        new StartUI(input, tracker).init();
        assertThat(deleted, is(true));
    }
    @Test
    public void whenFindByIdThenShowsCorrectly() {
        Tracker tracker = new Tracker();
        Item item = tracker.findById("test name");
        Input input = new StubInput(new String[]{"4", item.getId()});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    @Test
    public void whenFindByNameThenShowsCorrectly() {
        Tracker tracker = new Tracker();
        Item[] items = tracker.findByName("test name");
        Input input = new StubInput(new String[]{"5", item.getName()});
        new StartUI(input, tracker).init();
        assertThat(items, is(Item.getName());
    }
    @Test
    public void whenShowAllItemsThenShowsCorrectly() {
        Tracker tracker = new Tracker();
        Item items [] = tracker.findAll();
        Input input = new StubInput(new String[]{"1"});
        new StartUI(input, tracker).init();
        assertThat(items, is (Item[]));
    }
}
