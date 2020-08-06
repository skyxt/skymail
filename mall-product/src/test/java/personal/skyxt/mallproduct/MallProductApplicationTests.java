package personal.skyxt.mallproduct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import personal.skyxt.mallproduct.entity.AttrEntity;
import personal.skyxt.mallproduct.service.AttrService;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private AttrService attrService;

    @Test
    void contextLoads() {
        AttrEntity attrEntity = new AttrEntity();
        attrEntity.setAttrName("test");
        boolean save = attrService.save(attrEntity);
        Assert.isTrue(save, "测试完成");
    }

}
