package exercice7;

public class MVCPatternDemo {

    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentController controller = new StudentController(model);
    }
}
