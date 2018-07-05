package it.fabioformosa.metamorphosis.controllers;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import it.fabioformosa.metamorphosis.dto.SimpleDTO;
import it.fabioformosa.metamorphosis.services.SampleService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

  private static final Logger log = LoggerFactory.getLogger(RestController.class);

  @Resource
  private SampleService sampleService;

  @ResponseStatus(code = HttpStatus.OK)
  @RequestMapping("test")
  public SimpleDTO saveEntity() {
    SimpleDTO simpleDTO = new SimpleDTO();
    simpleDTO.setFoo("foo");
    simpleDTO.setFooBar("foo bar");
    simpleDTO = sampleService.saveEntity(simpleDTO);
    log.info("SAVED " + simpleDTO);
    return simpleDTO;
  }

}
