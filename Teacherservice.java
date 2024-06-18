import java.util.ArrayList;
import java.util.List;

public class УчительСервис<T extends Учитель> {
    private List<T> учителя;

    public УчительСервис() {
        this.учителя = new ArrayList<>();
    }

    public void добавитьУчителя(T учитель) {
        учителя.add(учитель);
    }

    public void отобразитьСписокУчителей() {
        for (T учитель : учителя) {
            System.out.println(учитель);
        }
    }

    public T получитьУчителя(int индекс) {
        if (индекс >= 0 && индекс < учителя.size()) {
            return учителя.get(индекс);
        }
        return null;
    }

    public void редактироватьУчителя(int индекс, T новыйУчитель) {
        if (индекс >= 0 && индекс < учителя.size()) {
            учителя.set(индекс, новыйУчитель);
        }
    }
}
