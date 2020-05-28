package org.kgrid.shelf;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Ko {
  Map<String,String> rules = new HashMap<>(Map.of(
      "foo","bar",
      "apple","banana",
      "up","down",
      "left","right"
  ));

  public String id() { return UUID.randomUUID().toString(); }

  public String apply(String key) {
    return rules.get(key);
  }

}
