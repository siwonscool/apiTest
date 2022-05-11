package com.test.apiTest.dto;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDto {
    private List<PopularItemDto> selected_products;
}
