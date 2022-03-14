package com.tldj.tldjapi.trackList.service;

import com.tldj.tldjapi.trackList.entity.Track;
import com.tldj.tldjapi.trackList.repository.TrackListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TrackListService {

  private final TrackListRepository trackListRepository;

  public Track getTracks() {
    return trackListRepository.findById(1L)
        .orElseGet(Track::new);
  }



}
