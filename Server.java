import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Server {
	 // ����� ����� �� ������� ��� SQL ������� � ����� ������ (������) ��� ����,
	  // � ��� ����������� � ���������, �� ����� NULL
	  private static Connection connect(String url, String user, String password){
	    Connection result = null;
	    try{
	      result = DriverManager.getConnection(url, user, password);
	    }
	    catch(SQLException e){
	      e.printStackTrace();
	    }
	    return result;
	  }

	
	  
	  public static void main(String[] args){
	    // localhost � IP �� �������, 3306 � �����, firmata � ������
	    String url = "jdbc:mysql://localhost:3306/firmata";
	    String user = "root";
	    String pass = "*********";
	
	    Connection link = Server.connect(url, user, pass);

	    if(link == null){
	      System.out.println("���, MySQL �� � ������!");
	      return;
	    }
	    else{
	      System.out.println("������� �� � MySQL �������!");
	    }

	  
	  }
}

