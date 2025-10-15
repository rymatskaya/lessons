package by.lessons.task9;
/** 1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от
 *  Постройки. Поля которые можно определить в Промышленном здании: */
public class IndustrialBuilding extends Builing{
    private String industry; // отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)

    public IndustrialBuilding(String street, String wall, int year, String industry) {
        super(street, wall, year);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String info() {
        String result = super.info();
        result = result + " Отрасль " + industry ;
        return result;
    }
}
