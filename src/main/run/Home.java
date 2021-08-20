import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class Home {
    public static void main(String[] args) {
        SQLServerDataSource sqlServerDataSource=new SQLServerDataSource();
        sqlServerDataSource.setDatabaseName("MockingProject");
        sqlServerDataSource.setServerName("ADMIN");
        sqlServerDataSource.setUser("daodat2801");
        sqlServerDataSource.setPassword("daodat2801");
        try(Connection connection= sqlServerDataSource.getConnection()) {
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
