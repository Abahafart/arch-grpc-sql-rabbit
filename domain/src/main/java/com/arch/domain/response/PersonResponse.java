package com.arch.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponse {

  private String trackId;
  private String name;
  private String email;
  private Integer age;
  private String state;
  private Long id;

}
