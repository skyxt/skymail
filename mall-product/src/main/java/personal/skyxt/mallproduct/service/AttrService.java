package personal.skyxt.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;

import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:50
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

