package hfuuedu.cy.tm2;

// 录取类
public class Admission {

    public boolean isAdmitted(Student student, School school) {
        double total = student.getTotal();
        double sports = student.getSports();
        double line = school.getLine();

        return total >= line || (sports > 96 && total > 300);
    }

}