/* 
 * SerialNumberService.java  
 * 
 * version TODO
 *
 * 2016年9月12日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.cmbc.sequence.service;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月12日 下午3:49:23
 * @since 
 */
public interface SerialNumberService {

	/**
	 * 生成民生交易流水号
	 * @return 流水号
	 */
	public String generateCMBCSerialNo();
	
	
}
