package com.dabbeg.app.entities;

import lombok.Data;
import com.dabbeg.app.enums.Environment;

@Data
public class Todo {
  private long id;
  private String name;
  private boolean checked;
  private Environment type;
}
