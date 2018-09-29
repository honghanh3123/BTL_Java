package Dictionarynewversion;

public class Word {
    private String word_target, word_explain;

    Word(){
        this.word_target = "";
        this.word_explain = "";
    }

    Word(String word_target, String word_explain){
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
    public Word(Word w){
        this.word_target = w.word_target;
        this.word_explain = w.word_explain;
    }
    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public String getWord_target() {
        return word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }
}
