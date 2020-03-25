package com.mttl.vlms.mapper;

import com.mttl.vlms.entity.Zone;
import com.mttl.vlms.entity.ZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ZoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int countByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int deleteByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int insert(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int insertSelective(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    List<Zone> selectByExampleWithRowbounds(ZoneExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    List<Zone> selectByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    Zone selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Zone record, @Param("example") ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Zone record, @Param("example") ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Zone record);
}