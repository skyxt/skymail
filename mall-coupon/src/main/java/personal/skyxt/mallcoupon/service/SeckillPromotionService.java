package personal.skyxt.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallcoupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:09:18
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

