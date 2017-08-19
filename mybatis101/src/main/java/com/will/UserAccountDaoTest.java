package com.will;

import java.io.IOException;

import com.will.test.UseTrivial;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Created by william on 16/8/1.
 */
public class UserAccountDaoTest {

    public static void main(String[] args) {
        //findUser();

        UseTrivial.trivailTest();
    }

    static public void findUser() {
        SqlSession sqlSession = getSessionFactory().openSession(true);

        //Test for database:userAccount
        UserAccountDao userMapper = sqlSession.getMapper(UserAccountDao.class);
        UserAccount user = userMapper.findUserById(103);
        System.out.println(user.getName());

        //Test for database:partner_feedback1
        PartnerFeedbackMapper partnerFeedbackMapper = sqlSession.getMapper(PartnerFeedbackMapper.class);
        PartnerFeedback partnerFeedback = new PartnerFeedback(9993333, "大多数是阿aaa", "测试mapper的反馈意见");
        //partnerFeedbackMapper.insert(partnerFeedback);
        try {
            partnerFeedbackMapper.insert(partnerFeedback);
        } catch (Exception e) {
            //异常如何处理,抛什么异常?
            System.out.println("记录反馈意见失败");
        }

        PartnerFeedback feedback = partnerFeedbackMapper.findFeedbackById(100001);
        System.out.println(feedback.getFeedback());

        //Assert.assertNotNull("没找到数据", user);
    }

    // Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "mybatisConfig.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

}
