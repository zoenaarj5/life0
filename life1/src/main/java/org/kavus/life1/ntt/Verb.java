package org.kavus.life1.ntt;

public class Verb {
    protected String infinitive;
    protected String gerund;

    public Verb(String infinitive, String gerund) {
        this.infinitive = infinitive;
        this.gerund = gerund;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getGerund() {
        return gerund;
    }

    public void setGerund(String gerund) {
        this.gerund = gerund;
    }
    public String toString(){
        return this.infinitive+", "+this.gerund;
    }
}
