package 학생성적정렬하기;

public class Student implements Comparable<Student>{
    public String name;
    private int kor;
    private int eng;
    private int math;

    @Override
    public int compareTo(Student o) {
//        if (this.getTotalScore() < o.getTotalScore()) return 1; // 1 정렬 조건(여기서는 내림차순 정렬) / -1 내두는 조건 / 0이면 중복 제거
//        else if (this.getTotalScore() == o.getTotalScore()) {
//            return this.name.compareTo(o.name); // 총점이 같으면 이름 순 정렬
//        } else {
//            return -1;
//        }
        if (this.getTotalScore() != o.getTotalScore()) {
            return o.getTotalScore() - this.getTotalScore(); // 뒤의 값이 큰 경우가 양수가 됨 => 내림차순이 됨
        }
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return name + " : " + getTotalScore();
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotalScore() {
        return kor + eng + math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
    ///

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
