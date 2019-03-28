package com.jt809.serviceimpl;

import com.jt809.mapper.LocationMapper;
import com.jt809.pojo.LocationBean;
import com.jt809.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationMapper locationMapper;

    @Override
    public List<LocationBean> selectLocationByID(String simNumber) {

        return locationMapper.selectLocationByID(simNumber);
    }
}
