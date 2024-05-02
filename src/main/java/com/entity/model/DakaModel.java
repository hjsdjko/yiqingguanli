package com.entity.model;

import com.entity.DakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康打卡
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DakaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 打卡日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 体温
     */
    private String dakaTiwen;


    /**
     * 是否咳嗽
     */
    private Integer kesouTypes;


    /**
     * 当前所在地区
     */
    private String diqu;


    /**
     * 有无接触确诊病例
     */
    private Integer jiechuTypes;


    /**
     * 近14天是否有外地旅居史
     */
    private Integer waidiTypes;


    /**
     * 近14天是否有外地旅居史详情
     */
    private String waidiContent;


    /**
     * 近14天是否有中高风险地区旅居史
     */
    private Integer zhonggaoTypes;


    /**
     * 近14天是否有中高风险地区旅居史详情
     */
    private String zhonggaoContent;


    /**
     * 是否已隔离
     */
    private Integer geliTypes;


    /**
     * 已隔离天数
     */
    private Integer gelishijian;


    /**
     * 备注
     */
    private String beizhuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：打卡日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：打卡日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：体温
	 */
    public String getDakaTiwen() {
        return dakaTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setDakaTiwen(String dakaTiwen) {
        this.dakaTiwen = dakaTiwen;
    }
    /**
	 * 获取：是否咳嗽
	 */
    public Integer getKesouTypes() {
        return kesouTypes;
    }


    /**
	 * 设置：是否咳嗽
	 */
    public void setKesouTypes(Integer kesouTypes) {
        this.kesouTypes = kesouTypes;
    }
    /**
	 * 获取：当前所在地区
	 */
    public String getDiqu() {
        return diqu;
    }


    /**
	 * 设置：当前所在地区
	 */
    public void setDiqu(String diqu) {
        this.diqu = diqu;
    }
    /**
	 * 获取：有无接触确诊病例
	 */
    public Integer getJiechuTypes() {
        return jiechuTypes;
    }


    /**
	 * 设置：有无接触确诊病例
	 */
    public void setJiechuTypes(Integer jiechuTypes) {
        this.jiechuTypes = jiechuTypes;
    }
    /**
	 * 获取：近14天是否有外地旅居史
	 */
    public Integer getWaidiTypes() {
        return waidiTypes;
    }


    /**
	 * 设置：近14天是否有外地旅居史
	 */
    public void setWaidiTypes(Integer waidiTypes) {
        this.waidiTypes = waidiTypes;
    }
    /**
	 * 获取：近14天是否有外地旅居史详情
	 */
    public String getWaidiContent() {
        return waidiContent;
    }


    /**
	 * 设置：近14天是否有外地旅居史详情
	 */
    public void setWaidiContent(String waidiContent) {
        this.waidiContent = waidiContent;
    }
    /**
	 * 获取：近14天是否有中高风险地区旅居史
	 */
    public Integer getZhonggaoTypes() {
        return zhonggaoTypes;
    }


    /**
	 * 设置：近14天是否有中高风险地区旅居史
	 */
    public void setZhonggaoTypes(Integer zhonggaoTypes) {
        this.zhonggaoTypes = zhonggaoTypes;
    }
    /**
	 * 获取：近14天是否有中高风险地区旅居史详情
	 */
    public String getZhonggaoContent() {
        return zhonggaoContent;
    }


    /**
	 * 设置：近14天是否有中高风险地区旅居史详情
	 */
    public void setZhonggaoContent(String zhonggaoContent) {
        this.zhonggaoContent = zhonggaoContent;
    }
    /**
	 * 获取：是否已隔离
	 */
    public Integer getGeliTypes() {
        return geliTypes;
    }


    /**
	 * 设置：是否已隔离
	 */
    public void setGeliTypes(Integer geliTypes) {
        this.geliTypes = geliTypes;
    }
    /**
	 * 获取：已隔离天数
	 */
    public Integer getGelishijian() {
        return gelishijian;
    }


    /**
	 * 设置：已隔离天数
	 */
    public void setGelishijian(Integer gelishijian) {
        this.gelishijian = gelishijian;
    }
    /**
	 * 获取：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 设置：备注
	 */
    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
