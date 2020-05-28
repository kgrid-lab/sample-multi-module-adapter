package org.kgrid.multiadapter.adapterapi;


import java.util.Collections;
import java.util.Map;
import org.kgrid.shelf.Ko;

public interface AdapterApi {

  void init();

  Executor activate(Ko ko);

  default Map<String, String> status() {
    return Collections.singletonMap("status","hello");
  }

}
