package personal.skyxt.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;

import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:49
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

