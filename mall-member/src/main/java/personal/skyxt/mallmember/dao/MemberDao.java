package personal.skyxt.mallmember.dao;

import personal.skyxt.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:15:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
