package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yami.shop.bean.model.Farm;
import com.yami.shop.bean.model.Product;
import com.yami.shop.dao.FarmMapper;
import com.yami.shop.dao.ProductMapper;
import com.yami.shop.service.FarmService;
import com.yami.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmServiceImpl extends ServiceImpl<FarmMapper, Farm> implements FarmService {

    @Autowired
    private FarmMapper farmMapper;

    @Override
    public Farm getFarmById(long id){
        Farm farm = farmMapper.selectById(id);
        return farm;
    }

    @Override
    public void updateFarm(Farm farm){
        farmMapper.updateById(farm);
    }

    @Override
    public List<Farm> getAllFarms(){
        return farmMapper.selectList(null);
    }

    @Override
    public void insertFarm(Farm farm){
        farmMapper.insert(farm);
    }

    @Override
    public void deleteFarmById(long id){
        System.out.println("service "+id);
        QueryWrapper<Farm> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        farmMapper.delete(queryWrapper);
    }
}
