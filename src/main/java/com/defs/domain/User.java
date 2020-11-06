package com.defs.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fuyongping
 * @date 2020-11-03 18:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User>{
    private Integer id;
    private String name;
    private String role;
    private Integer checked;
    // 该用户在排班过程中的权限值
    private Integer power;

    @Override
    public int compareTo(User o) {
       if(this.power>=o.power){
           return 1;
       }else{
           return -1;
       }
    }
}
