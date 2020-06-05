package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo1 {
	public static void main(String[] args) {
		//1. 드라이브를 로드한다.
		//드라이버 객체를 메모리에 로드하여  자바어플리케이션과 마리아디비 연결
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		
		//2. 데이터베이스와 연결
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",
					"kpc12",
					"kpc1234"
					);
			
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체 생성
			//? 바인딩 변수 : 바인딩 변수는 반드시 칼럼 값에만 사용해야 한다.
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES(?,?,?)");
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수 설정과 쿼리문 전송
			
			pstmt.setInt(1, 3);
			pstmt.setString(2,  "गीता");
			pstmt.setString(3, "인도");
			
			//5. SQL문 전송
			
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//6. 모든 자원을 반납한다.
		} finally {
					try {
						if(con != null)con.close();
						if(pstmt != null) pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
		}
				
		
	}

