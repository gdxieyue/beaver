package com.gdtel.beaver.shop11.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gdxieyue@gmail.com
 * @since 2018-09-06
 */
@Data
@Accessors(chain = true)
@TableName("test")
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String value;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
