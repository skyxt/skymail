package personal.skyxt.mallproduct.dao;

import personal.skyxt.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
