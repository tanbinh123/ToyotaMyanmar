package com.mttl.vlms.mapper;

import com.mttl.vlms.entity.PortTerminal;
import com.mttl.vlms.entity.PortTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PortTerminalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int countByExample(PortTerminalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int deleteByExample(PortTerminalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int insert(PortTerminal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int insertSelective(PortTerminal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    List<PortTerminal> selectByExampleWithRowbounds(PortTerminalExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    List<PortTerminal> selectByExample(PortTerminalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    PortTerminal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PortTerminal record, @Param("example") PortTerminalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PortTerminal record, @Param("example") PortTerminalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PortTerminal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table port_terminal
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PortTerminal record);
}