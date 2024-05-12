package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.wlwData;

import java.util.List;

/**
* @author Hasee
* @description 针对表【tb_data_wlw】的数据库操作Service
* @createDate 2024-05-08 20:11:48
*/
public interface wlwDataService extends IService<wlwData> {
    List<wlwData> getLatestData();


}
