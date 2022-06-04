package exercice7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentModel implements IStudentModel{

    private ArrayList<IStudentView> observers = new ArrayList<>();
    private String rollNo;
    private String name;

    public StudentModel() {
        setName("");
        setRollNo("");
    }

    @Override
    public void registerObserver(IStudentView o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IStudentView o) {
        if(observers.indexOf(o) >=0 ) observers.remove(observers.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        List<String> studentinfo = Arrays.asList(this.getName(),this.getRollNo());
        System.out.println(studentinfo.get(0));
        for(int i=0;i<observers.size();i++) observers.get(i).update(studentinfo);
    }

    @Override
    public String getRollNo() {
        return this.rollNo;
    }

    @Override
    public void setRollNo(String rollNo) {
        this.rollNo=rollNo;
        notifyObservers();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
        notifyObservers();
    }
}
