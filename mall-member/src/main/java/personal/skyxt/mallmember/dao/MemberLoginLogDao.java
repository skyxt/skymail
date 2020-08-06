package personal.skyxt.mallmember.dao;

import personal.skyxt.mallmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:15:32
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
