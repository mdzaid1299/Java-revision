package Super;

public class Manager extends Emplyee {
    private int teamSize;
    private int teamRating;

    public Manager(int teamRating,int teamSize,String empCode, String empName, String dob, int age, double salary ) {
        super(empCode, empName, dob, age, salary);
        this.teamRating = teamRating;
        this.teamSize = teamSize;
    }


}

