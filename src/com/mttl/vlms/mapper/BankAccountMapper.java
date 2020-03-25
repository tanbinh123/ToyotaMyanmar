package com.mttl.vlms.mapper;

import com.mttl.vlms.entity.BankAccount;
import com.mttl.vlms.entity.BankAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BankAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int countByExample(BankAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int deleteByExample(BankAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int insert(BankAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int insertSelective(BankAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    List<BankAccount> selectByExampleWithRowbounds(BankAccountExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    List<BankAccount> selectByExample(BankAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    BankAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BankAccount record, @Param("example") BankAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BankAccount record, @Param("example") BankAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BankAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BankAccount record);
}