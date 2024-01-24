package com.codepresso.codepressoboot1.dto;

import java.util.List;

public class UserDto {
    Integer id; //Java의 제네릭 타입은 원시 타입을 허용하지 않습니다. 따라서, 컬렉션 등 제네릭을 사용하는 경우에는 Integer와 같은 래퍼 클래스를 사용해야 합니다.
    String name;
    String email;
    List<SpecialtyDto> specialties;

    public UserDto(Integer id, String name, String email, List<SpecialtyDto> specialties) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.specialties = specialties;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public List<SpecialtyDto> getSpecialties() {
        return specialties;
    }
}
