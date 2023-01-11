package com.squareshift.demo.common;

import com.squareshift.demo.dto.CartItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class Distance {

    @Autowired
    RestTemplate restTemplate;
    public double getDistance(CartItemDto cartItemDto){

        long postalcode=cartItemDto.getPostalCode();
        restTemplate.getForEntity("http://15.206.157.204:8080/warehouse/distance?postal_code="+postalcode,)
        return 0;
    }
}
