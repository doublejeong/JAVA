package java_board_test;
import java.util.Scanner;

public class ConsoleBoard {
    private Scanner scanner;
    private Create create;
    private Read read;
    private Update update;
    private Delete delete;

    public ConsoleBoard() {
        scanner = new Scanner(System.in);
        create = new Create();
        read = new Read();
        update = new Update();
        delete = new Delete();
    }

    public void start() {
        while (true) {
            System.out.print("1. 글 작성" + '\t');
            System.out.print("2. 글 읽기" + '\t');
            System.out.print("3. 글 수정" + '\t');
            System.out.print("4. 글 삭제" + '\t');
            System.out.print("5. 종료" + '\n');
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    create.createPost();
                    break;
                case 2:
                    read.readPost();
                    break;
                case 3:
                    update.updatePost();
                    break;
                case 4:
                    delete.deletePost();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }

            System.out.println();
        }
    }
}
