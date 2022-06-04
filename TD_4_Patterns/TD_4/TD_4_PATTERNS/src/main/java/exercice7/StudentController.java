package exercice7;

import java.util.Arrays;
import java.util.List;

public class StudentController implements IStudentController{

    private IStudentModel model;
    private IStudentView view;


    public StudentController(IStudentModel model) {
        this.model = model;
        this.view=new StudentView(model, this);
    }

    @Override
    public void setStudentName(String Name) {
        model.setName(Name);
    }

    @Override
    public String getStudentName() {
        return model.getName();
    }

    @Override
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    @Override
    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView(){
        List<String> studentinfo = Arrays.asList(getStudentName(),getStudentName());
        view.update(studentinfo);
    }


}
