package com.entity.vo;

import com.entity.DakaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康打卡
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("daka")
public class DakaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 打卡日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 体温
     */

    @TableField(value = "daka_tiwen")
    private String dakaTiwen;


    /**
     * 是否咳嗽
     */

    @TableField(value = "kesou_types")
    private Integer kesouTypes;


    /**
     * 当前所在地区
     */

    @TableField(value = "diqu")
    private String diqu;


    /**
     * 有无接触确诊病例
     */

    @TableField(value = "jiechu_types")
    private Integer jiechuTypes;


    /**
     * 近14天是否有外地旅居史
     */

    @TableField(value = "waidi_types")
    private Integer waidiTypes;


    /**
     * 近14天是否有外地旅居史详情
     */

    @TableField(value = "waidi_content")
    private String waidiContent;


    /**
     * 近14天是否有中高风险地区旅居史
     */

    @TableField(value = "zhonggao_types")
    private Integer zhonggaoTypes;


    /**
     * 近14天是否有中高风险地区旅居史详情
     */

    @TableField(value = "zhonggao_content")
    private String zhonggaoContent;


    /**
     * 是否已隔离
     */

    @TableField(value = "geli_types")
    private Integer geliTypes;


    /**
     * 已隔离天数
     */

    @TableField(value = "gelishijian")
    private Integer gelishijian;


    /**
     * 备注
     */

    @TableField(value = "beizhu_content")
    private String beizhuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：打卡日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：打卡日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：体温
	 */
    public String getDakaTiwen() {
        return dakaTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setDakaTiwen(String dakaTiwen) {
        this.dakaTiwen = dakaTiwen;
    }
    /**
	 * 设置：是否咳嗽
	 */
    public Integer getKesouTypes() {
        return kesouTypes;
    }


    /**
	 * 获取：是否咳嗽
	 */

    public void setKesouTypes(Integer kesouTypes) {
        this.kesouTypes = kesouTypes;
    }
    /**
	 * 设置：当前所在地区
	 */
    public String getDiqu() {
        return diqu;
    }


    /**
	 * 获取：当前所在地区
	 */

    public void setDiqu(String diqu) {
        this.diqu = diqu;
    }
    /**
	 * 设置：有无接触确诊病例
	 */
    public Integer getJiechuTypes() {
        return jiechuTypes;
    }


    /**
	 * 获取：有无接触确诊病例
	 */

    public void setJiechuTypes(Integer jiechuTypes) {
        this.jiechuTypes = jiechuTypes;
    }
    /**
	 * 设置：近14天是否有外地旅居史
	 */
    public Integer getWaidiTypes() {
        return waidiTypes;
    }


    /**
	 * 获取：近14天是否有外地旅居史
	 */

    public void setWaidiTypes(Integer waidiTypes) {
        this.waidiTypes = waidiTypes;
    }
    /**
	 * 设置：近14天是否有外地旅居史详情
	 */
    public String getWaidiContent() {
        return waidiContent;
    }


    /**
	 * 获取：近14天是否有外地旅居史详情
	 */

    public void setWaidiContent(String waidiContent) {
        this.waidiContent = waidiContent;
    }
    /**
	 * 设置：近14天是否有中高风险地区旅居史
	 */
    public Integer getZhonggaoTypes() {
        return zhonggaoTypes;
    }


    /**
	 * 获取：近14天是否有中高风险地区旅居史
	 */

    public void setZhonggaoTypes(Integer zhonggaoTypes) {
        this.zhonggaoTypes = zhonggaoTypes;
    }
    /**
	 * 设置：近14天是否有中高风险地区旅居史详情
	 */
    public String getZhonggaoContent() {
        return zhonggaoContent;
    }


    /**
	 * 获取：近14天是否有中高风险地区旅居史详情
	 */

    public void setZhonggaoContent(String zhonggaoContent) {
        this.zhonggaoContent = zhonggaoContent;
    }
    /**
	 * 设置：是否已隔离
	 */
    public Integer getGeliTypes() {
        return geliTypes;
    }


    /**
	 * 获取：是否已隔离
	 */

    public void setGeliTypes(Integer geliTypes) {
        this.geliTypes = geliTypes;
    }
    /**
	 * 设置：已隔离天数
	 */
    public Integer getGelishijian() {
        return gelishijian;
    }


    /**
	 * 获取：已隔离天数
	 */

    public void setGelishijian(Integer gelishijian) {
        this.gelishijian = gelishijian;
    }
    /**
	 * 设置：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
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

}
