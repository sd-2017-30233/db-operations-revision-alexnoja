import Model.Course;

import javax.sql.DataSource;
import java.util.List;


/**
 * Created by AlexPc on 3/14/2017.
 */


public interface CourseDAO {

    
    public void create(Integer id, String name, String teacher, Integer studyyear);

    public void setDataSource(DataSource ds);


    public Course getCourse(Integer id);

    public List<Course> listCourses();

    public void delete(Integer id);

    public void updateTeacher(Integer id, String teacher);

    public void updateCourseName (Integer id, String name);
}
