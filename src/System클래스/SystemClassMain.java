package System클래스; // 특정한 구간에서 얼마만큼 시간을 잡아먹고 있는지 측정하기 위해서 사용

import static java.lang.Thread.sleep;

// System 클래스 : 표준 입/출력 관련, 시스템 정보 관련 메서드 제공
public class SystemClassMain {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0, i;
        int randVal = (int)(Math.random() * 1000) + 1;  // 1~1000사이의 임의의 값
        for (i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        long start = System.currentTimeMillis(); // 1970년 1월 1일 0시 0분 부터 경과 시간을 밀리초 단위로 표시
        for (i = 0; i < data.length; i++) {
            cnt++;
            sleep(1); // 짧기 때문에 확인차원으로 sleep 집어넣음
            if (randVal == data[i]) {
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (end - start) + "밀리초 입니다." );
    }
}
