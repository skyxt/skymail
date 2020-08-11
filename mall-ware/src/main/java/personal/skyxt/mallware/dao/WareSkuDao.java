package personal.skyxt.mallware.dao;

import personal.skyxt.mallware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 13:41:40
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
