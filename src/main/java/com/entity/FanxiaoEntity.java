package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 返校申请
 *
 * @author 
 * @email
 */
@TableName("fanxiao")
public class FanxiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FanxiaoEntity() {

	}

	public FanxiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 申请返校日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "fanxiao_time")

    private Date fanxiaoTime;


    /**
     * 当前地址
     */
    @TableField(value = "diqu")

    private String diqu;


    /**
     * 返校方式
     */
    @TableField(value = "fangshi_types")

    private Integer fangshiTypes;


    /**
     * 返校车次
     */
    @TableField(value = "checi")

    private String checi;


    /**
     * 所在地区风险等级
     */
    @TableField(value = "fengxian_types")

    private Integer fengxianTypes;


    /**
     * 返校原因
     */
    @TableField(value = "fanxiao_content")

    private String fanxiaoContent;


    /**
     * 是否同意
     */
    @TableField(value = "fanxiao_yesno_types")

    private Integer fanxiaoYesnoTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：申请返校日期
	 */
    public Date getFanxiaoTime() {
        return fanxiaoTime;
    }


    /**
	 * 获取：申请返校日期
	 */

    public void setFanxiaoTime(Date fanxiaoTime) {
        this.fanxiaoTime = fanxiaoTime;
    }
    /**
	 * 设置：当前地址
	 */
    public String getDiqu() {
        return diqu;
    }


    /**
	 * 获取：当前地址
	 */

    public void setDiqu(String diqu) {
        this.diqu = diqu;
    }
    /**
	 * 设置：返校方式
	 */
    public Integer getFangshiTypes() {
        return fangshiTypes;
    }


    /**
	 * 获取：返校方式
	 */

    public void setFangshiTypes(Integer fangshiTypes) {
        this.fangshiTypes = fangshiTypes;
    }
    /**
	 * 设置：返校车次
	 */
    public String getCheci() {
        return checi;
    }


    /**
	 * 获取：返校车次
	 */

    public void setCheci(String checi) {
        this.checi = checi;
    }
    /**
	 * 设置：所在地区风险等级
	 */
    public Integer getFengxianTypes() {
        return fengxianTypes;
    }


    /**
	 * 获取：所在地区风险等级
	 */

    public void setFengxianTypes(Integer fengxianTypes) {
        this.fengxianTypes = fengxianTypes;
    }
    /**
	 * 设置：返校原因
	 */
    public String getFanxiaoContent() {
        return fanxiaoContent;
    }


    /**
	 * 获取：返校原因
	 */

    public void setFanxiaoContent(String fanxiaoContent) {
        this.fanxiaoContent = fanxiaoContent;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getFanxiaoYesnoTypes() {
        return fanxiaoYesnoTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setFanxiaoYesnoTypes(Integer fanxiaoYesnoTypes) {
        this.fanxiaoYesnoTypes = fanxiaoYesnoTypes;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fanxiao{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", fanxiaoTime=" + fanxiaoTime +
            ", diqu=" + diqu +
            ", fangshiTypes=" + fangshiTypes +
            ", checi=" + checi +
            ", fengxianTypes=" + fengxianTypes +
            ", fanxiaoContent=" + fanxiaoContent +
            ", fanxiaoYesnoTypes=" + fanxiaoYesnoTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
