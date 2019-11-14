package org.line.learn.repertory;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "repertory")
public interface RepertoryFeign {

    @RequestMapping(value = "/repertory/total")
    Integer getTotalNumber(@PathVariable("sku") String sku);

}
