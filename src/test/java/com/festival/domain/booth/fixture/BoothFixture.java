package com.festival.domain.booth.fixture;

import com.festival.domain.booth.model.Booth;
import com.festival.domain.booth.model.BoothStatus;
import com.festival.domain.booth.model.BoothType;
import com.festival.domain.util.TestImageUtils;

import java.util.List;

import static com.festival.domain.booth.model.BoothStatus.OPERATE;
import static com.festival.domain.util.TestImageUtils.generateMockImageFile;

public class BoothFixture {

    public static Booth FOOD_TRUCK = Booth.builder()
            .title("푸드트럭 게시물 제목")
            .subTitle("푸드트럭 게시물 부제목")
            .status(OPERATE)
            .content("푸드트럭 게시물 내용")
            .longitude(50)
            .latitude(50)
            .type(BoothType.FOOD_TRUCK)
            .build();


    public static Booth PUB = Booth.builder()
            .title("푸드트럭 게시물 제목")
            .subTitle("푸드트럭 게시물 부제목")
            .status(OPERATE)
            .content("푸드트럭 게시물 내용")
            .longitude(50)
            .latitude(50)
            .type(BoothType.FOOD_TRUCK)
            .build();

    public static final Booth FLEA_MARKET = Booth.builder()
            .title("푸드트럭 게시물 제목")
            .subTitle("푸드트럭 게시물 부제목")
            .status(OPERATE)
            .content("푸드트럭 게시물 내용")
            .longitude(50)
            .latitude(50)
            .type(BoothType.FOOD_TRUCK)
            .build();
}
