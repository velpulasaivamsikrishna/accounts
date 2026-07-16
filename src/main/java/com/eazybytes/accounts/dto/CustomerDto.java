package com.eazybytes.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Example;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(
        name = "Customer",
        description ="Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",
            example="Sai"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min =5,max=30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(description = "Email of the Customer", example = "sai@gmail.com")
    @NotEmpty(message = "Email address can not be null or empty")
    @Email(message = "Email Address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the Customer",
            example = "1234567890"
    )
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account Details of ")
    private AccountsDto accountsDto;
}
