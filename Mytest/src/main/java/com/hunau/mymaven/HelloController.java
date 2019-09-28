package com.hunau.mymaven;

/*** 
 <p>@Title:</p>
 *
 <p>@程序说明:</p>
 *
 <p>@开发公司:湖南农业大学信息院物联网系 </p> 
 *
 <p>@程序员： </p>
 *
 <p>@开发日期：  </p>
 *
 <p>@版权所有：     湖南农业大学信息院物联网系版本所有</p>
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/sayhello")
    public String hello() {
        return "葛璐豪,山西省灵石县";
    }
}
