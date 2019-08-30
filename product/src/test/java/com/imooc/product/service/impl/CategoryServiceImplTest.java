package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryService categoryServiceImpl;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = categoryServiceImpl.findByCategoryTypeIn(Arrays.asList(11,22));
        Assert.assertTrue(productCategoryList.size()>0);
    }
}