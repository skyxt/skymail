package personal.skyxt.mallorder.dao;

import personal.skyxt.mallorder.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 09:54:19
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
