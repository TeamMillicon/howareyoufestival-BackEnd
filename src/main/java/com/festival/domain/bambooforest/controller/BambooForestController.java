package com.festival.domain.bambooforest.controller;

import com.festival.common.util.ValidationUtils;
import com.festival.domain.bambooforest.dto.BamBooForestListReq;
import com.festival.domain.bambooforest.dto.BamBooForestPageRes;
import com.festival.domain.bambooforest.dto.BamBooForestReq;
import com.festival.domain.bambooforest.service.BamBooForestService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v2/bambooforest")
public class BambooForestController {

    private final BamBooForestService bambooForestService;
    private final ValidationUtils validationUtils;

    //@PreAuthorize("permitAll()")
    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<Long> createBamBooForest(@Valid BamBooForestReq bamBooForestReq) {
        validationUtils.isBamBooForestValid(bamBooForestReq);
        return ResponseEntity.ok().body(bambooForestService.createBamBooForest(bamBooForestReq));
    }

    //@PreAuthorize("hasRole({'ADMIN'})")
    @DeleteMapping(value = "/{bamBooForestId}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteBamBooForest(@PathVariable("bamBooForestId") Long bamBooForestId) {
        bambooForestService.deleteBamBooForest(bamBooForestId);
        return ResponseEntity.ok().build();
    }

    //@PreAuthorize("permitAll()")
    @GetMapping(value = "/list", produces = APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<BamBooForestPageRes> getBamBooForestList(@Valid BamBooForestListReq bamBooForestListReq) {
        return ResponseEntity.ok().body(bambooForestService.getBamBooForestList(bamBooForestListReq.getStatus(), PageRequest.of(bamBooForestListReq.getPage(), bamBooForestListReq.getSize())));
    }
}
