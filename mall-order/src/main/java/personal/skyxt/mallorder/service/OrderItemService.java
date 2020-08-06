package personal.skyxt.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallorder.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 09:54:20
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

