package com.zlebank.zplatform.cmbc.dao;

import com.zlebank.zplatform.cmbc.common.pojo.PojoTxnsWithholding;

public interface TxnsWithholdingDAO extends BaseDAO<PojoTxnsWithholding>{

	/**
	 * 根据流水号获取代扣交易流水数据
	 * @param serialno 流水号（民生报文中）
	 * @return 民生代扣交易流水数据pojo
	 */
	public PojoTxnsWithholding getWithholdingBySerialNo(String serialno);
	
	/**
	 * 更新民生实名认证交易结果
	 * @param withholding 实名认证POJO
	 */
	public void updateRealNameResult(PojoTxnsWithholding withholding);
	
	/**
	 * 更新民生代付交易流水日志错误应答信息
	 * @param withholding
	 */
	public void updateWithholdingLogError(PojoTxnsWithholding withholding);
}
