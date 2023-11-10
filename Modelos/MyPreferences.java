package Modelos;

public class MyPreferences {
    public void include(Audio audio) {
        if (audio.getClassification() >= 8) {
            System.out.println(audio.title() + " é  considerado sucesso absoluto"
                    + " e preferido de todos!");
        } else {
            System.out.println(audio.title() + " É tambem um dos que a galera está curtindo!");
        }
    }
}
