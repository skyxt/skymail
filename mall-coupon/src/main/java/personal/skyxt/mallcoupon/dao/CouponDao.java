package personal.skyxt.mallcoupon.dao;

import personal.skyxt.mallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:09:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
