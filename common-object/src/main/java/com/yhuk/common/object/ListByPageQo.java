package com.yhuk.common.object;

import lombok.Data;

import java.util.Date;

/**
 * @Description TODO
 * @Author gaozhi.liu
 * @Date 2019/7/22 14:20
 * @Version 1.0
 **/
@Data
public class ListByPageQo {
    private Date startTime;

    private Date endTime;

    private Integer pageNo=0;

    private Integer pageSize=10;

    private String[] ascs;

    private String[] descs;


}
