package personal.skyxt.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 13:41:41
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

