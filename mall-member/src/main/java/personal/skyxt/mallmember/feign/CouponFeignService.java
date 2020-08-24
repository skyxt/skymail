package personal.skyxt.mallmember.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import personal.skyxt.mallcommon.utils.R;

@FeignClient("coupon-service")
public interface CouponFeignService {

    @PostMapping("mallcoupon/coupon/test")
    public R test();
}
