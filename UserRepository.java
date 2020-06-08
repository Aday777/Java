package repositories.entities;

import com.edustation.Student;
import repositories.db.PostgresRepository;
import repositories.interfaces.IDBRepository;
import repositories.interfaces.IEntityRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class UserRepository implements IEntityRepository<Student> {
    private IDBRepository dbrepo;

    public UserRepository() {
        dbrepo = new PostgresRepository();
    }

    @Override
    public void add(Student entity) {
        try {
            Statement stmt = dbrepo.getConnection().createStatement();
            String sql = "INSERT INTO users(name, surname, username, password, birthday) " +
                    "VALUES('" + entity.getName() + "','"+ entity.getSurname() +
                    "','"+ entity.getUsername() +"','"+ entity.getPassword() +
                    "','"+ entity.getBirthday() +"')";
            stmt.execute(sql);
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Student entity) {

    }

    @Override
    public void remove(Student entity) {

    }

    @Override
    public Iterable<Student> query(String sql) {
        try {
            Statement stmt = dbrepo.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            LinkedList<Student> users = new LinkedList<>();
            while (rs.next()) {
                Student student = new Student(
                        rs.getInt( "id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getDate("birthday")
                );
                users.add(student);
            }
            return users;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
