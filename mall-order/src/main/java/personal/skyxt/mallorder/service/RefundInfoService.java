package personal.skyxt.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 09:54:19
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

