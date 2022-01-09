package com.hua.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Demo {
    @Getter
    @Setter
    private String name;

    public void nonNullExample(@NonNull Person person) {
        this.name = person.getName();
    }

    public void nullExample(Person person) {
        if (person == null) {
            return;
        }
        this.name = person.getName();
    }
}
