package com.example.demo.controller;

import com.example.demo.common.BaseResponse;
import com.example.demo.common.ErrorCode;
import com.example.demo.common.ResultUtils;
import com.example.demo.entity.wlwData;
import com.example.demo.request.DeviceRequest;
import com.example.demo.service.wlwDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/wlw")
@Api(tags = "物联网课程设计")
public class wlwDataController {
    @Autowired
    private wlwDataService dataService;

    private static final Logger LOGGER = LoggerFactory.getLogger(wlwDataController.class);

    @PostMapping("/insertData")
    @ApiOperation(value="设备插入数据")
    public BaseResponse<String> insertData(@RequestBody wlwData data){
        LOGGER.info("调用了插入数据的接口，插入的数据内容是：{}", data);
        data.setCreate_time(new Date());
        boolean isSaved=dataService.save(data);
        if(isSaved){
            LOGGER.info("插入数据成功");
            return ResultUtils.success("数据插入成功");
        }
        else{
            LOGGER.error("插入数据失败，数据的内容是：{}", data);
            return ResultUtils.error(ErrorCode.PARAMS_ERROR,"数据插入失败","请检查数据格式");
        }
    }

    @GetMapping("/latestData")
    @ApiOperation(value = "获取最新一条信息")
    public BaseResponse<List<wlwData>> getLatestData(){
        LOGGER.info("调用了获取最新数据的接口");
        List<wlwData> data=dataService.getLatestData();
        if(data!=null && !data.isEmpty()){
            LOGGER.info("获取到最新的数据，数据内容是：{}", data);
            return ResultUtils.success(data);
        }
        else{
            LOGGER.error("未能获取到数据");
            return ResultUtils.error(ErrorCode.NULL_ERROR,"数据没找到","数据是空的");
        }
    }

}
