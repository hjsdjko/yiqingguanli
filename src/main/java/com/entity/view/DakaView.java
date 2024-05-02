package com.entity.view;

import com.entity.DakaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 健康打卡
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("daka")
public class DakaView extends DakaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 是否咳嗽的值
		*/
		private String kesouValue;
		/**
		* 有无接触确诊病例的值
		*/
		private String jiechuValue;
		/**
		* 近14天是否有外地旅居史的值
		*/
		private String waidiValue;
		/**
		* 近14天是否有中高风险地区旅居史的值
		*/
		private String zhonggaoValue;
		/**
		* 是否已隔离的值
		*/
		private String geliValue;



		//级联表 xuesheng
			/**
			* 学号
			*/
			private String xueshengUuidNumber;
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 学生手机号
			*/
			private String xueshengPhone;
			/**
			* 学生身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 学生照片
			*/
			private String xueshengPhoto;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 电子邮箱
			*/
			private String xueshengEmail;

	public DakaView() {

	}

	public DakaView(DakaEntity dakaEntity) {
		try {
			BeanUtils.copyProperties(this, dakaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否咳嗽的值
			*/
			public String getKesouValue() {
				return kesouValue;
			}
			/**
			* 设置： 是否咳嗽的值
			*/
			public void setKesouValue(String kesouValue) {
				this.kesouValue = kesouValue;
			}
			/**
			* 获取： 有无接触确诊病例的值
			*/
			public String getJiechuValue() {
				return jiechuValue;
			}
			/**
			* 设置： 有无接触确诊病例的值
			*/
			public void setJiechuValue(String jiechuValue) {
				this.jiechuValue = jiechuValue;
			}
			/**
			* 获取： 近14天是否有外地旅居史的值
			*/
			public String getWaidiValue() {
				return waidiValue;
			}
			/**
			* 设置： 近14天是否有外地旅居史的值
			*/
			public void setWaidiValue(String waidiValue) {
				this.waidiValue = waidiValue;
			}
			/**
			* 获取： 近14天是否有中高风险地区旅居史的值
			*/
			public String getZhonggaoValue() {
				return zhonggaoValue;
			}
			/**
			* 设置： 近14天是否有中高风险地区旅居史的值
			*/
			public void setZhonggaoValue(String zhonggaoValue) {
				this.zhonggaoValue = zhonggaoValue;
			}
			/**
			* 获取： 是否已隔离的值
			*/
			public String getGeliValue() {
				return geliValue;
			}
			/**
			* 设置： 是否已隔离的值
			*/
			public void setGeliValue(String geliValue) {
				this.geliValue = geliValue;
			}












				//级联表的get和set xuesheng
					/**
					* 获取： 学号
					*/
					public String getXueshengUuidNumber() {
						return xueshengUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setXueshengUuidNumber(String xueshengUuidNumber) {
						this.xueshengUuidNumber = xueshengUuidNumber;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}
					/**
					* 获取： 学生照片
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 学生照片
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengEmail() {
						return xueshengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengEmail(String xueshengEmail) {
						this.xueshengEmail = xueshengEmail;
					}




}
