package java_board_test;
import java.util.Scanner;

public class Delete {
    private Scanner scanner;

    public Delete() {
        scanner = new Scanner(System.in);
    }

    public void deletePost() {
        System.out.println("글을 삭제합니다.");
        // 글 삭제 로직 구현
        System.out.println("글 삭제가 완료되었습니다.");
    }
}
