package top.chengdonglu.mall210.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.chengdonglu.mall210.db.domain.LitemallAftersale;
import top.chengdonglu.mall210.db.domain.LitemallAftersaleExample;

public interface LitemallAftersaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    long countByExample(LitemallAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int insert(LitemallAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int insertSelective(LitemallAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    LitemallAftersale selectOneByExample(LitemallAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    LitemallAftersale selectOneByExampleSelective(@Param("example") LitemallAftersaleExample example, @Param("selective") LitemallAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    List<LitemallAftersale> selectByExampleSelective(@Param("example") LitemallAftersaleExample example, @Param("selective") LitemallAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    List<LitemallAftersale> selectByExample(LitemallAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    LitemallAftersale selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    LitemallAftersale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    LitemallAftersale selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallAftersale record, @Param("example") LitemallAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallAftersale record, @Param("example") LitemallAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_aftersale
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}