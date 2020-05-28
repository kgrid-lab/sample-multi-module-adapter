package org.kgrid.multiadapter.adapterone;

import java.util.Collections;
import java.util.Map;
import org.kgrid.multiadapter.adapterapi.AdapterApi;
import org.kgrid.multiadapter.adapterapi.Executor;
import org.kgrid.shelf.Ko;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adapter implements AdapterApi {

  Logger logger = LoggerFactory.getLogger(Adapter.class);

  @Override
  public void init() {
    logger.info("Hello from adapter-two");

  }

  @Override
  public Executor activate(Ko ko) {
    return new Executor() {
      @Override
      public Map<String, String> execute(String input) {
        return Collections.singletonMap("output", ko.apply(input));
      }
    };
  }

  @Override
  public Map<String, String> status() {
    return Collections.singletonMap("status","two is up");
  }

}
