package personal.skyxt.mallproduct.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import personal.skyxt.mallcommon.utils.PageUtils;
import personal.skyxt.mallcommon.utils.Query;

import personal.skyxt.mallproduct.dao.CategoryDao;
import personal.skyxt.mallproduct.entity.CategoryEntity;
import personal.skyxt.mallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    public List<CategoryEntity> queryTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> level1Tree = categoryEntities.stream().filter(
                categoryEntity -> categoryEntity.getParentCid() == 0
        ).map(categoryEntity -> addChildren(categoryEntity, categoryEntities)).collect(Collectors.toList());
        System.out.println(categoryEntities);
        return categoryEntities;
    }

    private CategoryEntity addChildren(CategoryEntity categoryEntity, List<CategoryEntity> list) {
        return categoryEntity.setChildren(list.stream().filter(
                category -> category.getParentCid().equals(categoryEntity.getCatId())
        ).collect(Collectors.toList()));
    }
}