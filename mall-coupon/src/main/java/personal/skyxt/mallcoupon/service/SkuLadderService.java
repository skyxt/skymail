package personal.skyxt.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallcoupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:09:17
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

