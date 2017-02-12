package org.uncopyrightedapps.games.sort_words.model;


import com.orm.SugarRecord;

public class Phrase extends SugarRecord {

    private static final String[] NO_WORDS = {};

    private String content;

    public Phrase() {
    }

    public Phrase(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getWords() {
        return content != null ? content.split(" ") : NO_WORDS;
    }

}
