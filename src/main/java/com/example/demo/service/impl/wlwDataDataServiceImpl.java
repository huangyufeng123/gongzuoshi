package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.wlwData;
import com.example.demo.mapper.wlwDataMapper;
import com.example.demo.service.wlwDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Hasee
* @description 针对表【tb_data_wlw】的数据库操作Service实现
* @createDate 2024-05-08 20:11:48
*/
@Service
public class wlwDataDataServiceImpl extends ServiceImpl<wlwDataMapper, wlwData>
    implements wlwDataService {
    @Autowired
    private wlwDataMapper dataMapper;

    @Override
    public List<wlwData> getLatestData() {
        return dataMapper.getLatestData();
    }

}




