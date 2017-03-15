

import Model.Enroll;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by AlexPc on 3/14/2017.
 */


public class EnrollMapper implements RowMapper<Enroll> {
    public Enroll mapRow(ResultSet rs, int rowNum) throws SQLException {
        Enroll enroll = new Enroll();
        enroll.setName(rs.getString("name"));
        enroll.setCourse(rs.getString("course"));
        return enroll;
    }
}
