package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.exception.QnAException;
import com.food.dishes.fooddish.mapper.QnAMapper;
import com.food.dishes.fooddish.vo.QnAVO;
import com.food.dishes.fooddish.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("qnADao")
public class QnaDaoImpl implements QnADao {

    @Autowired
    private JdbcTemplate jTemp;
    
    @Override
    public int insert(QnAVO qna) throws QnAException {
        final String sql = "INSERT INTO qnas VALUES(DEFAULT, ?, ?, DEFAULT, ?, ?, CURRENT_TIMESTAMP, NULL, NULL);";
        KeyHolder holder = new GeneratedKeyHolder();
        final String[] str = {"qna_id"};
        jTemp.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pstmt = con.prepareStatement(sql, str);
                pstmt.setString(1, qna.getType().getId());
                pstmt.setInt(2, qna.getUser().getId());
                pstmt.setString(3, qna.getTitle());
                pstmt.setString(4, qna.getContent());
                return pstmt;
            }
        }, holder);

        Number key = holder.getKey();
        int qnaId = key.intValue();

        return qnaId;
    }

    @Override
    public void update(QnAVO qna) throws QnAException {
        String sql = "UPDATE qnas SET manager_id = ?, qna_answer_content = ?, qna_answer_date = CURRENT_TIMESTAMP WHERE qna_id = ?";
        jTemp.update(sql, qna.getManager().getId(), qna.getAnswerContent(), qna.getId());
    }

    @Override
    public void delete(String email) throws QnAException {
        return;
    }

    @Override
    public List<QnAVO> selectAll(int page, int pageSize) throws QnAException {
        List<QnAVO> list;
        int startPoint = (page-1)*pageSize;

        String sql = "SELECT * FROM qna_view " +
                "ORDER BY qna_question_date DESC LIMIT ?, ?;";
        list = jTemp.query(sql, new QnAMapper(), startPoint, pageSize);
        return list;
    }

    @Override
    public List<QnAVO> selectAll(int page, int pageSize, String qna_type) throws QnAException {
        List<QnAVO> list;
        int startPoint = (page-1)*pageSize;
        String sql = "SELECT * FROM qna_view " +
                "WHERE qna_type_id LIKE ? AND manager_id IS NULL " +
                "ORDER BY qna_question_date DESC LIMIT ?, ?;";
        list = jTemp.query(sql, new QnAMapper(), qna_type, startPoint, pageSize);
        return list;
    }

    @Override
    public List<QnAVO> selectAll(int page, int pageSize, UserVO user) throws QnAException {
        List<QnAVO> list;
        int startPoint = (page-1)*pageSize;

        String sql = "SELECT * FROM qna_view " +
                "WHERE user_id LIKE ? " +
                "ORDER BY qna_question_date DESC LIMIT ?, ?;";
        list = jTemp.query(sql, new QnAMapper(), user.getId(),startPoint, pageSize);
        return list;
    }

    @Override
    public List<QnAVO> selectAll(int page, int pageSize, String qna_type, UserVO user) throws QnAException {
        List<QnAVO> list;
        int startPoint = (page-1)*pageSize;
        String sql = "SELECT * FROM qna_view " +
                "WHERE qna_type_id LIKE ? AND user_id LIKE ? AND manager_id IS NULL " +
                "ORDER BY qna_question_date DESC LIMIT ?, ?;";
        list = jTemp.query(sql, new QnAMapper(), qna_type, user.getId(),startPoint, pageSize);
        return list;
    }

    @Override
    public List<QnAVO> selectAllDone(int page, int pageSize) throws QnAException {
        List<QnAVO> list;
        int startPoint = (page-1)*pageSize;
        String sql = "SELECT * FROM qna_view " +
                "WHERE manager_id IS NOT NULL " +
                "ORDER BY qna_question_date DESC LIMIT ?, ?;";
        list = jTemp.query(sql, new QnAMapper(), startPoint, pageSize);
        return list;
    }

    @Override
    public List<QnAVO> selectAllDone(int page, int pageSize, UserVO user) throws QnAException {
        List<QnAVO> list;
        int startPoint = (page-1)*pageSize;
        String sql = "SELECT * FROM qna_view " +
                "WHERE user_id LIKE ? AND manager_id IS NOT NULL " +
                "ORDER BY qna_question_date DESC LIMIT ?, ?;";
        list = jTemp.query(sql, new QnAMapper(), user.getId(), startPoint, pageSize);
        return list;
    }

    @Override
    public QnAVO selectById(int qna_id) throws QnAException {
        List<QnAVO> list;
        String sql = "SELECT * FROM qna_view " +
                "WHERE qna_id = ?;";
        list = jTemp.query(sql, new QnAMapper(), qna_id);
        return (list.size() == 0? null:list.get(0));
    }

    @Override
    public int getTotalRecord() throws QnAException {
        String sql="select count(*) as num from qnas;";
        List<Integer> list = jTemp.query(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt("num");
            }
        });

        return (list.size() == 0? 0:list.get(0));
    }

    @Override
    public int getTotalRecord(UserVO user) throws QnAException {
        String sql="select count(*) as num from qnas WHERE user_id = ?;";
        List<Integer> list = jTemp.query(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt("num");
            }
        }, user.getId());

        return (list.size() == 0? 0:list.get(0));
    }

    @Override
    public int getTotalRecord(String qna_type) throws QnAException {
        String sql = "select count(*) as num from qnas WHERE qna_type_id LIKE ? AND manager_id IS NULL;";
        List<Integer> list = jTemp.query(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt("num");
            }
        }, qna_type);

        return (list.size() == 0? 0:list.get(0));
    }

    @Override
    public int getTotalRecord(String qna_type, UserVO user) throws QnAException {
        String sql = "select count(*) as num from qnas WHERE qna_type_id LIKE ? AND user_id = ? AND manager_id IS NULL;";
        List<Integer> list = jTemp.query(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt("num");
            }
        }, qna_type, user.getId());

        return (list.size() == 0? 0:list.get(0));
    }

    @Override
    public int getTotalRecordDone() throws QnAException {
        String sql = "select count(*) as num from qnas WHERE manager_id IS NOT NULL;";
        List<Integer> list = jTemp.query(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt("num");
            }
        });

        return (list.size() == 0? 0:list.get(0));
    }

    @Override
    public int getTotalRecordDone(UserVO user) throws QnAException {
        String sql = "select count(*) as num from qnas WHERE user_id = ? AND manager_id IS NOT NULL;";
        List<Integer> list = jTemp.query(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt("num");
            }
        }, user.getId());

        return (list.size() == 0? 0:list.get(0));
    }
}
