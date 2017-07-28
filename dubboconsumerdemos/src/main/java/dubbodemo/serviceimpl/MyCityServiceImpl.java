package dubbodemo.serviceimpl;

import dubbodemo.domain.City;
import dubbodemo.pservice.MyCityService;
import dubbodemo.service.CityService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class MyCityServiceImpl implements MyCityService{
    @Reference(version = "1.0.0")
    private CityService cityService;

    public void printCity() {
        String cityName="温岭";
        City city = cityService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
