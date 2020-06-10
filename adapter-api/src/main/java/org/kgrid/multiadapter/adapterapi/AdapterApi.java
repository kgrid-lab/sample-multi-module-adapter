package org.kgrid.multiadapter.adapterapi;


import java.util.Collections;
import java.util.Map;
import org.kgrid.sandboxdependency.service.Ko;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnMissingBean(AdapterApi.class)
public interface AdapterApi {

  void init();

  Executor activate(Ko ko);

  default Map<String, String> status() {
    return Collections.singletonMap("status","hello");
  }

}
