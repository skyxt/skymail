package personal.skyxt.mallorder.dao;

import personal.skyxt.mallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 09:54:20
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
