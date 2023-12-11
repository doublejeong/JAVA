package java_board_test;
import java.util.Scanner;

public class Create {
    private Scanner scanner;

    public Create() {
        scanner = new Scanner(System.in);
    }

    public void createPost() {
        System.out.println("새로운 글을 작성합니다.");
        // 글 작성 로직 구현
        System.out.println("글 작성이 완료되었습니다.");
    }
}
