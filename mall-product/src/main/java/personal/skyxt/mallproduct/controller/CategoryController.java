package personal.skyxt.mallproduct.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallcommon.utils.R;
import personal.skyxt.mallproduct.entity.CategoryEntity;
import personal.skyxt.mallproduct.service.CategoryService;



/**
 * 商品三级分类
 *
 * @author skyxt
 * @email skyxt.yang@gmail.com
 * @date 2020-08-05 14:25:50
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    ////@RequiresPermissions(":category:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * 树形列表
     * @return
     */
    @RequestMapping(path = "/list/tree", method = RequestMethod.GET)
    ////@RequiresPermissions(":category:list")
    public R list(){
        List<CategoryEntity> tree = categoryService.queryTree();
        return R.ok().put("data", tree);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    ////@RequiresPermissions(":category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    ////@RequiresPermissions(":category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions(":category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions(":category:delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
