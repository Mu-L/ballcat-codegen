package com.hccake.ballcat.codegen.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 模板文件目录项
 *
 * @author hccake
 * @date 2020-06-19 19:11:41
 */
@Data
@ApiModel(value = "模板文件目录项")
public class TemplateDirectoryUpdateDTO {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private Integer id;

	/**
	 * 文件夹全路径/模板文件名称（支持占位符）
	 */
	@ApiModelProperty(value = "文件夹路径/模板文件名称（支持占位符）")
	private String fileName;

	/**
	 * 文件类型 1：文件夹 2：模板文件
	 */
	@ApiModelProperty(value = "文件类型 1：文件夹 2：模板文件")
	private Integer type;

	/**
	 * 模板详情信息
	 */
	@ApiModelProperty(value = "模板信息")
	private TemplateInfoDTO templateInfo;

}
