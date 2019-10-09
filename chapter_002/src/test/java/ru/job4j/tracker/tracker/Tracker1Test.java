package ru.job4j.tracker.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import ru.job4j.tracker.tracker1.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Tracker1Test {

    @Test
    public void Tracker1shouldBeOneObject () {
        Tracker1 trackerOne  = Tracker1.INSTANCE;
        Tracker1 trackerTwo  = Tracker1.INSTANCE;
        assertThat (trackerOne == trackerTwo, is (true));
    }

    @Test
    public void Tracker2shouldBeOneObject () {
        Tracker2 trackerOne  = Tracker2.getTracker2  ();
        Tracker2 trackerTwo  = Tracker2.getTracker2 ();
        assertThat (trackerOne == trackerTwo, is (true));
    }

    @Test
    public void Tracker3shouldBeOneObject () {
        Tracker3 trackerOne  = Tracker3.getTracker3 ();
        Tracker3 trackerTwo  = Tracker3.getTracker3 ();
        assertThat (trackerOne == trackerTwo, is (true));
    }
    @Test
    public void Tracker4shouldBeOneObject () {
        Tracker4 trackerOne  = Tracker4.getTracker4 ();
        Tracker4 trackerTwo  = Tracker4.getTracker4 ();
        assertThat (trackerOne == trackerTwo, is (true));
    }
}
