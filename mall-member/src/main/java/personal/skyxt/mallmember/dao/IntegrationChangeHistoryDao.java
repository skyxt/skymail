package personal.skyxt.mallmember.dao;

import personal.skyxt.mallmember.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:15:34
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
