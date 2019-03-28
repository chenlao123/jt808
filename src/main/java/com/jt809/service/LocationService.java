package com.jt809.service;


import com.jt809.pojo.LocationBean;

import java.util.List;

public interface LocationService {
    /**
     * @author cl
     * @return
     */
    List<LocationBean> selectLocationByID(String simNumber);

}
