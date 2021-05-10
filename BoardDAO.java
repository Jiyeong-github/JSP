package com.koreait.board3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.koreait.board3.BoardVO3;

//DataAccessObject(DB 쿼리 실행 담당)
public class BoardDAO {

	// 글 등록
	public static int insertBoard(BoardVO3 vo) {

		Connection con = null; // preparedstatement 객체 생성, db를 연결해주는 역할
		PreparedStatement ps = null;// preparedstatement 쿼리문 실행
		// 위의 변수들을 바로 선언하면 finally에서 사용할 수 없음

		String sql = " INSERT INTO t_board(title,ctnt) " + " VALUES(?,?) ";
		// ?가 쓰였다는건 preparedstatement를 사용한다
		// "VALUES('" + vo.getTitle() + "','" + vo.getContent() + "')";
		// 1부터 시작한다

		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);

			// 얘는 int만 들어갈 수 있음!! ps.setInt(1, 100);

			ps.setString(1, vo.getTitle());// values에 vo에서 온 값을 넣어줌.
			ps.setString(2, vo.getCtnt()); // string만 들어갈 수 있음!

			return ps.executeUpdate();// 완성된 문장 실행, insert, update,delete
			// 되면 1이 나오지만, 이 return타입이 resultSet.
			// 얘네는 행을 바꿔주므로 int형!

		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}

		return 0;
	}

	public static List<BoardVO3> selBoardList() {
		List<BoardVO3> list = new ArrayList();// A
		// add를 record 수만큼 하기

		Connection con = null;
		PreparedStatement ps = null; // prepared 클래스명
		ResultSet rs = null;

		String sql = " SELECT iboard,title,regdt FROM t_board " + " ORDER BY iboard DESC "; // 중간에 빈칸 주기
//		rs=ps.executeQuery();
		// 날리고 싶은 쿼리문 작성
		// con=DBUtils.getCon();만 적으면 빨간 줄 뜨는 이유 : 임마가 throw 되어 있으니까
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql); // prepare - 커넥션의 메소드명
			// select면 executeQuery사용하고, 나머지는 executeUpdate
			rs = ps.executeQuery();

			while (rs.next()) {// rs.next 하는 일 : record 가리키기, return 타입 boolean
				BoardVO3 vo = new BoardVO3();
				list.add(vo); // reference 변수이므로 어디 넣든 상관 없음!

				int iboard = rs.getInt("iboard");
				String title = rs.getString("title");
				String regdt = rs.getString("regdt");

				vo.setIboard(iboard);
				vo.setTitle(title);
				vo.setRegdt(regdt);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}

		return list;
	}

	public static int deleteBoard(BoardVO3 param) {

		Connection con = null; // preparedstatement 객체 생성, 다리 역할
		PreparedStatement ps = null;// preparedstatement 쿼리문 실행
		// 위의 변수들을 바로 선언하면 finally에서 사용할 수 없음

		String sql = " DELETE FROM t_board" + " WHERE iboard=?";
		// ?가 쓰였다는건 preparedstatement를 사용한다
		// "VALUES('" + vo.getTitle() + "','" + vo.getContent() + "')";
		// 1부터 시작한다

		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);

			ps.setInt(1, param.getIboard()); // 얘는 int만 들어갈 수 있음!!

			return ps.executeUpdate();// 완성된 문장 실행, insert, update,delete
			// 되면 1이 나오지만, 이 return타입이 resultSet.
			// 얘네는 행을 바꿔주므로 int형!

		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}

		return 0;
	}

	public static BoardVO3 selBoard(int iboard) {

		Connection con = null;
		PreparedStatement ps = null; // prepared 클래스명
		ResultSet rs = null;

		String sql = " SELECT * FROM t_board WHERE iboard=?";
		// 물음표가 있으면 무조건 set 해주기
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql); // prepare - 커넥션의 메소드명
			// select면 executeQuery사용하고, 나머지는 executeUpdate
			ps.setInt(1, iboard);

			rs = ps.executeQuery();

			if (rs.next()) {// rs.next 하는 일 : record 가리키기, return 타입 boolean
				BoardVO3 vo = new BoardVO3();

				iboard = rs.getInt("iboard");
				String title = rs.getString("title");
				String ctnt = rs.getString("ctnt");
				String regdt = rs.getString("regdt");

				vo.setIboard(iboard);
				vo.setTitle(title);
				vo.setRegdt(regdt);
				vo.setCtnt(ctnt);

				return vo;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(con, ps, rs);
		}
		return null;
	}

	public static int updateBoard(BoardVO3 param) {

		Connection con = null; // preparedstatement 객체 생성, 다리 역할
		PreparedStatement ps = null;// preparedstatement 쿼리문 실행
		// 위의 변수들을 바로 선언하면 finally에서 사용할 수 없음

		String sql = "UPDATE t_board" + " SET title = ? " + " , ctnt=?" + " WHERE iboard=?";
		// ?가 쓰였다는건 preparedstatement를 사용한다
		// "VALUES('" + vo.getTitle() + "','" + vo.getContent() + "')";
		// 1부터 시작한다

		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.setInt(3, param.getIboard());

			System.out.println(ps.toString());
			return ps.executeUpdate();// 완성된 문장 실행, insert, update,delete
			// 되면 1이 나오지만, 이 return타입이 resultSet.
			// 얘네는 행을 바꿔주므로 int형!

		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			DBUtils.close(con, ps);
		}

		return 0;

	}
}