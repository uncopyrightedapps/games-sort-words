package org.uncopyrightedapps.games.sort_words;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import org.robolectric.RobolectricTestRunner;
import org.uncopyrightedapps.games.sort_words.model.Phrase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class PhraseTest {

    @Test
    public void returnWords() throws Exception {
        Phrase p = new Phrase("The dog runs a lot");
        assertEquals("Incorrect number of getWords found", 5, p.getWords().length);
    }

    @Test
    public void emptyPhraseReturnNoWords() throws Exception {
        Phrase p = new Phrase();
        assertEquals("Incorrect number of getWords found", 0, p.getWords().length);
    }

    @Test
    public void saveStoresInstanceIntoDb() throws Exception {
        new Phrase("The dog runs a lot").save();
        assertTrue(Phrase.count(Phrase.class) > 0);
    }

}