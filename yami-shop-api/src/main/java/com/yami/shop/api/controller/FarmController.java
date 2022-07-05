package com.yami.shop.api.controller;

import com.yami.shop.bean.app.dto.FarmDto;
import com.yami.shop.bean.model.Farm;
import com.yami.shop.service.FarmService;
import com.yami.shop.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farm")
@Api(tags = "农场接口")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @Autowired
    private ProductService productService;

    @GetMapping("/farmInfo")
    @ApiOperation(value = "农场详细信息", notes = "根据农场ID（prodId）获取农场详细信息")
    @ApiImplicitParam(name = "id", value = "农场ID", required = true, dataType = "Long")
    public ResponseEntity<Farm> farmInfo(long id){
        Farm farm = farmService.getFarmById(id);
        if(farm==null){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.ok(farm);
    }


}
