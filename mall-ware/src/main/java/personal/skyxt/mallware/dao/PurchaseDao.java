package personal.skyxt.mallware.dao;

import personal.skyxt.mallware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 13:41:41
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
