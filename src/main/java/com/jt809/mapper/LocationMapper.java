package com.jt809.mapper;

import com.jt809.pojo.LocationBean;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LocationMapper {
   List<LocationBean> selectLocationByID(String simNumber);
}
