package Restaurant_Management;

import java.sql.*;

public class LoginService {
    public static boolean login(String username, String password) {

        String sql = "SELECT password FROM staff WHERE username=?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return password.equals(rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("-> Login error");
        }
        return false;
    }
}