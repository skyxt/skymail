package personal.skyxt.mallproduct.dao;

import personal.skyxt.mallproduct.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import personal.skyxt.mallproduct.entity.AttrEntity;

/**
 * 商品属性
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:50
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
