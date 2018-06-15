import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
 
public class gradeDAO {
  private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
  private static final String URL = "jdbc:oracle:thin:@203.236.209.170:1521:XE";
  private static final String USER = "scott";
  private static final String PASS = "tiger";
 
  public Connection getConn() {
    Connection con = null;
    try {
      Class.forName(DRIVER);
      con = DriverManager.getConnection(URL, USER, PASS);
    } catch (Exception e) {
      e.printStackTrace();
    } 
    return con;
  }
 
  public int insertScore(gradeDTO dto) {
    Connection con = null;
    PreparedStatement ps = null;
    int result = 0;
    try {
      con = getConn();
      String sql = "insert into score values(?,?,?,?,?,?)";
      ps = con.prepareStatement(sql);
      ps.setString(1, dto.getName());
      ps.setInt(2, dto.getKor());
      ps.setInt(3, dto.getEng());
      ps.setInt(4, dto.getMat());
      ps.setInt(5, dto.getTot());
      ps.setInt(6, dto.getAve());
      result = ps.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (ps != null) { try { ps.close(); } catch (SQLException e2) { e2.printStackTrace(); } // ps try - catch
      } 
      if (con != null) { try { con.close(); } catch (SQLException e2) { e2.printStackTrace(); } // con try - catch
      } 
    } 
    return result;
  }
   
  public Vector getScore() {
    Vector data = new Vector();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      con = getConn();
      String sql = "select * from score order by name asc";
      stmt = con.createStatement();
      rs = stmt.executeQuery(sql);
 
      while (rs.next()) {
        String name = rs.getString("name");
        int kor = rs.getInt("kor");
        int eng = rs.getInt("eng");
        int mat = rs.getInt("mat");
        int tot = rs.getInt("tot");
        int ave = rs.getInt("ave");
        Vector row = new Vector();
        row.add(name);
        row.add(kor);
        row.add(eng);
        row.add(mat);
        row.add(tot);
        row.add(ave);
        data.add(row);
      } 
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (rs != null) { try { rs.close(); } catch (SQLException e2) { e2.printStackTrace(); } 
      } 
      if (stmt != null) { try { stmt.close(); } catch (SQLException e2) { e2.printStackTrace(); } 
      } 
      if (con != null) { try { con.close(); } catch (SQLException e2) { e2.printStackTrace(); } 
      } 
    } 
    return data;
  } 
  public int updateScore(gradeDTO dto) {
    Connection con = null;
    PreparedStatement ps = null;
    int result = 0;
    try {
      con = getConn();
      String sql = "update score set kor=?, eng=?, mat=?, tot=?, ave=? where name=?";
      ps = con.prepareStatement(sql);
      ps.setInt(1, dto.getKor());
      ps.setInt(2, dto.getEng());
      ps.setInt(3, dto.getMat());
      ps.setInt(4, dto.getTot());
      ps.setInt(5, dto.getAve());
      ps.setString(6, dto.getName());
      result = ps.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (ps != null) { try { ps.close(); } catch (SQLException e2) { e2.printStackTrace(); } // ps try - catch
      } 
      if (con != null) { try { con.close(); } catch (SQLException e2) { e2.printStackTrace(); } // con try - catch
      }
    } 
    return result;
  } 
   
  public int deleteScore(gradeDTO dto) {
    Connection con = null;
    PreparedStatement ps = null;
    int result = 0;
    try {
      con = getConn();
      String sql = "delete score where name=?";
      ps = con.prepareStatement(sql);
      ps.setString(1, dto.getName());
      result = ps.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (ps != null) { try { ps.close(); } catch (SQLException e2) { e2.printStackTrace(); } // ps try - catch
      } 
      if (con != null) { try { con.close(); } catch (SQLException e2) { e2.printStackTrace(); } // con try - catch
      }
    } 
    return result;
  } 
   
} 