package com.test.apiTest.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PopularItemDto {
    private int id;
    private boolean is_scrap;
    private boolean is_wish;
    private String type;
    private String[] badges;
    private String[] benefit_badges;
    private String[] brand;
    private int brand_id;
    private String brand_name;
    private int cost;
    private int delivery_type;
    private boolean free_delivery;
    private String image_url;
    private boolean is_bespoke;
    private boolean is_buyable;
    private boolean is_cheapest_price;
    private boolean is_consultable;
    private boolean is_delivery_date_specified;
    private boolean is_discontinued;
    private boolean is_discounted;
    private boolean is_free_delivery;
    private boolean is_hidden;
    private boolean is_overseas_purchase;
    private boolean is_remodel;
    private boolean is_retail_delivery;
    private boolean is_selling;
    private boolean is_sold_out;
    private boolean is_special_price;
    private boolean is_third_party_logistic;
    private boolean lowest_guarantee;
    private String name;
    private String original_image_url;
    private int original_price;
    private String raw_image_url;
    private String resized_image_url;
    private int review_avg;
    private int review_count;
    private int scrap_count;
    private boolean selling;
    private int selling_cost;
    private int selling_price;
    private boolean sold_out;
    private int status;
    private int used_card_count;
    private int user_id;
    private int view_count;
    private int week_rank;
    private int wish_count;
}
