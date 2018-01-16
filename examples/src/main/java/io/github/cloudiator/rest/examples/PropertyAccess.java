package io.github.cloudiator.rest.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccess {

  private static final String PROPERTY_FILE = "examples/examples.properties";
  private static final Properties PROPERTIES;

  private PropertyAccess() {
    throw new AssertionError("Do not initialize");
  }

  static {
    File file = new File(PROPERTY_FILE);
    try (FileInputStream fileInputStream = new FileInputStream(file)) {
      Properties temp = new Properties();
      temp.load(fileInputStream);
      PROPERTIES = temp;
    } catch (IOException e) {
      throw new ExceptionInInitializerError(e);
    }
  }

  public static String basePath() {
    return PROPERTIES.getProperty("basePath");
  }

  public static String apiKey() {
    return PROPERTIES.getProperty("apiKey");
  }
}
