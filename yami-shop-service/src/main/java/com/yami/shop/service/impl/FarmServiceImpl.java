package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yami.shop.bean.model.Farm;
import com.yami.shop.bean.model.Product;
import com.yami.shop.dao.FarmMapper;
import com.yami.shop.dao.ProductMapper;
import com.yami.shop.service.FarmService;
import com.yami.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmServiceImpl extends ServiceImpl<FarmMapper, Farm> implements FarmService {

    @Autowired
    private FarmMapper farmMapper;

    @Override
    public Farm getFarmById(long id){

        Farm farm = farmMapper.selectById(id);
        return farm;
    }
}
