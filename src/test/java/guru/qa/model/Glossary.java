package guru.qa.model;

import com.google.gson.annotations.SerializedName;

public class Glossary {
    public String title;
    @SerializedName("GlossDiv")
    public Glossdiv glossdiv;

    /** обязательно static класс*/
    public static class Glossdiv {
        public String title;
        public boolean flag;
    }
}
