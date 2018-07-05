package it.fabioformosa.metamorphosis.services;


import javax.annotation.Resource;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import it.fabioformosa.metamorphosis.dto.SimpleDTO;
import it.fabioformosa.metamorphosis.entities.SimpleEntity;
import it.fabioformosa.metamorphosis.repositories.SimpleJpaRepository;

@Component
public class SampleService {

  @Resource
  private ConversionService conversionService;

  @Resource
  private SimpleJpaRepository simpleJpaRepository;

  public SimpleDTO saveEntity(SimpleDTO simpleDTO) {
    SimpleEntity simpleEntity = conversionService.convert(simpleDTO, SimpleEntity.class);
    simpleJpaRepository.save(simpleEntity);
    simpleDTO = conversionService.convert(simpleEntity, SimpleDTO.class);
    return simpleDTO;
  }

}
