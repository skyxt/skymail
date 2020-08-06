package personal.skyxt.mallcoupon.dao;

import personal.skyxt.mallcoupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:09:18
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
