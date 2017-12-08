package edu.cnm.deepdive.androidhelloworld;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonWrapper<T> {

  @JsonProperty("_embedded")
  JsonList<T> embedded;

  public JsonList<T> getEmbedded() {
    return embedded;
  }

  public void setEmbedded(JsonList<T> embedded) {
    this.embedded = embedded;
  }
}
