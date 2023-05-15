package com.festival.domain.info.festivalEvent.data.dto;

import com.festival.domain.info.festivalEvent.data.entity.FestivalEvent;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FestivalEventListRes {

    private Long id;
    private String title;
    private String subTitle;
    private String mainFilePath;
    private Boolean festivalEventState;


    @Builder
    public FestivalEventListRes(Long id, String title, String subTitle, String mainFilePath, Boolean festivalEventState) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.mainFilePath = mainFilePath;
        this.festivalEventState = festivalEventState;
    }
    public static FestivalEventListRes of(FestivalEvent festivalEvent, String filePath){

        return FestivalEventListRes.builder()
                .id(festivalEvent.getId())
                .title(festivalEvent.getTitle())
                .subTitle(festivalEvent.getSubTitle())
                .mainFilePath(festivalEvent.getFestivalEventImage().getMainFileName())
                .festivalEventState(festivalEvent.getFestivalEventState())
                .build();
    }
}