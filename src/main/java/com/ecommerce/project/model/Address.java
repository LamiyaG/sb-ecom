package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresses")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Street Name must be at least 5 characters long!")
    private String streetName;

    @NotBlank
    @Size(min = 2, message = "Building No must be at least 2 characters long!")
    private String buildingNo;

    @NotBlank
    @Size(min = 4, message = "City Name must be at least 4 characters long!")
    private String city;

    @NotBlank
    @Size(min = 2, message = "State Name must be at least 2 characters long!")
    private String province;

    @NotBlank
    @Size(min = 2, message = "Country Name must be at least 2 characters long!")
    private String country;

    @NotBlank
    @Size(min = 6, message = "Zip Code must be at least 6 characters long!")
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String streetName, String buildingNo, String city, String province, String country, String postalCode) {
        this.streetName = streetName;
        this.buildingNo = buildingNo;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
    }
}
