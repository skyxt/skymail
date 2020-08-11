package personal.skyxt.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;

import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallproduct.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:48
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

