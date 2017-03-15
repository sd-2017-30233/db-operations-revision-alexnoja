import Model.Enroll;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by AlexPc on 3/14/2017.
 */



	public interface EnrollDAO {

    public void setDataSource(DataSource ds);

    public void create(String student, String course);

    public List<Enroll> listEnrolls();
}
