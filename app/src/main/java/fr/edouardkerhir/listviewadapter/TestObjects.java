package fr.edouardkerhir.listviewadapter;
//class Objet que je vais afficheer dans l'adapter

public class TestObjects {

    private String title;
    private String subTitle;
    private String description;
    private int color;

    public TestObjects(String title, String subTitle, String description, int color) {
        this.title = title;
        this.subTitle = subTitle;
        this.description = description;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
