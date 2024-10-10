package 자동차클래스생성및정렬;

import java.util.Iterator;
import java.util.TreeSet;

public class CarSortMain {
    public static void main(String[] args) {
        TreeSet<CarSortInfo> treeSet = new TreeSet<>(new CarSortComparator().reversed());
        treeSet.add(new CarSortInfo(1999, "소나타", 2000));
        treeSet.add(new CarSortInfo(1988, "프라이드", 700));
        treeSet.add(new CarSortInfo(2001, "그랜져", 2800));
        treeSet.add(new CarSortInfo(2012, "산타페", 3500));
        treeSet.add(new CarSortInfo(2022, "GV80", 7000));

        Iterator<CarSortInfo> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            CarSortInfo car = iterator.next();
            System.out.println(car.productYear + " "+ car.carName + " " + car.price);
        }
    }
}
