package com.hccake.ballcat.codegen.engine;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 模板引擎类型
 *
 * @author hccake
 */
@ToString
@Getter
@RequiredArgsConstructor
public enum TemplateEngineTypeEnum {

	/**
	 * 普通文本。
	 */
	PLAIN_TEXT(0),

	/**
	 * velocity 模板引擎。
	 */
	VELOCITY(1),

	/**
	 * Freemarker 模板引擎。
	 */
	FREEMARKER(2);

	private final Integer type;

	private static final Map<Integer, TemplateEngineTypeEnum> MAP = new HashMap<>();

	static {
		for (TemplateEngineTypeEnum engineTypeEnum : values()) {
			MAP.put(engineTypeEnum.getType(), engineTypeEnum);
		}
	}

	public static TemplateEngineTypeEnum of(Integer type) {
		return MAP.get(type);
	}

}
