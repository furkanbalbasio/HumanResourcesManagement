package com.group1.dto.request;

import com.group1.utility.enums.EType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShiftRequestDto {
    EType type;
    LocalDate bSStartingDate;
    LocalDate bSEndingDate;
    LocalDate responseDate;
    double bSTotalTime;
    String token;
}
