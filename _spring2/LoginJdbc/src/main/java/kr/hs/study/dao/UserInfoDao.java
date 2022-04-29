package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.UserInfo;

@Component
public class UserInfoDao {
	
	@Autowired
	JdbcTemplate db;
	
	public void insertQuery(UserInfo user) {
		String sql = "insert into USERINFO values(?, ?, ?, ?)";
		db.update(sql, user.getUserId(), user.getUserPass(), user.getUserName(), user.getUserAge());
	}
	
	public void updateQuery(String userId, String userName) {
		String sql = "update userinfo set username=? where userid=?";
		int result = this.db.update(sql, userName, userId);
		System.out.println("Ω««‡¡ﬂ");
		System.out.println(result);
	}
	
	public void deleteQuery() {
		try {
			this.db.update("DELETE FROM USERINFO");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
