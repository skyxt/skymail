package personal.skyxt.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallorder.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 09:54:20
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

