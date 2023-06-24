package com.ddit.IMS.Models;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Name {

    String firstName;
    String lastName;
}
