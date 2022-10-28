package com.Royna.WaterShopCommon;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme(value = "waterShopCommon")
@PWA(name = "WaterShopCommon", shortName = "WaterShopCommon", offlineResources = {})
@NpmPackage(value = "line-awesome", version = "1.3.0")
@NpmPackage(value = "@vaadin-component-factory/vcf-nav", version = "1.0.6")
public class WaterShopCommonApplication extends SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterShopCommonApplication.class, args);
	}

}
