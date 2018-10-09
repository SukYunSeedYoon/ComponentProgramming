package com.springbook.biz.user.impl;

// DAO (Data Access Object)
import com.springbook.biz.common.JDBCUtil;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


// 어노테이션을 통해 자동으로 생성하여 DAO 객체 등록할 수 있도록
@Repository("userDAO")
public class UserDAO implements UserService {

    // jdbc 관련 변수
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;


    // SQL 명령어
    private final String USER_INSERT = "insert into user(ID, PASSWORD, NAME, ROLE) " +
            "values( ?,?,?,?)";

    private final String USER_GET = "select * from users where id=? and password=?";


        // 상세 조회
    public  UserVO getUser(UserVO vo){

        System.out.println("===> JDBC로 getUser 기능 처리");
        UserVO user = null;
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(USER_GET);
            stmt.setString(1, vo.getId());
            stmt.setString(2, vo.getPassword());
            rs = stmt.executeQuery();
            if(rs.next()){
                user = new UserVO();
                user.setId(rs.getString("ID"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setName(rs.getString("NAME"));
                user.setRole(rs.getString("ROLE"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            JDBCUtil.close(rs, stmt, conn);
        }
        return user;
    }


}
