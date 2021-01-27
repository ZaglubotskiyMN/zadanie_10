package part1.lessons10.task1;

public class MyException extends Exception {
    String message;

    public MyException(String message){
        super(message);
    }
}
