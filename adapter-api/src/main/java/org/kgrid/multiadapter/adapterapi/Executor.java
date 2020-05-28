package org.kgrid.multiadapter.adapterapi;

import java.util.Collections;
import java.util.Map;

public interface Executor {

  default Map<String,String> execute(String input) {
    return Collections.singletonMap("greeting", "Hello");
  }

}
