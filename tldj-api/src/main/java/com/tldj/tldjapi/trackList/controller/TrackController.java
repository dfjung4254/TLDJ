package com.tldj.tldjapi.trackList.controller;

import com.tldj.tldjapi.trackList.dto.TrackDto;
import com.tldj.tldjapi.trackList.entity.Track;
import com.tldj.tldjapi.trackList.service.TrackService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/track")
@RequiredArgsConstructor
public class TrackController {

  private final TrackService trackService;

  @GetMapping
  public ResponseEntity<TrackDto> getAll() {

    Track track = trackService.getTracks();
    TrackDto responseBody = TrackDto.of(track);
    responseBody.setPlayTime(33L);

    return ResponseEntity.status(HttpStatus.OK)
        .body(responseBody);
  }

  @PostMapping
  public ResponseEntity<TrackDto> create(@Valid @RequestBody TrackDto trackDto) {

    Track trackToCreate = Track.of(trackDto);
    Track newTrack = trackService.create(trackToCreate);
    TrackDto responseBody = TrackDto.of(newTrack);

    return ResponseEntity.status(HttpStatus.OK)
        .body(responseBody);
  }

}
