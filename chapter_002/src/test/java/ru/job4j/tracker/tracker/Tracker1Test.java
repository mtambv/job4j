
package ru.job4j.tracker.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import ru.job4j.tracker.tracker1.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Tracker1Test {

    @Test
    public void trackerOneShouldBeOneObject() {
        Tracker1 trackerOne  = Tracker1.INSTANCE;
        Tracker1 trackerTwo  = Tracker1.INSTANCE;
        assertThat(trackerOne == trackerTwo, is(true));
    }

    @Test
    public void tracker2ShouldBeOneObject() {
        //Tracker2 trackerOne  = Tracker2.INSTANCE;
        //Tracker2 trackerTwo  = Tracker2.INSTANCE();
        //assertThat(trackerOne == trackerTwo, is(true));
    }

    @Test
    public void tracker3ShouldBeOneObject() {
        //Tracker3 trackerOne  = Tracker3.getTracker3();
        //Tracker3 trackerTwo  = Tracker3.getTracker3();
        //assertThat(trackerOne == trackerTwo, is(true));
    }
    @Test
    public void tracker4ShouldBeOneObject() {
        //Tracker4 trackerOne  = Tracker4.getTracker4();
        //Tracker4 trackerTwo  = Tracker4.getTracker4();
        //assertThat(trackerOne == trackerTwo, is(true));
    }
}

