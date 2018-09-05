package com.gdtel.beaver.itportal.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author gdxieyue@gmail.com
 * @since 2018-08-15
 */
@Data
@Accessors(chain = true)
@TableName("bas_user")
public class BasUser extends Model<BasUser> {

    private static final long serialVersionUID = 1L;

    @TableId("user_id")
	private String userId;
    /**
     * 名称
     */
	private String name;
    /**
     * 简写，帮助记忆，建议为姓名拼音的首字母
     */
	@TableField("short_name")
	private String shortName;
    /**
     * 头像
     */
	@TableField("avatar_id")
	private String avatarId;
    /**
     * 密码
     */
	private String password;
    /**
     * 手机
     */
	private String mobile;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 机构
     */
	@TableField("org_id")
	private String orgId;
    /**
     * 用户状态(U0A:有效,U0B:审核中,U0C:冻结,U0D:无效)
     */
	private String state;
	@TableField("create_date")
	private Date createDate;
	@TableField("update_date")
	private Date updateDate;
	@TableField("branch_id")
	private String branchId;
	@TableField("org_name")
	private String orgName;
	private String remark;


	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
