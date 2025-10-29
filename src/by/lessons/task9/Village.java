package by.lessons.task9;

/**
 * 1. Класс Деревня. Деревня будет состоять из построек. К постройкам относятся промышленные здания и
 * гражданские. К промышленным зданиям будут относится заводы и фермы. К гражданским будут относится:
 * административные здания, жилые здания.
 */
public class Village {
    Builing[] builings;
    private int size;

    public Village() {
        this.builings = new Builing[10];  // начальный размер массива
        this.size = 0;
    }

    public void addBuiling(Builing builing) {

        int count = 0;
        for (int i = 0; i < builings.length; i++) {
            count++;
        }

        Builing[] newBuildings = new Builing[count + 1];
        for (int i = 0; i < count; i++) {
            newBuildings[i] = builings[i];
        }
        newBuildings[count] = builing;
        builings = newBuildings;
    }

    public void info() {
        for (Builing b : builings
        ) {
            if (b != null) {
                System.out.println(b.info());
            }
        }
    }


}
