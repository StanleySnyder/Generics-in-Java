public class УчительКонтроллер<T extends Учитель> {
    private УчительСервис<T> учительСервис;
    private УчительВью<T> учительВью;

    public УчительКонтроллер() {
        this.учительСервис = new УчительСервис<>();
        this.учительВью = new УчительВью<>(учительСервис);
    }

    public void создатьУчителя(T учитель) {
        учительСервис.добавитьУчителя(учитель);
    }

    public void редактироватьУчителя(int индекс, T новыйУчитель) {
        учительСервис.редактироватьУчителя(индекс, новыйУчитель);
    }

    public void отобразитьСписокУчителей() {
        учительВью.отобразитьСписокУчителей();
    }

    public УчительСервис<T> получитьУчительСервис() {
        return учительСервис;
    }
}
