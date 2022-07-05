package com.yami.shop.api.controller;

import com.yami.shop.bean.app.dto.FarmDto;
import com.yami.shop.bean.model.Farm;
import com.yami.shop.bean.param.FarmParam;
import com.yami.shop.service.FarmService;
import com.yami.shop.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/farm")
@Api(tags = "农场接口")
public class FarmController {

    @Autowired
    private FarmService farmService;

    @Autowired
    private ProductService productService;

    @GetMapping("/farmInfo")
    @ApiOperation(value = "农场详细信息", notes = "根据农场ID获取农场详细信息")
    @ApiImplicitParam(name = "id", value = "农场ID", required = true, dataType = "Long")
    public ResponseEntity<Farm> farmInfo(long id){
        Farm farm = farmService.getFarmById(id);
        if(farm==null){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.ok(farm);
    }

    @GetMapping("/allFarms")
    @ApiOperation(value = "农场详细信息", notes = "根据农场ID获取农场详细信息")
    public ResponseEntity<List<Farm>> getAllFarms(){
        List<Farm> farmList = farmService.getAllFarms();
        return ResponseEntity.ok(farmList);
    }



    @PostMapping("/updateFarm")
    @ApiOperation(value = "更新农场数据", notes = "根据传入的ID以及其他农场信息更新农场数据")
    public ResponseEntity<Void> updateFarm(FarmParam farmParam){
        Farm farm = new Farm();
        farm.setId(farmParam.getId());
        farm.setName(farmParam.getName());
        farm.setLongitude(farmParam.getLongitude());
        farm.setLatitude(farmParam.getLatitude());
        farm.setAddress(farmParam.getAddress());
        farm.setStatus(farmParam.getStatus());
        farm.setOpeningTime(farmParam.getOpeningTime());
        farm.setDistance(farmParam.getDistance());
        farmService.updateFarm(farm);
        return ResponseEntity.ok().build();
    }





}
