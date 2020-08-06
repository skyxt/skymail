package personal.skyxt.mallcoupon.dao;

import personal.skyxt.mallcoupon.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:09:17
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReductionEntity> {
	
}
