public class Main {
    public static void main(String[] args) {
        // 정수 배열
        int[] grade = {90, 80, 89};
        int tot = grade[0] + grade[1] + grade[2];
        int average = tot / 3;
        System.out.printf("국어 %d 점, 영어 %d 점, 수학 %d 점 => \t", grade[0], grade[1], grade[2]);
        System.out.printf("총점 %d점, 평균 %d 점 \n", tot, average);
    }
}
