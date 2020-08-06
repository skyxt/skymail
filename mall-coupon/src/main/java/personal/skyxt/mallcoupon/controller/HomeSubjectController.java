package personal.skyxt.mallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import personal.skyxt.mallcoupon.entity.HomeSubjectEntity;
import personal.skyxt.mallcoupon.service.HomeSubjectService;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallcommon.utils.R;



/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-06 11:09:19
 */
@RestController
@RequestMapping("mallcoupon/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("mallcoupon:homesubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("mallcoupon:homesubject:info")
    public R info(@PathVariable("id") Long id){
		HomeSubjectEntity homeSubject = homeSubjectService.getById(id);

        return R.ok().put("homeSubject", homeSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("mallcoupon:homesubject:save")
    public R save(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.save(homeSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("mallcoupon:homesubject:update")
    public R update(@RequestBody HomeSubjectEntity homeSubject){
		homeSubjectService.updateById(homeSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("mallcoupon:homesubject:delete")
    public R delete(@RequestBody Long[] ids){
		homeSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
