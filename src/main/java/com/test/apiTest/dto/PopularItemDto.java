package com.test.apiTest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Getter
@NoArgsConstructor
public class PopularItemDto {
    private Integer id;
    private Boolean is_scrap;
    private Boolean is_wish;
    private String type;
    private ArrayList badges;
    private ArrayList benefit_badges;
    private LinkedHashMap brand;
    private Integer brand_id;
    private String brand_name;
    private Integer cost;
    private Integer delivery_type;
    private Boolean free_delivery;
    private String image_url;
    private Boolean is_bespoke;
    private Boolean is_buyable;
    private Boolean is_cheapest_price;
    private Boolean is_consultable;
    private Boolean is_delivery_date_specified;
    private Boolean is_discontinued;
    private Boolean is_discounted;
    private Boolean is_free_delivery;
    private Boolean is_hidden;
    private Boolean is_overseas_purchase;
    private Boolean is_remodel;
    private Boolean is_retail_delivery;
    private Boolean is_selling;
    private Boolean is_sold_out;
    private Boolean is_special_price;
    private Boolean is_third_party_logistic;
    private Boolean lowest_guarantee;
    private String name;
    private String original_image_url;
    private Integer original_price;
    private String raw_image_url;
    private String resized_image_url;
    private Double review_avg;
    private Integer review_count;
    private Integer scrap_count;
    private Boolean selling;
    private Integer selling_cost;
    private Integer selling_price;
    private Boolean sold_out;
    private Integer status;
    private Integer used_card_count;
    private Integer user_id;
    private Integer view_count;
    private Integer week_rank;
    private Integer wish_count;
}
