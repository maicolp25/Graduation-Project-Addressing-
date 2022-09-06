package com.project.ud.service;

import com.project.ud.dto.AddresingVlsmDTO;

import java.util.List;

public interface IAddressingService {
    public List<AddresingVlsmDTO> generateAddressingVlsm();
    public Integer validateNumberNetworkPrefix(String ipAddress);
}
