package it.fabioformosa.metamorphosis.converters;

import org.springframework.stereotype.Component;

import dev.metamorphosis.converters.AbstractBaseConverterToDTO;
import it.fabioformosa.metamorphosis.dto.SimpleDTO;
import it.fabioformosa.metamorphosis.entities.SimpleEntity;

@Component
public class SimpleEntityToSimpleDto extends AbstractBaseConverterToDTO<SimpleEntity, SimpleDTO> {

  @Override
  protected void convert(SimpleEntity source, SimpleDTO target) {
    target.setId(source.getId());
    target.setFoo(source.getFoo());
    target.setFooBar(source.getFoo() + " " + source.getBar());
  }

}
