package it.fabioformosa.metamorphosis.converters;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import it.fabioformosa.metamorphosis.dto.SimpleDTO;
import it.fabioformosa.metamorphosis.entities.SimpleEntity;
import it.fabioformosa.metamorphosis.jpa.converters.AbstractBaseConverterToEntity;
import it.fabioformosa.metamorphosis.repositories.SimpleJpaRepository;

@Component
public class SimpleDtoToSimpleEntity extends AbstractBaseConverterToEntity<SimpleDTO, SimpleEntity> {

  @Resource
  private SimpleJpaRepository simpleJpaRepository;

  @Override
  protected void convert(SimpleDTO source, SimpleEntity target) {
    target.setFoo(source.getFoo());

    String bar = Optional.ofNullable(source.getFooBar()).map(fooBar -> fooBar.split(" "))
        .map(split -> split.length > 1 ? split[1] : null).orElse(null);
    target.setBar(bar);
  }

  @Override
  protected JpaRepository<SimpleEntity, Long> getRepository() {
    return simpleJpaRepository;
  }

}
