package Modelos;

public class Music extends Audio{
    private String record;
    private String singer;
    private String gender;

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {
        if(this.getTotalReproductions() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
