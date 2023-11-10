package Modelos;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private int classification;

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like() {
        this.totalLikes++;
    }

    public void reproduce() {
        this.totalReproductions++;
    }
}
