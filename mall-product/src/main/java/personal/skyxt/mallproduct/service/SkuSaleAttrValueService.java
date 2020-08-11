package personal.skyxt.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;

import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallproduct.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:49
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

