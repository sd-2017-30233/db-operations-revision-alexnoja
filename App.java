import DAO.CourseJDBC;
import DAO.EnrollJDBC;
import DAO.StudentJDBC;
import Model.Student;

import java.util.List;


/**
 * Created by AlexPc on 3/14/2017.
 */


public class App {
    public static void main(String[] args) {
        

        StudentJDBC studentJDBCTemplate = (StudentJDBC)context.getBean("studentJDBC");
        CourseJDBC courseJDBCTemplate = (CourseJDBC)context.getBean("courseJDBC");
        EnrollJDBC enrollJDBCTemplate = (EnrollJDBC)context.getBean("enrollJDBC");
    }
}

