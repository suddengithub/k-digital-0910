package 컴페어러블;

public class Car implements Comparable<Car>{
    public String name;
    private int year;
    private String color;

    @Override
    public int compareTo(Car o) {
        if (this.year == o.year) {  // 연식이 같으면
            int rst = this.name.compareTo(o.name); // 모델 이름으로 사전순 정렬
            if (rst == 0) { // 비교 조건에 대한 반환값이 0이면, 중복 제거가 됨
                return this.color.compareTo(o.name);
            } else return rst;
        } else if (this.year > o.year) return 1; // 오름차순 정렬 (즉, 연식이 오래된 것부터 출력)
        else return -1;
    }

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    //

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
