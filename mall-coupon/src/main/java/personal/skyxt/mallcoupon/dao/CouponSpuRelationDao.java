package personal.skyxt.mallcoupon.dao;

import personal.skyxt.mallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:09:20
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
