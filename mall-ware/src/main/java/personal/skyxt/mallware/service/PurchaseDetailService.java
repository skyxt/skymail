package personal.skyxt.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 13:41:41
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

