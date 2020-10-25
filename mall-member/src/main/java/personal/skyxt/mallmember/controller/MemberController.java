package personal.skyxt.mallmember.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import personal.skyxt.mallmember.entity.MemberEntity;
import personal.skyxt.mallmember.feign.CouponFeignService;
import personal.skyxt.mallmember.service.MemberService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallcommon.utils.R;



/**
 * 会员
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:15:33
 */
@RefreshScope
@RestController
@RequestMapping("mallmember/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;

    @RequestMapping("/config/test")
    public R nacosConfigTest() {
        return R.ok().put("name", name).put("age", age);
    }

    @RequestMapping("/feign/test")
    public R CouponFeignTest() {
        return couponFeignService.test();
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    ////@RequiresPermissions("mallmember:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    ////@RequiresPermissions("mallmember:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    ////@RequiresPermissions("mallmember:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions("mallmember:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions("mallmember:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
