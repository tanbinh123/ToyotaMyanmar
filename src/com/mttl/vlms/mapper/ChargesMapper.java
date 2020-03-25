package com.mttl.vlms.mapper;

import com.mttl.vlms.entity.Charges;
import com.mttl.vlms.entity.ChargesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChargesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int countByExample(ChargesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int deleteByExample(ChargesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int insert(Charges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int insertSelective(Charges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    List<Charges> selectByExampleWithRowbounds(ChargesExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    List<Charges> selectByExample(ChargesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    Charges selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Charges record, @Param("example") ChargesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Charges record, @Param("example") ChargesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Charges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table charges
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Charges record);
}