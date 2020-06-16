package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
		//1. 드라이브 로드
		
		try {
			Class.forName("org.mariadb.jdbc.Driver1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//2. 데이터베이스 연결 => Connection 객체를 생성한다.
		//localhost : 데이터베이스 설치 ip
		//3306 : 데이터 베이스 포트
		//kpc : 데이터 베이스 명
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",//url
					"kpc12",//user
					"kpc1234"//password
					);
			
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			//물음표는 반드시 칼럼명에
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member1 ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수 처리
			int index = 0;
			pstmt.setString(++index, "샤넬2");
			pstmt.setString(++index, "프랑스2");
			pstmt.setInt(++index, 5);
			
			//5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			
			System.out.println("전송결과 : " +resultCount);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//6. 모든 자원 반납
			
				try {
					if(con != null) con.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
}
