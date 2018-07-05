package it.fabioformosa.metamorphosis.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import dev.metamorphosis.EnableMetamorphosisConversions;

@Configuration
@ComponentScan(basePackages = { "it.fabioformosa.metamorphosis" })
@EntityScan(basePackages = { "it.fabioformosa.metamorphosis.entities" })
@EnableJpaRepositories(basePackages = { "it.fabioformosa.metamorphosis.repositories" })
@EnableMetamorphosisConversions
public class MetamorphosisExampleConfig {

}
