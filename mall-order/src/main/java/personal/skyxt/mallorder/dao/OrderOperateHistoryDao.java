package personal.skyxt.mallorder.dao;

import personal.skyxt.mallorder.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 09:54:20
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
