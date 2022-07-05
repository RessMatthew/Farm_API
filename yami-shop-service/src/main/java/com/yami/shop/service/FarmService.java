package com.yami.shop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.app.dto.FarmDto;
import com.yami.shop.bean.model.Farm;
import com.yami.shop.bean.model.Product;

public interface FarmService extends IService<Farm> {

    Farm getFarmById(long id);

}
