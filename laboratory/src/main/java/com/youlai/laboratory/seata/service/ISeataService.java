package com.youlai.laboratory.seata.service;

import com.youlai.laboratory.seata.pojo.form.SeataForm;
import com.youlai.laboratory.seata.pojo.vo.SeataDataVO;

/**
 * @author haoxr
 * @date 2022/4/16 20:49
 */
public interface ISeataService {

    /**
     * 模拟订单支付
     *
     * @return
     */
    boolean payOrder(SeataForm seataForm);

    /**
     * 模拟订单支付(分布式事务)
     *
     * @param seataForm
     * @return
     */
    boolean payOrderWithGlobalTx(SeataForm seataForm);

    /**
     * 获取模拟数据
     *
     * @return
     */
    SeataDataVO getData();

    /**
     * 重置模拟数据
     *
     * @return
     */
    boolean resetData();
}
