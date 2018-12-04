package com.example.springboot.jangjh.day1;

import lombok.Data;
import lombok.ToString;

@Data //toString, setter, Getter, equals, hashCode, NoArgsConstruct 모두를 포함한다.
@ToString(exclude = {"var1, var2"})
public class DataSampleVO {
    private String var1;
    private String var2;
    private String var3;
}