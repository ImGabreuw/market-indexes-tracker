package br.com.gabreuw.marketindexestracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MarketIndexesTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketIndexesTrackerApplication.class, args);
    }

}
