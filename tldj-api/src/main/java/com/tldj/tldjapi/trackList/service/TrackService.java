package com.tldj.tldjapi.trackList.service;

import com.tldj.tldjapi.trackList.entity.Track;
import com.tldj.tldjapi.trackList.repository.TrackRepository;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TrackService {

  private final TrackRepository trackRepository;

  public Track getTracks() {
    return trackRepository.findById(1L)
        .orElseGet(Track::new);
  }

  public Track create(@Valid Track track) {

    Track newTrack = trackRepository.save(track);

    return newTrack;
  }

}
