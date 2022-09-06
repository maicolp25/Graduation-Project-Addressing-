package com.project.ud.service;

import com.project.ud.dto.AddresingVlsmDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddresingServiceImpl implements IAddressingService{

    @Override
    public List<AddresingVlsmDTO> generateAddressingVlsm() {
        List<AddresingVlsmDTO> listAddresingVlsm = new ArrayList<AddresingVlsmDTO>();

        return null;
    }

    @Override
    public Integer validateNumberNetworkPrefix(String ipAddress) {
        Integer numberNetworkPrefix=this.calculateNetworkPrefix(ipAddress);
        return numberNetworkPrefix;
    }

    public Integer calculateNetworkPrefix(String ipAddress){
        return 1;
    }
}
