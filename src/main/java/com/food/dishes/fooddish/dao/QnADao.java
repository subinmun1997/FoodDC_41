package com.food.dishes.fooddish.dao;

import com.food.dishes.fooddish.exception.QnAException;
import com.food.dishes.fooddish.vo.QnAVO;
import com.food.dishes.fooddish.vo.UserVO;

import java.util.List;

public interface QnADao {

    int insert(QnAVO qna) throws QnAException;
    void update(QnAVO qna) throws QnAException;
    void delete(String email) throws QnAException;
    List<QnAVO> selectAll(int page, int pageSize) throws QnAException;
    List<QnAVO> selectAll(int page, int pageSize, UserVO user) throws QnAException;
    List<QnAVO> selectAll(int page, int pageSize, String qna_type) throws QnAException;
    List<QnAVO> selectAll(int page, int pageSize, String qna_type, UserVO user) throws QnAException;
    List<QnAVO> selectAllDone(int page, int pageSize) throws QnAException;
    List<QnAVO> selectAllDone(int page, int pageSize, UserVO user) throws QnAException;
    QnAVO selectById(int qna_id) throws QnAException;
    int getTotalRecord() throws QnAException;
    int getTotalRecord(UserVO user) throws QnAException;
    int getTotalRecord(String qna_type) throws QnAException;
    int getTotalRecord(String qna_type, UserVO user) throws QnAException;
    int getTotalRecordDone() throws QnAException;
    int getTotalRecordDone(UserVO user) throws QnAException;
}
