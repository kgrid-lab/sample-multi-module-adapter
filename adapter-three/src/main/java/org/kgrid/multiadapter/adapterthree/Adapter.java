package org.kgrid.multiadapter.adapterthree;

import java.util.Collections;
import java.util.Map;

import org.kgrid.SampleDependency.Service.Ko;
import org.kgrid.multiadapter.adapterapi.AdapterApi;
import org.kgrid.multiadapter.adapterapi.Executor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adapter implements AdapterApi {

  Logger logger = LoggerFactory.getLogger(AdapterApi.class);

  @Override
  public void init() {
    logger.info("Hello from adapter-one");

  }

  @Override
  public Executor activate(Ko ko) {
    return new Executor() {
      @Override
      public Map<String,String> execute(String input) {
        return Collections.singletonMap("output", ko.apply(input));
      }
    };
  }

  @Override
  public Map<String, String> status() {
    return Collections.singletonMap("status", "one is up");
  }
}
