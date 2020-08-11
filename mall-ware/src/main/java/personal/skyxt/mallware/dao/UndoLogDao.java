package personal.skyxt.mallware.dao;

import personal.skyxt.mallware.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 13:41:41
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
