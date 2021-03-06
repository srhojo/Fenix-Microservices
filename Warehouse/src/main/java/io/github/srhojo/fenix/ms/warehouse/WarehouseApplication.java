package io.github.srhojo.fenix.ms.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import io.github.srhojo.fenix.microservices.FenixMicroservice;
import io.github.srhojo.utils.restclient.EnableRestClient;

@FenixMicroservice
@EnableRestClient
@ComponentScan("io.github.srhojo.utils.ql")
public class WarehouseApplication {

    public static void main(final String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
    }

}
