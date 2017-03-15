
import Model.Student;

import javax.sql.DataSource;
import java.util.List;


/**
 * Created by AlexPc on 3/14/2017.
 */


public interface StudentDAO {

        public void setDataSource(DataSource ds);


        public void create(Integer id, String name, String birthdate, String address);


        public Student getStudent(Integer id);


        public List<Student> listStudents();


        public void delete(Integer id);


    
       public void updateName(Integer id, String name);


        public void updateAddress(String name, String address);

}