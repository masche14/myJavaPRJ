public class Quiz0521 {
    public static void main(String[] args) {
        for (int i=1, j=2; j<=9&&i<=9; j++){ //  1는 1, j가 2부터 i와 j가 9가 이하일때 j를 1씩 증가시키며 아래 내용을 반복실행하는 반복문

            int c = j*i; // j와 i를 곱한 값을 변수 c에 저장
            System.out.printf("%2dX%2d=%2d ", j, i, c); // jXi = c를 출력 ex)2X1=2
            if (j==9){ // j가 j가 9가 될때(반복문이 1회 다 수행될 때) 다음 문장을 실행하는 조건문
                j=1; // 1회 반복이 종료될때 j를 1로 초기화 그러면 위로 올라가면서 1증가 하여 2가 됨
                i++; // 1회 반복이 종료될때 i값을 1 증가 ==> i가 10까지 증가시키는데 i가 10이면 위 조건에 위배되어 반복문 종료
                System.out.println(); // 줄바꿈
            }
        }
    }
}
