

import Model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by AlexPc on 3/14/2017.
 */


public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setBirthDate(rs.getString("birthdate"));
        student.setAddress(rs.getString("address"));
        return student;
    }
}
