package com.entity.model;

import com.entity.FanxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 返校申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FanxiaoModel implements Serializable {
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
     * 申请返校日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fanxiaoTime;


    /**
     * 当前地址
     */
    private String diqu;


    /**
     * 返校方式
     */
    private Integer fangshiTypes;


    /**
     * 返校车次
     */
    private String checi;


    /**
     * 所在地区风险等级
     */
    private Integer fengxianTypes;


    /**
     * 返校原因
     */
    private String fanxiaoContent;


    /**
     * 是否同意
     */
    private Integer fanxiaoYesnoTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：申请返校日期
	 */
    public Date getFanxiaoTime() {
        return fanxiaoTime;
    }


    /**
	 * 设置：申请返校日期
	 */
    public void setFanxiaoTime(Date fanxiaoTime) {
        this.fanxiaoTime = fanxiaoTime;
    }
    /**
	 * 获取：当前地址
	 */
    public String getDiqu() {
        return diqu;
    }


    /**
	 * 设置：当前地址
	 */
    public void setDiqu(String diqu) {
        this.diqu = diqu;
    }
    /**
	 * 获取：返校方式
	 */
    public Integer getFangshiTypes() {
        return fangshiTypes;
    }


    /**
	 * 设置：返校方式
	 */
    public void setFangshiTypes(Integer fangshiTypes) {
        this.fangshiTypes = fangshiTypes;
    }
    /**
	 * 获取：返校车次
	 */
    public String getCheci() {
        return checi;
    }


    /**
	 * 设置：返校车次
	 */
    public void setCheci(String checi) {
        this.checi = checi;
    }
    /**
	 * 获取：所在地区风险等级
	 */
    public Integer getFengxianTypes() {
        return fengxianTypes;
    }


    /**
	 * 设置：所在地区风险等级
	 */
    public void setFengxianTypes(Integer fengxianTypes) {
        this.fengxianTypes = fengxianTypes;
    }
    /**
	 * 获取：返校原因
	 */
    public String getFanxiaoContent() {
        return fanxiaoContent;
    }


    /**
	 * 设置：返校原因
	 */
    public void setFanxiaoContent(String fanxiaoContent) {
        this.fanxiaoContent = fanxiaoContent;
    }
    /**
	 * 获取：是否同意
	 */
    public Integer getFanxiaoYesnoTypes() {
        return fanxiaoYesnoTypes;
    }


    /**
	 * 设置：是否同意
	 */
    public void setFanxiaoYesnoTypes(Integer fanxiaoYesnoTypes) {
        this.fanxiaoYesnoTypes = fanxiaoYesnoTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
