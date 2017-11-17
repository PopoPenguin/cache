package hello.configuration;

/*
created by PopoPenguin on 11/16/17
*/


import com.gemstone.gemfire.cache.Cache;
import com.gemstone.gemfire.cache.GemFireCache;
import hello.services.QuoteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.CacheFactoryBean;
import org.springframework.data.gemfire.LocalRegionFactoryBean;
import org.springframework.data.gemfire.support.GemfireCacheManager;

import java.util.Properties;

@Configuration
public class GemfireConfig {

    @Bean
    QuoteService quoteService() {
        return new QuoteService();
    }

    @Bean
    Properties gemfireProperties() {
        Properties gemfireProperties = new Properties();
        gemfireProperties.setProperty("name", "DataGemFireCachingApplication");
        gemfireProperties.setProperty("mcast-port", "0");
        gemfireProperties.setProperty("log-level", "config");
        return gemfireProperties;
    }

    @Bean
    CacheFactoryBean gemfireCache() {
        CacheFactoryBean gemfireCache = new CacheFactoryBean();
        gemfireCache.setClose(true);
        gemfireCache.setProperties(gemfireProperties());
        return gemfireCache;
    }

    @Bean
    LocalRegionFactoryBean<Integer, Integer> quotesRegion(GemFireCache cache) {
        LocalRegionFactoryBean<Integer, Integer> quotesRegion = new LocalRegionFactoryBean<>();
        quotesRegion.setCache(cache);
        quotesRegion.setClose(false);
        quotesRegion.setName("Quotes");
        quotesRegion.setPersistent(false);
        return quotesRegion;
    }

    @Bean
    GemfireCacheManager cacheManager(Cache gemfireCache) {
        GemfireCacheManager cacheManager = new GemfireCacheManager();
        cacheManager.setCache(gemfireCache);
        return cacheManager;
    }

}
