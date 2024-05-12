package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.wlwData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
* @author Hasee
* @description 针对表【tb_data_wlw】的数据库操作Mapper
* @createDate 2024-05-08 20:11:48
* @Entity generator.domain.tb_data_wlw
*/
@Mapper
public interface wlwDataMapper extends BaseMapper<wlwData> {
    @Select("SELECT * FROM tb_data_wlw ORDER BY id DESC LIMIT 1")
    List<wlwData> getLatestData();
}




