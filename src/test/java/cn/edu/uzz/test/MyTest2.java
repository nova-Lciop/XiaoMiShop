package cn.edu.uzz.test;

import cn.edu.uzz.mapper.ProductInfoMapper;
import cn.edu.uzz.pojo.ProductInfo;
import cn.edu.uzz.pojo.vo.ProductInfoVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class MyTest2 {

    @Autowired
    private ProductInfoMapper infoMapper;

    @Test
    public void testSelectCondition(){
        ProductInfoVo vo = new ProductInfoVo();

        vo.setPname("2");

        vo.setHprice(2000.0);
        List<ProductInfo> infoList = infoMapper.selectCondition(vo);

        infoList.forEach(productInfo -> System.out.println(productInfo));

    }
}
