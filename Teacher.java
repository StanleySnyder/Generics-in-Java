public class Учитель {
    private String имя;
    private int возраст;

    public Учитель(String имя, int возраст) {
        this.имя = имя;
        this.возраст = возраст;
    }

    public String получитьИмя() {
        return имя;
    }

    public void установитьИмя(String имя) {
        this.имя = имя;
    }

    public int получитьВозраст() {
        return возраст;
    }

    public void установитьВозраст(int возраст) {
        this.возраст = возраст;
    }

    @Override
    public String toString() {
        return "Учитель{" +
                "имя='" + имя + '\'' +
                ", возраст=" + возраст +
                '}';
    }
}
