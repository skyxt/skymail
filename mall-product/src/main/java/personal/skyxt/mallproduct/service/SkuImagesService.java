package personal.skyxt.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;

import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:49
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

