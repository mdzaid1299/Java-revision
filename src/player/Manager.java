package player;

public class Manager extends Students {
    public void calculate() {
        System.out.println("calculate");
    }
    public static void main(String[] args) {
        Students students = new Students();
        students.playChess();
    }
}
