package personal.skyxt.mallproduct.dao;

import personal.skyxt.mallproduct.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:49
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
