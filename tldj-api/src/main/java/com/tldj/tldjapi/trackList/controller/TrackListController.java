package com.tldj.tldjapi.trackList.controller;

import com.tldj.tldjapi.trackList.dto.TrackDto;
import com.tldj.tldjapi.trackList.entity.Track;
import com.tldj.tldjapi.trackList.service.TrackListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/trackList")
@RequiredArgsConstructor
public class TrackListController {

  private final TrackListService trackListService;

  @GetMapping
  public ResponseEntity<TrackDto> getAll() {

    Track track = trackListService.getTracks();
    TrackDto responseBody = TrackDto.of(track);
    responseBody.setPlayTime(33L);

    return ResponseEntity.status(HttpStatus.OK)
        .body(responseBody);
  }

}
