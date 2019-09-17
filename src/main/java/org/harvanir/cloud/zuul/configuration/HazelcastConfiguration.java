package org.harvanir.cloud.zuul.configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.config.MaxSizeConfig.MaxSizePolicy;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import io.github.bucket4j.grid.GridBucketState;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** @author Harvan Irsyadi */
@Configuration
public class HazelcastConfiguration {

  @Bean
  public Config hazelcastConfig() {
    MapConfig mapConfig =
        new MapConfig()
            .setName("configuration")
            .setMaxSizeConfig(new MaxSizeConfig(0, MaxSizePolicy.FREE_HEAP_SIZE))
            .setEvictionPolicy(EvictionPolicy.LRU)
            .setBackupCount(0)
            .setTimeToLiveSeconds(1);

    Config config = new Config();
    config.addMapConfig(mapConfig);

    return config;
  }

  @Qualifier("RateLimit")
  @Bean
  public IMap<String, GridBucketState> rateLimit(List<HazelcastInstance> hazelcastInstances) {
    return hazelcastInstances.get(0).getMap("rate-limit");
  }
}
